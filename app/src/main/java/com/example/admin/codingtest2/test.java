package com.example.admin.codingtest2;

/**
 * Created by Admin on 10/6/2017.
 */

public class test {

    public static String f (String s) {
        char[] chars = s.toCharArray();
        String result = "";

        for( int i = 0; i < chars.length; i++ ) {
            if(chars[i] > 64 && chars[i] < 91) {
                int start = (int) 'A';
                int end = (int) 'Z';
                int distance = chars[i] - start;
                int encodedChar = end - distance;
                result += (char) encodedChar;
            } else if (chars[i] > 96 && chars[i] < 123) {
                int start = (int) 'a';
                int end = (int) 'z';
                int distance = chars[i] - start;
                int encodedChar = end - distance;
                result += (char) encodedChar;
            } else
                result += chars[i];
        }

        return result;
    }

    public static void g (String g) {
        char[] alphabet = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
        'u','v','w','x','y','z'};

        char[] input = g.toLowerCase().toCharArray();
        String[] output = new String [26];

        for( int i = 0; i < alphabet.length; i++ ) {
            int count = 0;

            for( int j = 0; j < input.length; j++ ) {
                if( alphabet[i] == input[j])
                    count++;
            }

            output[i] = alphabet[i] + ":" + count;
        }

        for(String s: output)
            System.out.println( s );
    }

    public static void main(String[] args) {
        System.out.println( f( "acp" ) );
        System.out.println( f( "Errors in strategy cannot be correct through tactical maneuvers." ) );
        g( "Hello there! Apple!" );
    }
}
