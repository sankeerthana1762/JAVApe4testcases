package com.stackroute.junit4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurencesOfGivenWord {
    public int occurenceOfWord(String input, String word) {
        if (input == null) {
            return 0;
        }


        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher(input);
        int count = 0;
        while (m.find()) {
            count += 1;
        }
        return count;
    }

}