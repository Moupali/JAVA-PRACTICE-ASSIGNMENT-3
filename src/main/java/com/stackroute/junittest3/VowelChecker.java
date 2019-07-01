package com.stackroute.junittest3;
import java.lang.*;

public class VowelChecker {
    public String[] checking(String input[]) {
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].replaceAll("[aeiou]", "");
        }
            return input;
    }
}
