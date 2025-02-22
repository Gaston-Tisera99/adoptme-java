package com.adoptme.petshop.repositories;

import com.adoptme.petshop.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetsRepository extends JpaRepository<Pet, Long> {
}