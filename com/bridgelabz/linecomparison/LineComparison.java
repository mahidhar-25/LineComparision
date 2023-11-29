package com.bridgelabz.linecomparison;

/*
@desc :
Line Comparison class is to calculate the distance between two points and returns a double value
 */
public class LineComparison {


    /*
        @desc   : it calculates the distance between two points
        @param  : - x1 x-coordinate of the first point
                  - y1 y-coordinate of the first point
                  - x2 x-coordinate of the second point
                  - y2 y-coordinate of the second point
        @return : return the distance in double type
         */
    public static long getDistanceBetweenPoints(int x1 , int y1 , int x2 , int y2){
        return (long)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

}
