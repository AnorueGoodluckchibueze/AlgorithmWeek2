package org.example;
//Task
//        An ATM only has 100, 50 and 20 dollar bills (USD) available to be dispensed.
//        Given an amount between 40 and 10000 dollars (inclusive) and assuming that
//        the ATM wants to use as few bills as possible,
//        determinate the minimal number of 100, 50 and 20 dollar bills the ATM needs
//        to dispense (in that order).
//        Here is the specification for the withdraw method you'll complete:
//        withdraw(amount)
//        Parameters
//        amount: Integer - Amount of money to withdraw. Assume that the amount is always divisible into
//        100, 50 and 20 bills.
//        Return Value
//        Array (of Integers) - An array of 3 integers representing the number of 100, 50 and 20 dollar bills needed to complete
//        the withdraw (in that order).
//        Constraints
//        40 ≤ amount ≤ 10000


import java.util.Arrays;
import java.util.List;
//Step 1
//if the money is greater than or equal to 100 remove 100 continuously (while) until it is not
//Step 2
//if I can not divide the money by 20 without having a remainder, and it is also greater than or equal to 50,
// remove 50 continuously (while)
//Step 3
//if it is greater than or equal 20 remove 20 continuously until it is less than 20
// **this operation should also happen if it is divisible by 20 without a remainder

public class Main {
    public static void main(String[] args) {
        int amount = Integer.parseInt(args[0]);
        int hundred = 100;
        int fifty = 50;
        int twenty = 20;
        int counterHundred = 0;
        int counterFifty = 0;
        int counterTwenty = 0;

        while(amount>=hundred){
            System.out.println(" this is hundred "+amount + " counter "+ counterHundred);
            amount  -= hundred;
            counterHundred++;
        }
        System.out.println(" this is hundred "+amount + " counter "+ counterHundred);

        if (!(amount % 20 == 0)){
            while(amount>=fifty){
                System.out.println("this is fifty " +amount+ " counter "+ counterFifty);
                amount  -= fifty;
                counterFifty++;
            }
        }
        System.out.println("this is fifty " +amount+ " counter "+ counterFifty);
        while(amount>=twenty){
            System.out.println( " this is twenty " + amount+ " counter "+ counterTwenty);
            amount -= twenty;
            counterTwenty++;
        }
        System.out.println( " this is twenty " + amount+ " counter "+ counterTwenty);

        List<Integer> solution = Arrays.asList(counterHundred, counterFifty, counterTwenty);
        System.out.println(solution);
        }
    }