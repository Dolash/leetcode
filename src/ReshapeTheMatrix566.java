public class ReshapeTheMatrix566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int size = mat.length * mat[0].length;
        if (size != r * c)
        {
            return mat;
        }
        int innerCounter = 0;
        int outerCounter = 0;
        int[][] output = new int[r][c];
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (outerCounter < mat.length)
                {
                    output[i][j] = mat[outerCounter][innerCounter];
                    innerCounter++;
                    if (innerCounter >= mat[0].length)
                    {
                        innerCounter = 0;
                        outerCounter++;
                    }
                }
            }
        }
        return output;
    }
}
