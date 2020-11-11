package com.example.demo.service;

import com.example.demo.entities.Event;
import com.example.demo.entities.Speaker;
import com.example.demo.repository.SpeakerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpeakerEventService {

    private final SpeakerRepository speakerRepository;

    public SpeakerEventService(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Transactional
    public void insertSpeakerEvent(){
        Speaker speaker1 = new Speaker("Thomas", 23, "Java");
        Speaker speaker2 = new Speaker("Tom", 23, "Python");
        Speaker speaker3 = new Speaker("Tim", 23, "Angular");

        Event event1 = new Event("JavaOne", "USA");
        Event event2 = new Event("PyDev", "India");
        Event event3 = new Event("WebDev", "Japan");

        speaker1.addEvents(event1);
        speaker1.addEvents(event2);
        speaker1.addEvents(event3);

        speaker2.addEvents(event2);
        speaker3.addEvents(event3);

        speakerRepository.save(speaker1);
        speakerRepository.save(speaker2);
        speakerRepository.save(speaker3);
    }
}
