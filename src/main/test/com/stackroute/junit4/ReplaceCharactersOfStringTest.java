package com.stackroute.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersOfStringTest {
    ReplaceCharactersOfString obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new ReplaceCharactersOfString();
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

        String result = obj.replaceCharacter("daily dry");
        //Assert
        assertEquals( "faity fry", result);

    }


}