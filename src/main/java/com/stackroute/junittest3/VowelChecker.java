package com.stackroute.junittest3;
import java.lang.*;

public class VowelChecker
{
    //method
    public String[] checking(String string[])
    {
        //for loop begins here
        for (int i = 0; i < string.length; i++)
        {

            string[i] = string[i].replaceAll("[aeiou]", "");
        }//for loop ends here

            return string;//returning string array
    }
}
