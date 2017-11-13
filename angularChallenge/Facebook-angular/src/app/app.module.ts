import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
 
import {AppComponent} from './app.component';
import {CustomerFormComponent} from './customer-form/customer-form.component';
import {CustomerService} from './customer.service';
import { NewsComponent } from './news/news.component';
import { FaceuserFormComponent } from './faceuser-form/faceuser-form.component';
import { FaceuserService } from './faceuser.service';
import { AppRoutingModule } from './app-routing.module';
import { NewsService } from './news/news.service';
import { HttpModule } from '@angular/http';
 
@NgModule({
  declarations: [
    AppComponent,
    CustomerFormComponent,
    NewsComponent,
    FaceuserFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    HttpModule
  ],
  providers: [CustomerService, FaceuserService, NewsService],
  bootstrap: [AppComponent]
})
export class AppModule {}