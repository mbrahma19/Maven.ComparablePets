package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestSort {
    @Test
    public void sortPetsTest() {
        // Given
        Owner testOwner = new Owner();
        Pet orange = new Dog("Orange");
        Pet rainbow = new Cat("Rainbow");
        Pet red = new Turtle("Red");
        Pet violet = new Cat("Violet");

        testOwner.addPet(rainbow);
        testOwner.addPet(red);
        testOwner.addPet(orange);
        testOwner.addPet(violet);

        PetComparator pc = new PetComparator();

        Arrays.sort(testOwner.getPets(),pc);
        // When
        Pet[] actualPets = testOwner.getPets();

        // Then
        Pet[] expectedPets = new Pet[]{orange, rainbow, violet, red};

        Assert.assertEquals(expectedPets, actualPets);
    }

    @Test
    public void sortPetsTest2() {
        // Given
        Owner testOwner = new Owner();
        Cat begin = new Cat("Begin");
        Turtle start = new Turtle("Start");
        Dog first = new Dog("First");
        Cat first2 = new Cat("First");

        testOwner.addPet(begin);
        testOwner.addPet(start);
        testOwner.addPet(first);
        testOwner.addPet(first2);

        PetComparator pc = new PetComparator();

        Arrays.sort(testOwner.getPets(),pc);
        // When
        Pet[] actualPets = testOwner.getPets();

        // Then
        Pet[] expectedPets = new Pet[]{first, begin, first2,start};

        Assert.assertEquals(expectedPets, actualPets);
    }

    @Test
    public void comparatorTest2() {
        // Given
        Owner testOwner = new Owner();
        Cat laptop = new Cat("Laptop");
        Dog other = new Dog("Other");
        Turtle desktop = new Turtle("Desktop");
        Turtle windows = new Turtle("Windows");

        testOwner.addPet(laptop);
        testOwner.addPet(other);
        testOwner.addPet(desktop);
        testOwner.addPet(windows);

        Comparator petComparator = new PetComparator();


        // When
        Arrays.sort(testOwner.getPets(),petComparator);
        Pet[] actualPets = testOwner.getPets();

        // Then
        Pet[] expectedPets = new Pet[]{other, laptop, desktop, windows};

        Assert.assertEquals(expectedPets, actualPets);
    }
}
