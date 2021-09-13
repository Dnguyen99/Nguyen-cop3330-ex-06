/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package com.company;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("What is your current age? ");
        int currentAge = scan.nextInt();
        System.out.println("At what age would you like to retire? ");
        int retireAge = scan.nextInt();

        int yearsLeft = retireAge - currentAge;
        System.out.println("You have " +yearsLeft+ " years left until you can retire.");

        int retireYear = currentYear + yearsLeft;
        System.out.println("It's " +currentYear+ ", so you can retire in " +retireYear+ ".");
    }
}
