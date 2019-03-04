package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class TestOwner {
        @Test
        public void defaultConstructorTest() {
            // Given
            Owner testOwner = new Owner();

            // When
            String expectedName = "Marshilla";

            // Then

            String actualName = testOwner.getName();

            Assert.assertEquals(expectedName, actualName);
        }

    @Test
    public void parameterConstructorTest() {
        // Given
        Owner testOwner = new Owner("Cinderella");

        // When
        String expectedName = "Cinderella";

        // Then

        String actualName = testOwner.getName();

        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void parameterConstructorTest2() {
        // Given
        Owner testOwner = new Owner("Disney");

        // When
        String expectedName = "Disney";

        // Then

        String actualName = testOwner.getName();

        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void addPetTest() {
        // Given
        Owner testOwner = new Owner();
        testOwner.addPet(new Cat("Rainbow"));
        testOwner.addPet(new Turtle("Red"));
        testOwner.addPet(new Dog("Orange"));
        testOwner.addPet(new Cat("Violet"));

        // When
        Integer expectedPetNumber = 4;

        // Then

        Integer actualPetNumber = testOwner.getPetNumber();

        Assert.assertEquals(expectedPetNumber, actualPetNumber);
    }

    @Test
    public void addPetTest2() {
        // Given
        Owner testOwner = new Owner();
        testOwner.addPet(new Cat("Rainbow"));
        testOwner.addPet(new Turtle("Red"));

        // When
        Integer expectedPetNumber = 2;

        // Then

        Integer actualPetNumber = testOwner.getPetNumber();

        Assert.assertEquals(expectedPetNumber, actualPetNumber);
    }

    @Test
    public void getPetsTest() {
        // Given
        Owner testOwner = new Owner();
        testOwner.addPet(new Cat("Rainbow"));
        testOwner.addPet(new Turtle("Red"));
        testOwner.addPet(new Dog("Orange"));
        testOwner.addPet(new Cat("Violet"));

        // When
        Pet[] actualPets = testOwner.getPets();

        // Then
        Pet[] expectedPets = new Pet[]{new Cat("Rainbow"), new Turtle("Red"), new Dog("Orange"), new Cat("Violet")};

        Assert.assertEquals(expectedPets, actualPets);
    }

    @Test
    public void getPetsTest2() {
        // Given
        Owner testOwner = new Owner();
        testOwner.addPet(new Cat("Sunshine"));
        testOwner.addPet(new Turtle("Rain"));


        // When
        Pet[] actualPets = testOwner.getPets();

        // Then
        Pet[] expectedPets = new Pet[]{new Cat("Sunshine"), new Turtle("Rain")};

        Assert.assertEquals(expectedPets, actualPets);
    }

}
