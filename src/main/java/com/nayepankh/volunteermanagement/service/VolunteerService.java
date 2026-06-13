package com.nayepankh.volunteermanagement.service;

import com.nayepankh.volunteermanagement.entity.Volunteer;
import com.nayepankh.volunteermanagement.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerService {

    @Autowired
    private VolunteerRepository volunteerRepository;

    public Volunteer saveVolunteer(Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }

    public List<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

    public void deleteVolunteer(Long id) {
        volunteerRepository.deleteById(id);
    }

    public List<Volunteer> searchVolunteer(String name){
        return volunteerRepository.findByNameContainingIgnoreCase(name);
    }
}