import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
 
import {AppComponent} from './app.component';
import {CustomerFormComponent} from './customer-form/customer-form.component';
import {CustomerService} from './customer.service';
import { NewsComponent } from './news/news.component';
 
@NgModule({
  declarations: [
    AppComponent,
    CustomerFormComponent,
    NewsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule {}