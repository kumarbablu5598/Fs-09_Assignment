package com.university.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Events {
    private int eventId;
    private String eventName;
    private String locationOfEvent;
    private String date;
    private String  startTime;
    private String  endTime;
}
