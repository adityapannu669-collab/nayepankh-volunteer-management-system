package com.nayepankh.volunteermanagement.repository;

import com.nayepankh.volunteermanagement.entity.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
    List<Volunteer> findByNameContainingIgnoreCase(String name);
}