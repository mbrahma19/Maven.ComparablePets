package io.zipcoder;

import java.util.function.Function;

public enum PetEnum {

    DOG(Dog::new),
    CAT(Cat::new),
    TURTLE(Turtle::new);

    private final Function<String,Pet> function;

    PetEnum(Function<String, Pet> function){
        this.function = function;
    }

    public static PetEnum getValueOf(String userInput) {
        userInput = userInput.toUpperCase();
        try {
            return valueOf(userInput);
        } catch (IllegalArgumentException iae) {
            return valueOf(userInput.replaceAll(" ", "_"));
        }
    }

    public Pet create(String input) {
        return function.apply(input);
    }
}
