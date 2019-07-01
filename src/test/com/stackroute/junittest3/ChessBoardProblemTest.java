package com.stackroute.junittest3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChessBoardProblemTest {

    ChessBoardProblem obj;
    @Before
    public void setUp() throws Exception {

        obj=new ChessBoardProblem();
    }

    @After
    public void tearDown() throws Exception {

        obj=null;
    }

    @Test
    public void chessBoardPattern1() {

        String res=obj.printChessBoard();

        assertEquals("WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n",res);

    }
    @Test
    public void chessBoardPattern2()
    {

        String res=obj.printChessBoard();

        assertEquals("BB WW BB WW \n" +
                "BB WW BB WW \n" +
                "BB WW BB WW \n" +
                "BB WW BB WW \n",res);
    }

    @Test
    public void chessBoardPattern3()
    {

        String res=obj.printChessBoard();

        assertEquals("BB WW \n" +
                         "BB WW \n",res);
}
}