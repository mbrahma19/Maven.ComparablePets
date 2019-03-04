package io.zipcoder;

import java.util.Arrays;

public class Controller {

    Owner petOwner;
    IOConsole console;

    public Controller(){
        petOwner = new Owner();
        console = new IOConsole();
    }

    public void start(){
        Integer numberOfPets = console.getIntegerInput("Hello, how many pets do you have?");
        int i = 0;
        while(i < numberOfPets){
            String typeOfPet = console.getStringInput("What type is your pet?\n"+Arrays.toString(PetEnum.values()));
            String petName = console.getStringInput("What is your pet's name?");
            PetEnum enumeration = PetEnum.getValueOf(typeOfPet);
            Pet petInstance = enumeration.create(petName);
            Integer petAge = console.getIntegerInput("What is the age of your pet?");
            petInstance.setAge(petAge);
            petOwner.addPet(petInstance);
            i++;
        }

        console.println(String.format("These are your pets.\n %s",petOwner.toString()));

    }

}
