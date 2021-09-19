package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Dice Roller V1 - Simple single dice
        /*
        Random rand = new Random();
        int theRoll = rand.nextInt(6) + 1; //random number from 1 to 6
        System.out.println(theRoll);
         */

        //v2 - roll two dice
        /*
        int total = 0;
        Random rand1 = new Random();
        Random rand2 = new Random();
        int die1 = rand1.nextInt(6) + 1;
        int die2 = rand2.nextInt(6) + 1;
        total = die1 + die2;
        System.out.println("You rolled " + die1 + " and " + die2 + " for a total of " + total + ".");
        if(die1 == die2){
            System.out.println("You got doubles! Go straight to jail, do not collect $200!");
        }

         */
        /*
        //v3 - lots of dice
        int total = 0;
        int[] dice = new int[5]; //"[]" designates arrays, [5] designates 5 items in array(5 dice rolled)
        for(int i = 0; i < 5; i++){ //starts at 0, loops until it reaches 5 where 5 is NOT greater than 5
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }
        String msg = "";
        for(int j = 0; j < dice.length; j++) //keep variables different for sanity
        {
            msg += "you rolled a " + dice[j] + "\n";
            System.out.println(msg);
            total += dice[j];
        }
        System.out.println("Your total is " + total + ".");

         */

        //v4 - enhanced for loop
        /*
        int total = 0;
        int[] dice = new int[6];
        for(int i = 0; i < 6; i++){
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }

        String msg = "";
        // for(int j = 0; j < dice.length; j++)
        for(int die: dice) { //same as code above
            msg += "you rolled a " + die + "\n";
            System.out.println(msg);
            total += die;
        }
        System.out.println("your total is " + total);

         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("How many die do you want to roll?");
        int numDie = input.nextInt();
        int total = 0;
        int[] dice = new int[numDie];

        for(int i = 0; i < numDie; i++){
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }

        String msg = "";
        // for(int j = 0; j < dice.length; j++)
        for(int die: dice) { //same as code above
            msg += "you rolled a " + die + "\n";
            System.out.println(msg);
            total += die;
        }

         */

        //v6 - prompt for number of sides
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides are on the die you want to roll?");
        int numSides = input.nextInt();
        int total = 0;
        int[] dice = new int[5];

        for(int i = 0; i < 5; i++){
            Random rand = new Random();
            dice[i] = rand.nextInt(numSides) + 1;
        }

        String msg = "";
        // for(int j = 0; j < dice.length; j++)
        for(int die: dice) { //same as code above
            msg += "you rolled a " + die + " on a " + numSides + " sided die.\n";
            System.out.println(msg);
            total += die;
        }
        //code not uploading, push test 1
    }
}
