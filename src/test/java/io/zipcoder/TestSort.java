package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class TestSort {
    @Test
    public void sortPetsTest() {
        // Given
        Owner testOwner = new Owner();
        testOwner.addPet(new Cat("Rainbow"));
        testOwner.addPet(new Turtle("Red"));
        testOwner.addPet(new Dog("Orange"));
        testOwner.addPet(new Cat("Violet"));

        // When
        Pet[] actualPets = testOwner.getPets();

        // Then
        Pet[] expectedPets = new Pet[]{new Dog("Orange"), new Cat("Rainbow"), new Turtle("Red"), new Cat("Violet")};

        Assert.assertEquals(expectedPets, actualPets);
    }

    @Test
    public void sortPetsTest2() {
        // Given
        Owner testOwner = new Owner();
        testOwner.addPet(new Cat("Begin"));
        testOwner.addPet(new Turtle("Start"));
        testOwner.addPet(new Dog("First"));
        testOwner.addPet(new Cat("First"));

        // When
        Pet[] actualPets = testOwner.getPets();

        // Then
        Pet[] expectedPets = new Pet[]{new Cat("Begin"), new Dog("First"), new Cat("First"), new Turtle("Start")};

        Assert.assertEquals(expectedPets, actualPets);
    }

    @Test
    public void comparatorTest() {
        // Given
        Pet[] testPets = new Pet[]{new Cat("Begin"), new Dog("First"), new Cat("First"), new Turtle("Start")};
        Comparator petComparator = new PetComparator();

        // When
        Pet[] actualPets = petComparator.sort(testPets);


        // Then
        Pet[] expectedPets = new Pet[]{new Dog("First"), new Turtle("Start"), new Cat("First"), new Cat("First")};

        Assert.assertEquals(expectedPets, actualPets);
    }

    @Test
    public void comparatorTest2() {
        // Given
        Pet[] testPets = new Pet[]{new Cat("Laptop"), new Dog("Other"), new Turtle("Desktop"), new Turtle("Windows")};
        Comparator petComparator = new PetComparator();

        // When
        Pet[] actualPets = petComparator.sort(testPets);


        // Then
        Pet[] expectedPets = new Pet[]{new Dog("Other"), new Turtle("Desktop"),  Turtle("Windows"), new Cat("Laptop")};

        Assert.assertEquals(expectedPets, actualPets);
    }
}
