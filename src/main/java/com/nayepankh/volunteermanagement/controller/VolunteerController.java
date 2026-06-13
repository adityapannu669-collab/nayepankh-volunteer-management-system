package com.nayepankh.volunteermanagement.controller;

import com.nayepankh.volunteermanagement.entity.Volunteer;
import com.nayepankh.volunteermanagement.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/volunteers")
@CrossOrigin("*")
public class VolunteerController {

    @Autowired
    private VolunteerService volunteerService;

    @PostMapping
    public Volunteer saveVolunteer(@RequestBody Volunteer volunteer) {
        return volunteerService.saveVolunteer(volunteer);
    }

    @GetMapping
    public List<Volunteer> getAllVolunteers() {
        return volunteerService.getAllVolunteers();
    }

    @DeleteMapping("/{id}")
    public String deleteVolunteer(@PathVariable Long id) {
        volunteerService.deleteVolunteer(id);
        return "Volunteer Deleted Successfully";
    }

    @GetMapping("/search")
    public List<Volunteer> searchVolunteer(@RequestParam String name){
        return volunteerService.searchVolunteer(name);
    }
}