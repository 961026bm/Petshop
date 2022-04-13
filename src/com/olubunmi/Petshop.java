package com.olubunmi;

import java.util.List;

public class Petshop {
    private String petshopName;
    private List<Pet> availablePets;
    private List<Pet> soldPets;
    private String petId;

    public Petshop (String petshopName) {
        this.petshopName = petshopName;
        // what do i to === Inside, we’ll initialize both of our ArrayLists as empty.
    }
    public String getPetshopName() {
        return petshopName;
    }
    public List<Pet> getAvailablePets() {
        return availablePets;
    }
    public List<Pet> getSoldPets() {
        return soldPets;
    }
    public String getPetId() {
        return petId;
    }
    public void setPetshopName(String petshopName) {
        this.petshopName = petshopName;
    }
    public void setAvailablePets(List<Pet> availablePets) {
        this.availablePets = availablePets;
    }
    public void setSoldPets(List<Pet> soldPets) {
        this.soldPets = soldPets;
    }
    public void setPetId(String petId) {
        this.petId = petId;
    }

    public void buyPet(){

    }
    public void returnPet() {

    }
    public void inventory() {
        for (int i = 0; i < availablePets.size();) {
            System.out.println(availablePets.get(i));
        }
    }
}

/*
* Create a Petshop class.
This class will have 3 properties to start. String petshopName, List<Pet> availablePets, List<Pet> soldPets.

We’ll need to create a constructor for this Petshop class, but it’ll be a bit different than a traditional constructor.

Our constructor will pass in a petshopName ONLY as a constructor parameter. Inside, we’ll initialize both of our ArrayLists as empty.

Create getters and setters by hand.

Add a buyPet() method and a returnPet() method. Hint: you may have to go back to the Pet class and give it a petId property that will be a unique identifier.
*/