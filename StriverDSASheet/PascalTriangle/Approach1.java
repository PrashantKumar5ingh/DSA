import java.util.*;

public class Approach1 {

    public List<List<Integer>> generate(int rows) {
        if (rows == 0) return null;
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        pascalTriangle.add(row1);
        for (int i = 1; i < rows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            List<Integer> previousRow = pascalTriangle.get(pascalTriangle.size() - 1);
            for (int j = 0; j < pascalTriangle.size() - 1; j++) {
                currentRow.add(previousRow.get(j) + previousRow.get(j + 1));
            }
            currentRow.add(1);
            pascalTriangle.add(currentRow);
        }
        return pascalTriangle;
    }
}
