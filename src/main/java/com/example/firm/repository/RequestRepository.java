package com.example.firm.repository;

import com.example.firm.entity.Request;
import com.example.firm.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface RequestRepository extends JpaRepository<Request, UUID> {
}