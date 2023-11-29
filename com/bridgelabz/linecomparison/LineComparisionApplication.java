package com.bridgelabz.linecomparison;

import java.util.Scanner;

/*
@desc :
This Java class, named LineComparisionApplication, is designed to compare the lengths of two lines represented by pairs of points.
It prompts the user to input the coordinates of two points for each line, calculates the distances between the points, and then compares
the lengths of the two lines. The distances are calculated using the getDistanceBetweenPoints method from a class named LineComparison.

Here's a breakdown of the class functionalities:

Input: The program prompts the user to input coordinates for two points on each line.

Distance Calculation: It utilizes the getDistanceBetweenPoints method to calculate the distance between the input points for both lines.

Output: The program then prints the lengths of both lines based on the calculated distances.

Comparison: It converts the distance values to Double objects and compares them using the compareTo method. Finally, it outputs whether both lines are equal or which line is greater.

User Interaction: The class provides clear instructions and messages to guide the user through the input and comparison process.
 */
public class LineComparisionApplication {
    public static void main(String[] args) {
        System.out.println("!! Welcome to Line Comparison !!");
        System.out.println("enter two points on a line to get distance : ");
        Scanner input = new Scanner(System.in);
        //get the inputs of line 1
        int x1 = input.nextInt() , y1 = input.nextInt();
        int x2 = input.nextInt() , y2 = input.nextInt();

        double distanceLeftToRight = LineComparison.getDistanceBetweenPoints(x1 , y1 , x2 , y2);

        //get the inputs of line 2
        System.out.println("enter two points on a line to get distance : ");
        int x3 = input.nextInt() , y3 = input.nextInt();
        int x4 = input.nextInt() , y4 = input.nextInt();
        double distanceRightToLeft = LineComparison.getDistanceBetweenPoints(x3 , y3 , x4 , y4);
        //print the length of the two lines
        System.out.println("distance between two points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distanceLeftToRight );
        System.out.println("distance between two points (" + x3 + "," + y3 + ") and (" + x4 + "," + y4 + ") is " + distanceRightToLeft );

        //making double values as line objects , as equals method works on objects
        Double line1 = distanceLeftToRight;
        Double line2 = distanceRightToLeft;
        //compare two lines using built in method
        int comparedValue = line1.compareTo(line2);

        // getting know more about lines , which is greater
        if(comparedValue == 0){
            System.out.println("Both the lines are equal");
        }else if (comparedValue > 0){
            System.out.println("line1 is greater than line2");
        }else{
            System.out.println("line2 is greater than line1");
        }

    }
}
