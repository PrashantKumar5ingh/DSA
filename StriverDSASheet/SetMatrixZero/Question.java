import java.io.BufferedInputStream;
import java.util.Scanner;

public class Question {

    private static int[][] getFormattedMatrix(Scanner sc){
        String line = sc.nextLine().trim();
        line = line.replaceAll("\\[\\[|\\]\\]", ""); // Remove outer brackets
        String[] rows = line.split("\\],\\[");
        int[][] matrix = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] nums = rows[i].split(",");
            matrix[i] = new int[nums.length];
            for (int j = 0; j < nums.length; j++) {
            matrix[i][j] = Integer.parseInt(nums[j].trim());
            }
        }
        return matrix;
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedInputStream(new java.io.FileInputStream("input.txt")))) {
            int[][] matrix = getFormattedMatrix(sc);

            for (int [] row: matrix){
                for (int x: row){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
            System.out.print("Solution Class Name : ");
            Scanner sc1 = new Scanner(System.in);
            String className = sc1.nextLine().trim();
            sc1.close();
            try {
                Class<?> clazz = Class.forName(className);
                Object obj = clazz.getDeclaredConstructor().newInstance();
                clazz.getMethod("setZeroes", int[][].class).invoke(obj, (Object) matrix);
                // Optionally print the matrix to verify changes
                for (int[] row : matrix) {
                    for (int val : row) {
                        System.out.print(val + " ");
                    }
                    System.out.println();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }


    }    
}
