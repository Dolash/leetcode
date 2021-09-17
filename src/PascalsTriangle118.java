import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new LinkedList<>();
        for (int i = 0; i < numRows; i++)
        {
            List<Integer> currentList = new ArrayList<>();
            for (int j = 0; j < i + 1; j++)
            {
                int currentValue = 1;
                if (j > 0 && j < i)
                {
                    currentValue = currentList.get(j-1) * (i  - (j - 1)) / j;
                }
                currentList.add(currentValue);
            }
            output.add(currentList);
        }
        return output;
    }
}
