package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class TestTurtle {
    @Test
    public void defaultConstructorTest() {
        // Given
        Turtle testTurtle = new Turtle();

        // When
        String expectedName = "SparklesIDontKnow";

        // Then

        String actualName = testTurtle.getName();
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void nameConstructorTest2() {
        // Given
        Turtle testTurtle = new Turtle("Fred");

        // When
        String expectedName = "Fred";

        // Then

        String actualName = testTurtle.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nameConstructorTest() {
        // Given
        Turtle testTurtle = new Turtle("Sparky");

        // When
        String expectedName = "Sparky";

        // Then

        String actualName = testTurtle.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        Turtle testTurtle = new Turtle();

        // When
        String expectedName = "Turbo";
        testTurtle.setName(expectedName);

        // Then

        String actualName = testTurtle.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest2() {
        // Given
        Turtle testTurtle = new Turtle();

        // When
        String expectedName = "Squirtle";
        testTurtle.setName(expectedName);

        // Then

        String actualName = testTurtle.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        // Given
        Turtle testTurtle = new Turtle();

        // When
        String expectedSound = "EeEeeh";
        String actualSound = testTurtle.speak();

        // Then

        Assert.assertEquals(actualSound, expectedSound);
    }
}

