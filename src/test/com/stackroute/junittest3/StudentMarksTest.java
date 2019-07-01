package com.stackroute.junittest3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks obj = new StudentMarks();

    @Before
    public void setUp() throws Exception {

        obj = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void givenStringShouldReturnErrorMessage() {
        int studentGrades[] = {98, 190, 99, 77};
        int Result = obj.studentsGrades(4, studentGrades);
        assertEquals(0, Result);
    }

    @Test
    public void givenStringShouldReturn1() {
        int studentGrades[] = {98, 80, 99, 77};
        int Result = obj.studentsGrades(4, studentGrades);
        assertEquals(1, Result);
    }
}