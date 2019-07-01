package com.stackroute.junittest3;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers obj=new ConsecutiveNumbers();

    @Before
    public void setUp() {
        System.out.println("Before");


    }

    @After
    public void tearDown() {
        System.out.println("After");

    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");


    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass");


    }

    @Test
    public void givenStringShouldReturnConsecutiveNumbers() {
        //arrange
        ConsecutiveNumbers obj=new ConsecutiveNumbers();
        //Act
        String result = obj.consecutivecheck("15,16,17");
        //Assert
        String expectedValue = "The numbers are consecutive";
        assertEquals(expectedValue,result);
    }
    @Test
    public void givenStringShouldReturnNotaConsecutiveNumbers() {
        //arrange
        ConsecutiveNumbers obj=new ConsecutiveNumbers();
        //Act
        String result = obj.consecutivecheck("15,19,25");
        //Assert
        String expectedValue = "The numbers are not consecutive";
        assertEquals(expectedValue,result);
    }
    @Test
    public void givenStringShouldReturnConsecutiveNumbersfornegativeValues() {
        //arrange
        ConsecutiveNumbers obj=new ConsecutiveNumbers();
        //Act
        String result = obj.consecutivecheck("-1,-2,-3");
        //Assert
        String expectedValue = "The numbers are consecutive";
        assertEquals(expectedValue,result);
    }
    @Test
    public void givenStringShouldReturnNotConsecutiveNumbersfornegativeValues() {
        //arrange
        ConsecutiveNumbers consecutiveNumbersCheck=new ConsecutiveNumbers();
        //Act
        String result = consecutiveNumbersCheck.consecutivecheck("-1,-6,-11");
        //Assert
        String expectedValue = "The numbers are consecutive";
        assertNotEquals(expectedValue,result);
    }


}