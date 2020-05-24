import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../Service/data-service.service';
import { HttpClient } from '@angular/common/http';

interface getMotorbikeList{
  vehiclePlateNum: String;
  vehicleMake: String;
  vehicleModel: String;
  vehicleColour: String;
  vehicleRegNum: String;
  vehicleRatePerDay: number;
  bikeCategory: String;
  bikeCoolingSystem: String;
}

@Component({
  selector: 'app-book-motorbike',
  templateUrl: './book-motorbike.component.html',
  styleUrls: ['./book-motorbike.component.css']
})
export class BookMotorbikeComponent implements OnInit {

  constructor(private service : DataServiceService,
    private http:HttpClient) { }

  getMotorbikeLists:getMotorbikeList[] = [];


  ngOnInit() {
    var url ="http://localhost:8080/vehicless/motorbike";

     this.http.get<getMotorbikeList[]>(url).subscribe(data=>{
      this.getMotorbikeLists= data;
     });
     }

}
