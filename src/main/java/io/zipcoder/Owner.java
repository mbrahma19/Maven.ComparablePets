package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Owner {

    private String name;
    private Pet[] petList;

    public Owner(){
     this.name = "Marshilla";
     this.petList = new Pet[0];
    }

    public Owner(String name){
        this.name = name;
        this.petList = new Pet[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPetNumber() {
        return petList.length;
    }

    public void addPet(Pet petToAdd){
        ArrayList<Pet> list = new ArrayList(Arrays.asList(petList));
        list.add(petToAdd);
        petList = list.toArray(new Pet[list.size()-1]);
    }

    public Pet[] getPets(){
        return this.petList;
    }

    @Override
    public String toString() {
        return name +
                "," + Arrays.toString(petList);
    }
}
