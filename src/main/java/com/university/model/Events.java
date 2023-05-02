package com.university.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Events {
    @Id
    private int eventId;
    private String eventName;
    private String locationOfEvent;
    private String date;
    private String  startTime;
    private String  endTime;
}
