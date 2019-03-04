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
        Pet rainbow = new Cat("Rainbow");
        Pet red = new Turtle("Red");
        Pet orange = new Dog("Orange");
        Pet violet = new Cat("Violet");

        testOwner.addPet(rainbow);
        testOwner.addPet(red);
        testOwner.addPet(orange);
        testOwner.addPet(violet);

        // When
        Pet[] actualPets = testOwner.getPets();

        // Then
        Pet[] expectedPets = new Pet[]{rainbow, red, orange, violet};

        Assert.assertEquals(expectedPets, actualPets);
    }

    @Test
    public void getPetsTest2() {
        // Given
        Owner testOwner = new Owner();
        Pet sunshine = new Cat("Sunshine");
        Pet rain = new Turtle("Rain");

        testOwner.addPet(sunshine);
        testOwner.addPet(rain);

        // When
        Pet[] actualPets = testOwner.getPets();

        // Then
        Pet[] expectedPets = new Pet[]{sunshine, rain};

        Assert.assertEquals(expectedPets, actualPets);
    }

}
