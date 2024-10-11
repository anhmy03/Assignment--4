package com.csc340.crudAPI.animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.species = :species")
    List<Animal> findBySpecies(String species);

    List<Animal> findByNameContaining(String keyword);
}
