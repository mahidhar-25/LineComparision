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
        int x1 = input.nextInt() , y1 = input.nextInt();
        int x2 = input.nextInt() , y2 = input.nextInt();

        double distanceLeftToRight = getDistanceBetweenPoints(x1 , y1 , x2 , y2);
        double distanceRightToLeft = getDistanceBetweenPoints(x2 , y2 , x1 , y1);
        System.out.println("distance between two points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distanceLeftToRight );
        System.out.println("distance between two points (" + x2 + "," + y2 + ") and (" + x1 + "," + y1 + ") is " + distanceRightToLeft );

        //making double values as line objects , as equals method works on objects
        Double line1 = Double.valueOf(distanceLeftToRight);
        Double line2 = Double.valueOf(distanceLeftToRight);
        System.out.println("Both the lines are " + (line1.equals(line2) ? "equal" : "not equal"));
    }
}
