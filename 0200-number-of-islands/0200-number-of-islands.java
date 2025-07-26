class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Start BFS if it's land and not visited
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(i, j, grid, visited);
                    count++;
                }
            }
        }

        return count;
    }

    // BFS Function to explore island from one cell
    private void bfs(int row, int col, char[][] grid, boolean[][] visited) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});
        visited[row][col] = true;

        int[] dx = {-1, 0, 1, 0}; // Up, Right, Down, Left FOR ROW
        int[] dy = {0, 1, 0, -1}; // FOR COL

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dx[i];
                int nc = c + dy[i];

                // Check boundary and if it's land and not visited
                if (nr >= 0 && nc >= 0 && nr < n && nc < m &&
                    grid[nr][nc] == '1' && !visited[nr][nc]) {
                    
                    queue.offer(new int[]{nr, nc});
                    visited[nr][nc] = true;
                }
            }
        }
    }
}
