package day06_ifStatements;

public class Task8_NumberOfDays {

    public static void main(String[] args) {

        int n = 2;

        boolean has28Days =  n ==2; // if the months is 2 (Feb), then it has 28 days
        boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11;
        boolean has31Days = !has28Days && !has30Days;
        // if the month does not have 28 days, and also does not have 30 days, then the month has 31 days

        String result = "";

        if(has28Days){
            result = "28 days";
        }

        if(has30Days){
            result = "30 days";
        }

        if(has31Days){
            result = "31 days";
        }

        System.out.println(result);

        /*  ************* My Answer  ***********

        int number = 5;

        if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number ==10 || number == 12 ){

            System.out.println("31 days");
        }

        if (number == 4 || number == 6 || number == 9 || number == 11 ){

            System.out.println("30 days");
        }

        if (number == 2 ){

            System.out.println("28 days");
        }

         */

    }
}


 /*
2. An integer variable named month is declared and given, Write a program that can print the number of days in the given month
	Ex:
	     Given:
		number = 1
	     output:
		31 days
       Hints:
	 Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
	 Months that has 30 days are: 4, 6, 9, 11
	 Month that has 28 days: 2
 */
