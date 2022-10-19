package day19_LoopPractices;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag){

            System.out.println("Enter the side of the square:");
            int side = scan.nextInt();
            if (side<=0){
                System.exit(0);
            }
            int area = side*side;
            int perimeter = side*4;
            System.out.println("Area of square" + area);
            System.out.println("Perimeter of square" + perimeter);
            System.out.println("Would you like to calculate another Square?");
            String ans = scan.next().toLowerCase();
            while (!(ans.equals("yes")||ans.equals("no"))){
                System.out.println("invalid answer please re-enter");
                ans = scan.nextLine();
            }
            if (ans.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }


        }

        scan.close();
    }
}
/*
 Write a program that can calculate the area and perimeter of a
Square:
1. Ask the user "Enter the side of the
square:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the side of the square"
2. Display:
1. Area of square
2. Perimeter of square
3. Ask the user "Would you like to calculate
another Square?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Square Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
 */