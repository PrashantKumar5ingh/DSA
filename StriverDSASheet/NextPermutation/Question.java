package StriverDSASheet.NextPermutation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class Question {

    public static int[] getArrayInput(Scanner sc){
        String line = sc.nextLine();
        String[] tokens = line.trim().split("\\s+");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream("input.txt"))));
        int arr[] = getArrayInput();
        Class<?> clazz = Class.forName(className);
        Object obj = clazz.getDeclaredConstructor().newInstance();
        java.lang.reflect.Method method = clazz.getMethod("generate", int.class);
    }
}
