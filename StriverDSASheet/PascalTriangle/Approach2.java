import java.util.ArrayList;
import java.util.List;

public class Approach2 {
    public List<List<Integer>> generate(int numOfRows) {
        if (numOfRows == 0) return null;
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < numOfRows; i++) {
            List<Integer> currRow = new ArrayList<>();
            int currElement = 1;
            for (int j = 0; j <= i; j++) {
                currRow.add(currElement);
                currElement = currElement * (i - j) / (j + 1);
            }
            pascalTriangle.add(currRow);
        }
        return pascalTriangle;
    }
}
