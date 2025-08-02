class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        boolean[] seen = new boolean[size + 1];
        int duplicate = -1, missing = -1;

        
        for (int[] row : grid) {
            for (int num : row) {
                if (seen[num]) {
                    duplicate = num;
                }
                seen[num] = true;
            }
        }

        
        for (int i = 1; i <= size; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}