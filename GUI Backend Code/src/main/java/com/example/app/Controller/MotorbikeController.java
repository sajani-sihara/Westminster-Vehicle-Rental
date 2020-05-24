package com.example.app.Controller;

import com.example.app.Modal.Motorbike;
import com.example.app.Modal.Schedule;
import com.example.app.Repository.MotorbikeRepository;
import com.example.app.Repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/vehicless")
public class MotorbikeController {
    @Autowired
    private MotorbikeRepository motorbikeRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;

    public MotorbikeController(MotorbikeRepository motorbikeRepository) {
        this.motorbikeRepository = motorbikeRepository;
    }

    @GetMapping("/motorbike")
    public Iterable<Motorbike> getMotorbike(){
        return (motorbikeRepository.findAll());
    }

    @PostMapping
    public Motorbike insert(@RequestBody Motorbike motorbike){
        return this.motorbikeRepository.save(motorbike);
    }


    @PostMapping("/schedule")
    public Schedule InsertMotorbike(@Valid @RequestBody Schedule schedule){
        System.out.println(schedule);
        return this.scheduleRepository.save(schedule);
    }

}
