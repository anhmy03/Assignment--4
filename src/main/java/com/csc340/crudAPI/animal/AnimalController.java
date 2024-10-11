package com.csc340.crudAPI.animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    // Get all animals
    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    // Get animal by ID
    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable int id) {
        return animalService.getAnimalById(id);
    }

    // Add new animal
    @PostMapping("/new")
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }

    // Update existing animal
    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
        animal.setAnimalId(id);
        return animalService.updateAnimal(animal);
    }

    // Delete animal by ID
    @DeleteMapping("/delete/{id}")
    public void deleteAnimal(@PathVariable int id) {
        animalService.deleteAnimal(id);
    }

    // Get animals by species
    @GetMapping("/species/{species}")
    public List<Animal> getAnimalsBySpecies(@PathVariable String species) {
        return animalService.getAnimalsBySpecies(species);
    }

    // Get animals by name containing a string
    @GetMapping("/search")
    public List<Animal> getAnimalsByName(@RequestParam String name) {
        return animalService.getAnimalsByName(name);
    }
}
