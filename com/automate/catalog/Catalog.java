package com.automate.catalog;

import com.automate.birds.Birds;
import com.automate.dogs.Dogs;
import com.automate.fish.Fish;

import java.util.Scanner;

public class Catalog {
        private static Birds birds = new Birds();
        private static Dogs dogs = new Dogs();
        private static Fish fish = new Fish();
        private static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
       printListOfPets();
    }


    public static void printListOfPets() {
        System.out.println("Fish"+fish.typeOfFish() + "\nDogs\n"+dogs.dogsList()+"\nBirds"+birds.availableBirds());
        String animalName = sc.next().toLowerCase();
        switch (animalName) {
            case "birds":
                System.out.println(birds.listOfProducts());
                break;
            case "dogs":
                System.out.println(dogs.typesOfDogs());
                break;
            case "fish":
                System.out.println(fish.freshWaterFish()+fish.saltWaterFish());
                break;
            default:
                System.out.println("Enter valid name");
        }
    }
}

