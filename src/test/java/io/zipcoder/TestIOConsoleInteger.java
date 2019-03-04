package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class TestIOConsoleInteger {
    private IOConsole IOConsole;

    @Test
    public void test1() {
        test("0", 0);
    }

    @Test
    public void test2() {
        test("1", 1);
    }

    @Test
    public void test3() {
        test("98", 98);
    }


    private void test(String input,Integer expected) {
        // Given
        this.IOConsole = getConsoleWithBufferedInput(input);

        // When
        Integer actual = IOConsole.getTypeOfAnimal("");

        // Then

        Assert.assertEquals(actual, expected);
    }

    private IOConsole getConsoleWithBufferedInput(String inputString) {
        byte[] inputBytes = inputString.getBytes();
        ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
        Scanner scanner = new Scanner(inputByteArray);
//        IOConsole IOConsole = new IOConsole(scanner, System.out);
        IOConsole console=null;
        return  console;
    }
}
