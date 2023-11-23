import java.util.Scanner;

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
    public static void main(String[] args) {
        System.out.println("!! Welcome to Line Comparison !!");
        System.out.println("enter two points on a line to get distance : ");
        Scanner input = new Scanner(System.in);
        //get the inputs of line 1
        int x1 = input.nextInt() , y1 = input.nextInt();
        int x2 = input.nextInt() , y2 = input.nextInt();

        double distanceLeftToRight = getDistanceBetweenPoints(x1 , y1 , x2 , y2);

        //get the inputs of line 2
        System.out.println("enter two points on a line to get distance : ");
        int x3 = input.nextInt() , y3 = input.nextInt();
        int x4 = input.nextInt() , y4 = input.nextInt();
        double distanceRightToLeft = getDistanceBetweenPoints(x3 , y3 , x4 , y4);
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
