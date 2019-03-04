package io.zipcoder;

import java.util.ArrayList;

public class Owner {

    private String name;
    private ArrayList<Pet> petList;

    public Owner(){
     this.name = "Marshilla";
     this.petList = new ArrayList<Pet>();
    }

    public Owner(String name){
        this.name = name;
        this.petList = new ArrayList<Pet>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPetNumber() {
        return petList.size();
    }

    public void addPet(Pet petToAdd){
        petList.add(petToAdd);
    }

    public Pet[] getPets(){
        return petList.toArray(new Pet[petList.size()]);
    }
}
