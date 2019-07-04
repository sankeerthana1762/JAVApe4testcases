package com.stackroute.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceOfTheNameInAStringTest {
    PresenceOfTheNameInAString obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new PresenceOfTheNameInAString();
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

        boolean result = obj.presenceOfName("This is Harry");
        //Assert
        assertEquals( true, result);

    }
    @Test
    public void givenStringShouldReturnFalse() {
        //Act

        boolean result = obj.presenceOfName("This is Herry");
        //Assert
        assertEquals( false, result);

    }
    @Test
    public void givenStringShouldReturnNull() {
        //Act

        boolean result = obj.presenceOfName("");
        //Assert
        assertNotNull( null, result);

    }




}