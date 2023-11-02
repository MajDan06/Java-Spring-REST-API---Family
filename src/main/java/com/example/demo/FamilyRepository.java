package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FamilyRepository extends JpaRepository<FamilyDB, Long> {

    Optional<FamilyDB> findById(Long id);

    Iterable<FamilyDB> findByNameAndOrigin(String name, String origin);

    @Query(value = "SELECT * FROM family where name=?1 and origin=?2", nativeQuery = true)
    List<FamilyDB> findByName(String name, String origin);
}
