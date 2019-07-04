package com.stackroute.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfStringTest {
    TransposeOfString obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new TransposeOfString();
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
    public void givenStringShouldReturnTransposeOfString() {
        //Act

        String result = obj.transposeOfString("i am sankeerthana");
        //Assert
        assertEquals( "i ma anahtreeknas", result);

    }
    @Test
    public void givenStringShouldReturnNull() {
        //Act

        String result = obj.transposeOfString("");
        //Assert
        assertNotNull( null, result);

    }



}