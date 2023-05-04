package com.example.UniversityEventManagement.Service;

import com.example.UniversityEventManagement.Model.Event;
import com.example.UniversityEventManagement.Repo.IEventRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepo iEventRepo;
    public void save(Event event) {
        iEventRepo.save(event);

    }
    @Transactional
    public void update(String event, Integer eventId) {
        iEventRepo.updateEventName(event,eventId);
    }

    @Transactional
    public void delete(Integer eventId) {
        iEventRepo.deleteById(eventId);
    }

    public List<Event> getAll() {
        return iEventRepo.getEventsByDate();
    }
}
