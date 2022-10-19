package day19_LoopPractices;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean IsCont = true;
        while (IsCont){
        System.out.println("Enter the radius of the circle:");
        int radius = scan.nextInt();
        if(radius<=0) {
            System.err.println("Invalid Entry for the radius of the circle");
            System.exit(0);
        }


                double area = radius * radius * 3.14;
                double perimeter = radius * 3.14 * 2;
                double diameter = radius * 2;

                System.out.println("Area of the circle: " + area);
                System.out.println("Perimeter of the circle: " + perimeter);
                System.out.println("Diameter of circle " + radius * 2);
                System.out.println("Would you like to calculate another circle? yes/no");
                String ans = scan.next().toLowerCase();
            while (!(ans.equals("yes")||ans.equals("no"))){
                System.out.println("invalid answer please try again");
                ans = scan.next().toLowerCase();}

            if (ans.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
           break; }



            }



        scan.close();






    }
}
/*
1. Write a program that can calculate the area and perimeter of a
circle:
1. Ask the user "Enter the radius of the
circle:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the radius of the circle"

Display:
1. Diameter of circle
2. Area of circle
3. Perimeter of circle
3. Ask the user "Would you like to calculate
another circle?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Circle Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
 */