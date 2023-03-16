
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] array){
        for (int i = 0; i<array.length; i++){
            for (int l = 0; l<array[i].length; l++){
                System.out.print(array[i][l]);
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            for (int l = 0; l<array[i].length; l++){
                sum = sum + array[i][l];
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] array){
        int sum = sum(array);
        int elementSum = 0;
        for (int i = 0; i<array.length; i++){
            elementSum = elementSum + array[i].length;
        }
        return (double) sum/elementSum;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] array){
        int minimum = array[0][0];
        for (int i = 0; i<array.length; i++){
            for (int l = 0; l<array[i].length; l++){
                if (minimum >= array[i][l]){
                    minimum = array[i][l];
                }
            }
        }
        return minimum;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] array){
        int maximum = array[0][0];
        for (int i = 0; i<array.length; i++){
            for (int l = 0; l<array[i].length; l++){
                if (maximum <= array[i][l]){
                    maximum = array[i][l];
                }
            }
        }
        return maximum;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] array){
        int count = 0;
        for (int i = 0; i<array.length; i++){
            for (int l = 0; l<array[i].length; l++){
                if (array[i][l] % 2 ==0){
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] array){
        int count = 0;
        for (int[] row: array){
            for (int col: row){
                if (col%2==0){
                    count++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] array){
        boolean positive = true;
        for (int[] row: array){
            for (int col: row){
                if (col<0){
                    positive = false;
                }
            }
        }
        return positive;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] array){
        int[] rowSums = new int[array.length];
        for (int i = 0; i<array.length; i++){
            for (int l = 0; l<array[i].length; l++){
                rowSums[i] = rowSums[i] + array[i][l];
            }
        }
        return rowSums;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] array){
        int[] colSums = new int[array.length];
        for (int i = 0; i<array.length; i++){
            for (int l = 0; l<array[i].length; l++){
                colSums[l] = colSums[l] + array[i][l];
            }
        }
        return colSums;
    }

}
