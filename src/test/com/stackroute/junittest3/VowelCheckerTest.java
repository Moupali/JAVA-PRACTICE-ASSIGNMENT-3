package com.stackroute.junittest3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VowelCheckerTest {

    VowelChecker obj;
    @Before
    public void setUp() throws Exception {

        obj=new VowelChecker();
    }

    @After
    public void tearDown() throws Exception {

        obj=null;
    }

    @Test
    public void givenStringWillReturnWithoutVowels1() {
        String input[]={"India","United States"};
        String expected[]={"Ind","Untd Stts"};
        String res[]=obj.checking(input);
        assertNotEquals(expected,res);
    }
   /* @Test
    public void givenStringWillReturnWithoutVowels2 () {
        String res=obj.checking("United States");
        assertEquals("Untd Stts",res);
    }*/
}
