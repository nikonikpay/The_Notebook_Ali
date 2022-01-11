package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNoteBook
    {
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;

    private List<Animal> animals;
    private List<Plant> plants ;

    public ForestNoteBook()
        {
        carnivores = new ArrayList<Carnivore>();
        omnivores = new ArrayList<Omnivore>();
        herbivores =  new ArrayList<Herbivore>();
        animals = new ArrayList<Animal>();
        plants = new ArrayList<Plant>();

        }

    public List<Carnivore> getCarnivores()
        {
        return carnivores;
        }

    public List<Omnivore> getOmnivores()
        {
        return omnivores;
        }

    public List<Herbivore> getHerbivores()
        {
        return herbivores;
        }

    public List<Animal> getAnimals()
        {
        return animals;
        }

    public List<Plant> getPlants()
        {
        return plants;
        }

    public int getPlantCount()
        {
        return plantCount;
        }

    public int getAnimalCount()
        {
        return animalCount;
        }

    public void setCarnivores(List<Carnivore> carnivores)
        {
        this.carnivores = carnivores;
        }

    public void setOmnivores(List<Omnivore> omnivores)
        {
        this.omnivores = omnivores;
        }

    public void setHerbivores(List<Herbivore> herbivores)
        {
        this.herbivores = herbivores;
        }

    public void addAnimal(Animal animal)
        {

        if (!animals.contains(animal))
            {
            animals.add(animal);
            animalCount++;
            }
        if (animal instanceof Carnivore)
            {
            carnivores.add((Carnivore) animal);
            }
        if (animal instanceof Omnivore)
            {
            omnivores.add((Omnivore) animal);
            }
        if (animal instanceof Herbivore)
            {
            herbivores.add((Herbivore) animal);
            }

        }

    public void addPlant(Plant plant)
        {
        if (!plants.contains(plant))
            {
            plants.add(plant);
            plantCount++;
            }


        }

    public void printNoteBook()
        {
        System.out.println("You encountered the following things in the forest: ");
        carnivores.forEach(System.out::println);
        omnivores.forEach(System.out::println);
        herbivores.forEach(System.out::println);
        animals.forEach(System.out::println);
        plants.forEach(System.out::println);


        }

    public void sortAnimalsByName()
        {
        animals.sort(Comparator.comparing(Animal::getName));
        carnivores.sort(Comparator.comparing(Animal::getName));
        omnivores.sort(Comparator.comparing(Animal::getName));
        herbivores.sort(Comparator.comparing(Animal::getName));

        }

    public void sortPlantsByName()
        {
        plants.sort(Comparator.comparing(Plant::getName));

        }

    public void sortAnimalsByHeight()
        {
        animals.sort(Comparator.comparing(Animal::getHeight).reversed());
        carnivores.sort(Comparator.comparing(Animal::getHeight).reversed());
        herbivores.sort(Comparator.comparing(Animal::getHeight).reversed());
        omnivores.sort(Comparator.comparing(Animal::getHeight).reversed());
        }

    public void sortPlantsByHeight()
        {
        plants.sort(Comparator.comparing(Plant::getHeight).reversed());
        }


    }
