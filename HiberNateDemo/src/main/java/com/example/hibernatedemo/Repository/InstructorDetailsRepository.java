package com.example.hibernatedemo.Repository;

import com.example.hibernatedemo.Entity.InstructorDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorDetailsRepository extends JpaRepository<InstructorDetails,Integer> {
}
