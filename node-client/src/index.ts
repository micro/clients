import * as request from "request-promise-native";

const defaultLocal = "http://localhost:8080/client";
const defaultLive = "https://api.micro.mu/client";

export interface Options {
  token?: string;
  // Address of the micro platform.
  // By default it connects to live. Change it or use the local flag
  // to connect to your local installation.
  address?: string;
  // Helper flag to help users connect to the default local address
  local?: boolean;
}

export interface ClientRequest {
  // eg. "go.micro.srv.greeter"
  service: string;
  // eg. "Say.Hello"
  endpoint: string;
  // json and then base64 encoded body
  body: string;
}

export interface ClientResponse {
  // json and base64 encoded response body
  body: string;
}

export class MicroClient {
  public options: Options = {
    address: defaultLive
  };

  constructor(options?: Options) {
    if (options) {
      this.options = options;
    }
    if (options && options.local) {
      this.options.address = defaultLocal;
    }
  }

  // Call enables you to access any endpoint of any service on 1Backend
  call<R>(service: string, endpoint: string, req?: any): Promise<R> {
    return new Promise<R>(async (resolve, reject) => {
      try {
        // example curl: curl -XPOST -d '{"service": "go.micro.srv.greeter", "endpoint": "Say.Hello"}'
        //  -H 'Content-Type: application/json' http://localhost:8080/client {"body":"eyJtc2ciOiJIZWxsbyAifQ=="}
        const serviceReq: ClientRequest = {
          service: service,
          endpoint: endpoint,
          body: Buffer.from(JSON.stringify(req)).toString("base64")
        };
        var options: request.RequestPromiseOptions = {
          method: "POST",
          json: true,
          headers: {
            micro_token: this.options.token
          },
          body: serviceReq
        };
        (options as any).uri = this.options.address;

        const result: ClientResponse = await request.post(
          this.options.address as string,
          options
        );
        console.log(result.body);
        resolve(JSON.parse(Buffer.from(result.body, "base64").toString()));
      } catch (e) {
        reject(e);
      }
    });
  }
}
