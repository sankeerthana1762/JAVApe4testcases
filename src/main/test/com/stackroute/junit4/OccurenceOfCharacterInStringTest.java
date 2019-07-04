package com.stackroute.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceOfCharacterInStringTest {
    OccurenceOfCharacterInString obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new OccurenceOfCharacterInString();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }

    @Test
    public void givenStringShouldReturnTrue() {
        //Act

        int result = obj.occurenceOfChar("she sells seashells from the seashore");
        //Assert
        assertEquals( 8 , result);

    }

    @Test
    public void givenStringShouldReturnNull() {
        //Act

        int result = obj.occurenceOfChar("");
        //Assert
        assertEquals( 0 , result);

    }
    @Test
    public void givenStringShouldReturnZero() {
        //Act

        int result = obj.occurenceOfChar("kite");
        //Assert
        assertEquals( 0 , result);

    }






}