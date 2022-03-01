import java.util.Scanner;

import java.lang.Math;

public class SciCalculator {

    public static void main(String args[]){

        Scanner myScanner = new Scanner(System.in);
        int menuInput = 10;
        double firstOp = 0;
        double secondOp = 0;
        double calcAnswer = 0;
        int numCalc = 0;
        double calcSum = 0;
        double calcAverage = 0;

        while (menuInput != 0) {    //the menu, loops until they choose exit
            System.out.println("Current Result: "+ calcAnswer +"");
            System.out.println("");
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println("");
            System.out.println("Enter Menu Selection:");
            menuInput = myScanner.nextInt();

            while (menuInput == 7) {     //this is how I don't show the menu twice if they chose 7
                if (numCalc != 0) {
                    System.out.println("Sum of calculations: "+calcSum+"");
                    System.out.println("Number of calculations: "+numCalc+"");
                    System.out.println("Average of calculations: "+calcAverage+"");
                    System.out.println("Enter Menu Selection:");
                }
                else {
                    System.out.println("Error: No calculations yet to average!");
                    System.out.println("Enter Menu Selection:");
                }
                menuInput = myScanner.nextInt(); //skips the menu
            }

            if (0 < menuInput && menuInput < 7) {      //contains the numbers in the menu
                System.out.println("Enter first operand:");
                firstOp = myScanner.nextDouble();//couldn't figure out how to put in the word RESULT w/o an error (EC)
                System.out.println("Enter second operand:");
                secondOp = myScanner.nextDouble();
                numCalc++; //adjusting the calculation number
                switch (menuInput){
                    case 1:
                        calcAnswer = firstOp + secondOp;
                        break;
                    case 2:
                        calcAnswer = firstOp - secondOp;
                        break;
                    case 3:
                        calcAnswer = firstOp * secondOp;
                        break;
                    case 4:
                        calcAnswer = firstOp / secondOp;
                        break;
                    case 5:
                        calcAnswer = Math.pow(firstOp, secondOp);
                        break;
                    case 6:
                        calcAnswer = Math.log(secondOp) / Math.log(firstOp);
                        break;
                    default: //no need for any function in default


                }
                calcSum = calcSum + calcAnswer;
                calcAverage = Math.round((calcSum / numCalc) * 100.0) / 100.0; // adjusting the averages and sums

            }
            if (menuInput < 0 || menuInput > 7) {
                System.out.println("Error: Invalid selection!");
                System.out.println("");
                System.out.println("Enter Menu Selection:");
                break;
            }


        }
        System.out.println("Thanks for using this calculator. Goodbye!");






    }



}
