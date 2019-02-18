package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class TestDog {
    @Test
    public void defaultConstructorTest() {
        // Given
        Dog testDog = new Dog();

        // When
        String expectedName = "Lola";

        // Then

        String actualName = testDog.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nameConstructorTest() {
        // Given
        Dog testDog = new Dog("Spot");

        // When
        String expectedName = "Spot";

        // Then

        String actualName = testDog.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        Dog testDog = new Dog();

        // When
        String expectedName = "SunShine";
        testDog.setName(expectedName);

        // Then

        String actualName = testDog.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest2() {
        // Given
        Dog testDog = new Dog();

        // When
        String expectedName = "DogName";
        testDog.setName(expectedName);

        // Then

        String actualName = testDog.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        // Given
        Dog testDog = new Dog();

        // When
        String expectedSound = "Woof";
        String actualSound = testDog.speak();

        // Then

        Assert.assertEquals(expectedSound, actualSound);
    }
}
