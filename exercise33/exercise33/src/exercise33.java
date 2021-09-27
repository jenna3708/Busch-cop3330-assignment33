/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.util.Scanner;

public class exercise33 {
    public static void main(String[] args) {

        System.out.println("What's your question? >");

        //create a scanner
        Scanner input = new Scanner(System.in);
        String question = input.next();

        String[] answer = new String[4];
        answer[0] = "Yes.";
        answer[1] = "No.";
        answer[2] = "Maybe.";
        answer[3] = "Ask again later.";

        int random = (int)(Math.random()*4);
        System.out.println((random));

        System.out.println(answer[random]);

    }
}


