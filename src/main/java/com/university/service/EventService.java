package com.university.service;

import com.university.model.Events;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private static List<Events> events = new ArrayList<>();



    public List<Events> getallevents() {
        return events;
    }

    public Events getEventbyId(int id) {
        Events ev = events.get(id);
        return ev;

    }

    public void addevent(Events eventDetails) {
        events.add(eventDetails);
    }

    public void deletebyid(int id) {
        events.remove(id);
    }
    public void updateEvent(Events eventdetails, int id) {
        Events updatevent = getEventbyId(id);
        updatevent.setEventName(eventdetails.getEventName());
        updatevent.setLocationOfEvent(eventdetails.getLocationOfEvent());
        updatevent.setDate(eventdetails.getDate());
        updatevent.setStartTime(eventdetails.getStartTime());
        updatevent.setEndTime(eventdetails.getEndTime());
    }

}
