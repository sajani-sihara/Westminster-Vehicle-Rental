package com.example.app.Repository;

import com.example.app.Modal.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule,String> {
}
