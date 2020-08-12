package com.codedifferently;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

public class RemoveCharFromString {
  //  private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

    public String remove(String word, char unwanted){
        String[] letters = word.split("");
        String result = "";
        for(String letter: letters){
            if(!letter.equals(Character.toString(unwanted))){
            result += letter;
            }}
        return result;
    }

    /*Extra Credit Flex*/
    public String removeRecursive(String word, char ch){
        int unwantedindex = word.indexOf(Character.toString(ch));
        if(unwantedindex > word.length() || unwantedindex < 0 ){
            return word;
        }
        else{
            String newword = word.substring(0,unwantedindex) + word.substring(unwantedindex+1, word.length());
        return removeRecursive(newword, ch);
    }
}}
