package com.stackroute.junit4;

public class AlphabeticalOrderOfText {
    public String sortedlist(String input){
        String[]  splitedstring=input.split(" ");
         String s2="";
        for (int i = 0; i < splitedstring.length; i++)
        {
            for (int j = i + 1; j < splitedstring.length; j++)
            {
                if (splitedstring[i].compareTo(splitedstring[j])>0)
                {
                    String temp = splitedstring[i];
                    splitedstring[i] = splitedstring[j];
                    splitedstring[j] = temp;
                }
            }
        }
        for (int i = 0; i < splitedstring.length ; i++) {
          s2 = s2.concat(splitedstring[i]+" ");

        }
        return s2.trim();
    }


}

