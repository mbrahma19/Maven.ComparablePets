package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class TestIOConsoleString {

    private IOConsole IOConsole;


    @Test
    public void test1() {
        test("Spot");
    }

    @Test
    public void test2() {
        test("Charlie");
    }

    @Test
    public void test3() {
        test("Dog306");
    }

    @Test
    public void test4() {
        test("Something");
    }


    private void test(String input) {
        // Given
        String expected = input;
        this.IOConsole = getConsoleWithBufferedInput(input);

        // When
        String actual = IOConsole.getStringInput("");

        // Then
        Assert.assertEquals(actual, expected);
    }

    private IOConsole getConsoleWithBufferedInput(String inputString) {
        byte[] inputBytes = inputString.getBytes();
        ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
        Scanner scanner = new Scanner(inputByteArray);
        IOConsole console = new IOConsole(scanner, System.out);
        return  console;
    }
}
