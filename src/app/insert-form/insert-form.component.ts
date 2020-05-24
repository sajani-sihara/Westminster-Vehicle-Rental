import { Component, OnInit } from "@angular/core";
import { DataServiceService } from "../Service/data-service.service";

export class Schedule {
  scheduleID: string;
  customerID: string;
  vehiclePlateNum: string;
  pickUpDate: Date;
  dropOffDate: Date;
  constructor() {}
}

@Component({
  selector: "app-insert-form",
  templateUrl: "./insert-form.component.html",
  styleUrls: ["./insert-form.component.css"]
})
export class InsertFormComponent implements OnInit {
  schedule: Schedule;
  schedules: Schedule;
  scheduleID;
  vehiclePlateNum;
  dropOffDate;
  pickUpDate;
  customerID;
  Data: Object;

  constructor(private service: DataServiceService) {}

  ngOnInit() {}

  CreateSchedule() {
    var userInput = true;
    const scheduleIDField = (<HTMLInputElement>(
      document.getElementById("scheduleIDFieldInput")
    )).value;
    console.log(scheduleIDField.length);
    this.scheduleID = scheduleIDField;
    this.vehiclePlateNum;
    this.dropOffDate;
    this.pickUpDate;
    this.customerID;
    var customerIDField = (<HTMLInputElement>(
      document.getElementById("customerIDFieldInput")
    )).value;
    var pickUpDateField = (<HTMLInputElement>(
      document.getElementById("pickUpDateFieldInput")
    )).value;
    var dropOffDateField = (<HTMLInputElement>(
      document.getElementById("dropOffDateFieldInput")
    )).value;
    var vehiclePlateNumField = (<HTMLInputElement>(
      document.getElementById("plateNumberFieldInput")
    )).value;
    if (scheduleIDField.length <= 0) {
      alert("Please enter the schedule ID.");
      userInput = false;
    } else if (customerIDField.length <= 0) {
      alert("Please enter the customer ID.");
      userInput = false;
    } else if (pickUpDateField.length <= 0) {
      alert("Please enter the pick up date.");
      userInput = false;
    } else if (dropOffDateField.length <= 0) {
      alert("Please enter the drop off date.");
      userInput = false;
    } else if (pickUpDateField > dropOffDateField) {
      alert("End date should be greater than start date.");
      userInput = false;
    } else if (vehiclePlateNumField.length <= 0) {
      alert("Please enter the vehicle ID.");
      userInput = false;
    }

    if (userInput) {
      var text = "A booking with schedule ID ";
      text += scheduleIDField;
      text += " has been made. The vehicle with plate number ";
      text += vehiclePlateNumField;
      text += " will be picked up on the ";
      text += pickUpDateField;
      text += " and dropped off on the ";
      text += dropOffDateField;
      text += ".";
      alert(text);
      this.schedule = new Schedule();
      this.schedule.scheduleID = this.scheduleID;
      this.schedule.customerID = this.customerID;
      this.schedule.vehiclePlateNum = this.vehiclePlateNum;
      this.schedule.pickUpDate = this.pickUpDate;
      this.schedule.dropOffDate = this.dropOffDate;
      console.log(JSON.stringify(this.schedule));
      this.service.CreateSchedule(this.schedule).subscribe(
        Response => console.log(Response),
        error => console.log(error)
      );
    }
  }
}
