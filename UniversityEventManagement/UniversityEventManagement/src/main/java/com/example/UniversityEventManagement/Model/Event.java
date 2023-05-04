package com.example.UniversityEventManagement.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "event")
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "event_id")
    private Integer eventId;
    @Column(name = "event_name")
    private String eventName;
    private String locationOfEvent;
    private String date;
    private String startTime;
    private String endTime;
}
