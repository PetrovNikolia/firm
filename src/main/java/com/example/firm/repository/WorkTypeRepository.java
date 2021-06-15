package com.example.firm.repository;

import com.example.firm.entity.WorkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface WorkTypeRepository extends JpaRepository<WorkType, UUID> {

    Optional<WorkType> findByName(String name);
}
