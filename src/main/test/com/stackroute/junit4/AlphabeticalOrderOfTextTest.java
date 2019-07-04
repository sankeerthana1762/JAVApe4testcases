package com.stackroute.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabeticalOrderOfTextTest {
    AlphabeticalOrderOfText obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new AlphabeticalOrderOfText();
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
    public void givenCharacterShouldReturnLastThreeCharacterRepetition() {
        //Act

        String result = obj.sortedlist("i am sankeerthana");
        //Assert
        assertEquals( "am i sankeerthana", result);

    }


}