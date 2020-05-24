package com.example.app.Controller;

import com.example.app.Modal.Car;
import com.example.app.Modal.Schedule;
import com.example.app.Repository.CarRepository;
import com.example.app.Repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/vehicles")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    @GetMapping("/car")
    public Iterable<Car> getCar(){
        return (carRepository.findAll());
    }

    @PostMapping
    public Car insert(@RequestBody Car car){
        return this.carRepository.save(car);
    }

    @PostMapping("/schedule")
    public Schedule InsertCar(@Valid @RequestBody Schedule schedule){
        System.out.println(schedule);
        return this.scheduleRepository.save(schedule);
    }
    @GetMapping("/car/make/{vehicleMake}")
    public String getVehicleMake(@PathVariable(value="vehicleMake") String vehicleMake)
    {
        return vehicleMake;
    }

}
