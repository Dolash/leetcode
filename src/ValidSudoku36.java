import java.util.Hashtable;

public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        boolean result = true;
        Hashtable[] foundRow = new Hashtable[9];
        for (int i = 0; i < 9; i++)
        {
            foundRow[i] = new Hashtable<>();
        }
        for (int i = 0; i < 9; i++)
        {
            Hashtable<Character, Integer> foundColumn = new Hashtable<>();
            for (int j = 0; j < 9; j++)
            {

                if (board[i][j] != '.')
                {
                    if (foundColumn.containsKey(board[i][j]))
                    {
                        return false;
                    }
                    foundColumn.put(board[i][j], j);
                    if (foundRow[j].containsKey(board[i][j]))
                    {
                        return false;
                    }
                    foundRow[j].put(board[i][j], j);
                }
            }
        }
        int a = 0;
        while (a < 9)
        {
            int b = 0;
            while (b < 9)
            {
                Hashtable<Character, Integer> foundSquare = new Hashtable<>();
                for (int i = 0; i < 3; i++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        if (foundSquare.contains(board[i + a][j + b]))
                        {
                            return false;
                        }
                        foundSquare.put(board[i][j], j);
                    }
                }
                b = b + 3;
                System.out.println("b goes up, now a: " + a +" b:" +b);
            }
            a = a + 3;
            System.out.println("a goes up, now a: " + a +" b:" +b);
        }
        return result;
    }
}
