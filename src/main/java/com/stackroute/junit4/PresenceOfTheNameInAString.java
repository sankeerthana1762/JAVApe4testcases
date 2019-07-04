package com.stackroute.junit4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfTheNameInAString {

    public boolean presenceOfName(String input) {

        Pattern p = Pattern.compile("Harry");   // the pattern to search for
        p.matcher(input);

        if (p.matcher(input).find()) {
            return true;
        } else {
            return false;

        }
    }
}