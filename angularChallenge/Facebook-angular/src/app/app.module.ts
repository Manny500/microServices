import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
 
import {AppComponent} from './app.component';
import {CustomerFormComponent} from './customer-form/customer-form.component';
import {CustomerService} from './customer.service';
import { FaceuserFormComponent } from './faceuser-form/faceuser-form.component';
import { FaceuserService } from './faceuser.service';
 
@NgModule({
  declarations: [
    AppComponent,
    CustomerFormComponent,
    FaceuserFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [CustomerService, FaceuserService],
  bootstrap: [AppComponent]
})
export class AppModule {}