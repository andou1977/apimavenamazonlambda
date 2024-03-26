package org.example.repository;

import org.example.entity.Cliententity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Cliententity,Integer> {
}
