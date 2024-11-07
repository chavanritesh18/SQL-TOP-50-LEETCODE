class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;        // Number of rows
        int m = matrix[0].length;      // Number of columns
        int col0 = 1;                  // Flag for the first column

        // Step 1: Mark the rows and columns that need to be zeroed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;    // Mark the row
                    if (j != 0) {
                        matrix[0][j] = 0;  // Mark the column
                    } else {
                        col0 = 0;       // Set the first column flag if the zero is in the first column
                    }
                }
            }
        }

        // Step 2: Update the matrix using the marks
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle the first row if needed
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle the first column if needed
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
