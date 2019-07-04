package com.stackroute.junit4;

public class OccurenceOfCharacterInString {
    public int occurenceOfChar(String input) {
     int charcount;
        if (input == null) {
            return 0;
        }
        else if (input.contains("a")){
             charcount = input.length() - input.replaceAll("s", "").length();
            return charcount;

        }
        else{
            return 0;
        }

    }
}