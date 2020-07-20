package com.example.demo.sc.repository;

import com.example.demo.sc.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Persons, Long> {
}
