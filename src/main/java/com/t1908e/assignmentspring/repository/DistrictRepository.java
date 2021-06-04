package com.t1908e.assignmentspring.repository;

import com.t1908e.assignmentspring.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {
    District findDistrictByNameContains(String name);
}
