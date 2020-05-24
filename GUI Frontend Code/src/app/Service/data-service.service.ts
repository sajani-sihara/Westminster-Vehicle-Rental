import { Injectable } from "@angular/core";
import {
  HttpClient,
  HttpClientModule,
  HttpHeaders
} from "@angular/common/http";
import { Schedule } from "../insert-form/insert-form.component";
import { Car } from "../book-car/book-car.component";
import { Observable } from 'rxjs';

@Injectable({
  providedIn: "root"
})
export class DataServiceService {
  private httpOptions = {
    headers: new HttpHeaders({
      "Content-Type": "application/json"
    })
  };
  
  constructor(private http: HttpClient) {}

  CreateSchedule(schedule: Schedule) {
    return this.http.post(
      "http://localhost:8080/vehicles/schedule",
      schedule
    );
  }
  
   getCars(): Observable<any>{
    return this.http.get<Car[]>('http://localhost:8080/vehicles/car');
  }
  
  getCarMakes(vehicleMake: String): Observable<any>{
    return this.http.get<Car[]>(`http://localhost:8080/vehicles/car/make/${vehicleMake}`);
  }
  
}
