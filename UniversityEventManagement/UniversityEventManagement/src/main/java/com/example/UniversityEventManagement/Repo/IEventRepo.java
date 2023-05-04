package com.example.UniversityEventManagement.Repo;

import com.example.UniversityEventManagement.Model.Event;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<Event,Integer> {

    @Modifying
    @Query(value = "update event set event_name=:event where event_id=:eventId", nativeQuery = true )
    public void updateEventName(String event, Integer eventId);

    @Modifying
    @Query(value = "select * from EVENT ORDER BY DATE ",nativeQuery = true)
    List<Event> getEventsByDate();
}
