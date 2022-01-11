package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal
    {
    private Set<Plant> plantDiet;

    public Herbivore(String name)
        {
        this(name,1,1,1);
        }

    public Herbivore(String name, double weight, double height, double length)
        {
        super(name, weight, height, length);
        Set<Plant> plantDiet = new HashSet<>();
        }

    public Set<Plant> getPlantDiet()
        {
        return plantDiet;
        }


    public void setPlantDiet(Set<Plant> plantDiet)
        {
        this.plantDiet = plantDiet;
        }

    public void addPlantToDiet(Plant plant)
        {
        plantDiet.add(plant);
        }

    public void printDiet()
        {
        System.out.println("The diet of this animal is the following");
        plantDiet.forEach(System.out::println);
        }

    @Override
    public String toString()
        {
        return "Herbivore{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", plantDiet=" + plantDiet +
                "} " + super.toString();
        }
    }
