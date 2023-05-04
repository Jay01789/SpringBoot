package com.example.UniversityEventManagement.Controller;

import com.example.UniversityEventManagement.Model.Event;
import com.example.UniversityEventManagement.Service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping(value = "/save-Event")
    void save(@RequestBody Event event){
        eventService.save(event);
    }

    @PutMapping(value = "/update/event/{event}/{id}")
    void update(@PathVariable String event,@PathVariable String id){
        Integer eventId = Integer.parseInt(id);
        eventService.update(event,eventId);
    }

    @DeleteMapping(value = "/delete-event/{id}")
    void deleteById(@PathVariable String id){
        Integer eventId = Integer.parseInt(id);
        eventService.delete(eventId);
    }

    @GetMapping(value = "/getevents")
    public List<Event> getEventsByDate(){
        return eventService.getAll();
    }


}
