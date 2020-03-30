#!/bin/bash -e

SRC_DIR="$1"
DST_DIR="$2"

if [ "x${SRC_DIR}" = "x" ]; then
  echo "missing src dir";
  exit 1;
fi
if [ "x${DST_DIR}" = "x" ]; then
  echo "missing dst dir";
  exit 1;
fi

mkdir -p $DST_DIR

CORE_DIRS="broker client registry router runtime store auth network"

for CORE_DIR in $CORE_DIRS; do
  FILES=$(find $SRC_DIR/$CORE_DIR -type f -name "*.proto" -a ! -name "test.proto");
  # | sed 's|service/proto/||g' | sed 's|proto/||g');
  for SRC_FILE in $FILES; do
    DST_FILE=$(echo $SRC_FILE | sed "s|$SRC_DIR/||g" | sed "s|service/proto/||g")
    mkdir -p $DST_DIR/$(dirname $DST_FILE);
    cp $SRC_FILE $DST_DIR/$DST_FILE;
    sed -i 's|service/proto/||g' $DST_DIR/$DST_FILE;
    sed -i '/option go_package/d' $DST_DIR/$DST_FILE;
  done
done
