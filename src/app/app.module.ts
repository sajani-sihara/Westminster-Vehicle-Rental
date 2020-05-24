import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookCarComponent } from './book-car/book-car.component';
import { BookMotorbikeComponent } from './book-motorbike/book-motorbike.component';
import { HomePageComponent } from './home-page/home-page.component';
import { InsertFormComponent } from './insert-form/insert-form.component';
import { HttpClientModule } from '@angular/common/http';
import { MotorbikeFormComponent } from './motorbike-form/motorbike-form.component';

@NgModule({
  declarations: [
    AppComponent,
    BookCarComponent,
    BookMotorbikeComponent,
    HomePageComponent,
    InsertFormComponent,
    MotorbikeFormComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
