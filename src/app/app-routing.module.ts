import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BookCarComponent} from './book-car/book-car.component';
import {BookMotorbikeComponent} from './book-motorbike/book-motorbike.component';
import {HomePageComponent} from './home-page/home-page.component';
import { InsertFormComponent } from './insert-form/insert-form.component';
import { MotorbikeFormComponent } from './motorbike-form/motorbike-form.component';
const routes: Routes = [
 
  {
    path:'',
    component: HomePageComponent
  },
  {
    path: "home",
    component:HomePageComponent
  },
  {
    path: "book-car",
    component:BookCarComponent
  },
  {
    path: "book-motorbike",
    component:BookMotorbikeComponent
  },
  {
    path:'form-car',
    component: InsertFormComponent
  },
  {
    path:'form-motorbike',
    component: MotorbikeFormComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
