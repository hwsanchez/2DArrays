import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] my2DArray = new int[4][5];
        my2DArray[0][0] = 1;
        my2DArray[0][1] = 2;
        my2DArray[0][2] = 3;
        my2DArray[1][0] = 4;
        my2DArray[1][1] = 5;
        my2DArray[1][2] = 6;
        my2DArray[2][0] = 7;
        my2DArray[2][1] = 8;
        my2DArray[2][2] = 9;
        //This will give the amounto of rows:
        System.out.println("My 2DArray length (rows): " + my2DArray.length);
        System.out.println("My 2DArray number of columns: " + my2DArray[0].length);
        //Loop to print all elements:
        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j] + " ");
            }
            System.out.println();

        }
        //Another way of declaring a 2-dimensional array:
        int [][] another2DArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Another 2D Array:");
        for(int i = 0; i < another2DArray.length; i++) {
            for(int j = 0; j < another2DArray[i].length; j++) {
                System.out.print(another2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
