import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int xstart = 5;
        int ystart = 5;

        int xend = 10;
        int yend = 5;

        double dx = Math.abs(xend - xstart);
        double dy = Math.abs(yend - ystart);
        double incx = dx/dx;
        double incy = dy/dx;

        int[][] array = new int[20][20];

        int x = 0; int y = 0;
        for (int i = xstart; i < xend; i++){
            x = xstart + (int)Math.round(incx * i);
            y = ystart + (int)Math.round(incy * i);
            System.out.println(x + ", " + y);
            array[y][x] = 1;
        }

        for (int i=0; i <  array.length; i++){
            for (int j=0; j <  array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


    }
}