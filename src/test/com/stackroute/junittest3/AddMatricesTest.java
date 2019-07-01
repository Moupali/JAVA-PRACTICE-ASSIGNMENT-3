package com.stackroute.junittest3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddMatricesTest {

    AddMatrices obj;
    @Before
    public void setUp() throws Exception {

        obj=new AddMatrices();
    }

    @After
    public void tearDown() throws Exception {

        obj=null;
    }

    @Test
    public void matrixSumtest() {
        int[][] Matrix1={{1,2,4},{1,2,4}};
        int[][] Matrix2={{12,2,6},{5,2,4}};

        String res=obj.addition(2,3,Matrix1,Matrix2);
        assertEquals("13 17 27 \n" +
                "6 10 18 \n",res);
    }
    @Test
    public void matrixSumtest2() {
        int[][] Matrix1={{1,2,4},{1,2,4},{3,5,1}};
        int[][] Matrix2={{12,2,6},{5,2,4},{4,6,1}};

        String res=obj.addition(3,3,Matrix1,Matrix2);
        assertEquals("13 17 27 \n" +
                "6 10 18 \n" +
                "7 18 20 \n",res);
    }
}
