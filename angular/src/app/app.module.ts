import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ClientService } from './client.service';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule
  ],
  exports: [ClientService],
  providers: [ClientService],
  bootstrap: [AppComponent]
})
export class ClientModule { }
