package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class TestCat {
    @Test
    public void defaultConstructorTest() {
        // Given
        Cat testCat = new Cat();

        // When
        String expectedName = "SparklesIDontKnow";

        // Then

        String actualName = testCat.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nameConstructorTest() {
        // Given
        Cat testCat = new Cat("Sparky");

        // When
        String expectedName = "Sparky";

        // Then

        String actualName = testCat.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nameConstructorTest2() {
        // Given
        Cat testCat = new Cat("ElectricBoogaloo");

        // When
        String expectedName = "ElectricBoogaloo";

        // Then

        String actualName = testCat.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        Cat testCat = new Cat();

        // When
        String expectedName = "NotSparkles";
        testCat.setName(expectedName);

        // Then

        String actualName = testCat.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest2() {
        // Given
        Cat testCat = new Cat();

        // When
        String expectedName = "OtherName";
        testCat.setName(expectedName);

        // Then

        String actualName = testCat.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        // Given
        Cat testCat = new Cat();

        // When
        String expectedSound = "Meow";
        String actualSound = testCat.speak();

        // Then

        Assert.assertEquals(expectedSound, actualSound);
    }
}

