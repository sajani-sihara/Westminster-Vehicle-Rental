import { Component, OnInit } from "@angular/core";
import { DataServiceService } from "../Service/data-service.service";
import { HttpClient } from "@angular/common/http";

export class Car {
  constructor(
    public vehiclePlateNum: string,
    public vehicleMake: string,
    public vehicleModel: string,
    public vehicleColour: string,
    public vehicleRegNum: string,
    public vehicleRatePerDay: number,
    public carBodyDesc: string,
    public carEngineDesc: string,
    public carTransmission: string
  ) {}
}

interface getCarList {
  vehiclePlateNum: String;
  vehicleMake: String;
  vehicleModel: String;
  vehicleColour: String;
  vehicleRatePerDay: number;
  carBodyDesc: String;
  carEngineDesc: String;
  carTransmission: String;
}

@Component({
  selector: "app-book-car",
  templateUrl: "./book-car.component.html",
  styleUrls: ["./book-car.component.css"]
})
export class BookCarComponent implements OnInit {
  constructor(private service: DataServiceService, private http: HttpClient) {}

  getCarLists: getCarList[] = [];
  filterMake: any;
  cars: Car[] = [];
  carMake: Car[] = [];

  ngOnInit() {
    var url = "http://localhost:8080/vehicles/car";

    this.http.get<getCarList[]>(url).subscribe(data => {
      this.getCarLists = data;
    });

    this.service.getCars().subscribe(Response => {
      this.cars = Response;
      this.carMake = this.cars;
      this.cars = this.cars.filter(
        (item, position, list) =>
          position === list.findIndex(i => i.vehicleMake === item.vehicleMake)
      );
    });
  }

  selectedMake() {
    this.service
      .getCarMakes(this.filterMake.vehicleMake)
      .subscribe(Response => {
        this.cars = Response;
      });
     
  }
}

//create an interfcae
//create an array that holds the same interface
//greate get request for that onterface
//equal that response data for the array
