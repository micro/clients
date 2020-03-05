import { NgModule } from "@angular/core";
import { ClientComponent } from "./client.component";
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [ClientComponent],
  imports: [HttpClientModule],
  exports: [ClientComponent],
  providers: []
})
export class ClientModule {}
