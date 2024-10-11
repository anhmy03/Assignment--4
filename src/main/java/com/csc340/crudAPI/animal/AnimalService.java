package com.csc340.crudAPI.animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    // Get all animals
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    // Get animal by ID
    public Optional<Animal> getAnimalById(int id) {
        return animalRepository.findById(id);
    }

    // Add new animal
    public Animal addAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    // Update existing animal
    public Animal updateAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    // Delete animal by ID
    public void deleteAnimal(int id) {
        animalRepository.deleteById(id);
    }

    // Get animals by species
    public List<Animal> getAnimalsBySpecies(String species) {
        return animalRepository.findBySpecies(species);
    }

    // Get animals by name containing a string
    public List<Animal> getAnimalsByName(String name) {
        return animalRepository.findByNameContaining(name);
    }
}
