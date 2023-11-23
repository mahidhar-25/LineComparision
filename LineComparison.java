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
    public static double getDistanceBetweenPoints(int x1 , int y1 , int x2 , int y2){
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
    public static void main(String[] args) {
        System.out.println("!! Welcome to Line Comparison !!");
        System.out.println("enter two points on a line to get distance : ");
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt() , y1 = input.nextInt();
        int x2 = input.nextInt() , y2 = input.nextInt();

        double distance = getDistanceBetweenPoints(x1 , y1 , x2 , y2);
        System.out.println("distance between two points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance );

    }
}
