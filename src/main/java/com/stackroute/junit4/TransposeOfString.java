package com.stackroute.junit4;

public class TransposeOfString {

    public String transposeOfString(String input) {
      if(input==null){
          return null;
      }
        String reverseWord="";

        String words[]=input.split(" ");

        for(String w:words){

            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord= reverseWord+sb.toString()+" ";

        }
        return reverseWord.trim();
    }
}
