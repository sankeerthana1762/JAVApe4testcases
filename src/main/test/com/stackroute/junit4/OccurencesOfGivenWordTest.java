package com.stackroute.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurencesOfGivenWordTest {
    OccurencesOfGivenWord obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new OccurencesOfGivenWord();
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

        int result = obj.occurenceOfWord("she sells seashells from the seashore","se");
        //Assert
        assertEquals( 3 , result);

    }
    @Test
    public void givenStringShouldReturnNull() {
        //Act

        int result = obj.occurenceOfWord("","se");
        //Assert
        assertEquals( 0, result);

    }



}