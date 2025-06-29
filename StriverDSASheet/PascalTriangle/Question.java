import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.*;

public class Question {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedInputStream(new java.io.FileInputStream("input.txt")))) {
            int numOfRows = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter the solution class name : ");
            String className = sc1.nextLine().trim();
            sc1.close();
            try {
                Class<?> clazz = Class.forName(className);
                Object obj = clazz.getDeclaredConstructor().newInstance();
                java.lang.reflect.Method method = clazz.getMethod("generate", int.class);
                List<List<Integer>> triangle = (List<List<Integer>>) method.invoke(obj, numOfRows);
                // Optionally print the matrix to verify changes
                for(List<Integer> row : triangle){
                    System.out.println(row);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
