// class Solution {
//     public int numIslands(char[][] grid) {
//         int islands = 0;
//         int rows = grid.length;
//         int cols = grid[0].length;
//         Set<String> visited = new HashSet<>();

//         int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

//         for (int r = 0; r < rows; r++) {
//             for (int c = 0; c < cols; c++) {
//                 if (grid[r][c] == '1' && !visited.contains(r + "," + c)) {
//                     islands++;
//                     bfs(grid, r, c, visited, directions, rows, cols);
//                 }
//             }
//         }

//         return islands;        
//     }

//     private void bfs(char[][] grid, int r, int c, Set<String> visited, int[][] directions, int rows, int cols) {
//         Queue<int[]> q = new LinkedList<>();
//         visited.add(r + "," + c);
//         q.add(new int[]{r, c});

//         while (!q.isEmpty()) {
//             int[] point = q.poll();
//             int row = point[0], col = point[1];

//             for (int[] direction : directions) {
//                 int nr = row + direction[0], nc = col + direction[1];
//                 if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == '1' && !visited.contains(nr + "," + nc)) {
//                     q.add(new int[]{nr, nc});
//                     visited.add(nr + "," + nc);
//                 }
//             }
//         }
//     }    
// }




class Solution {
    public int numIslands(char[][] grid) {
        // island : all 4 side surrounded by water
        // palensula : 3 sides are surrounded by water

        // 4 neighbours (N,S,E,W) and 8 neighbour (N,S,E,W, and other 4 also).

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                //ASCII VALUE
                // a:97
                //A:65
                // 0:48

                if (grid[i][j] == '1') {
                    count++;
                    clear(grid, i, j);
                }
            }
        }
        return count;
    }

    void clear(char grid[][], int r, int c) {

        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0')
            return;

        grid[r][c] = '0';
        clear(grid, r - 1, c);
        clear(grid, r, c - 1);
        clear(grid, r + 1, c);
        clear(grid, r, c + 1);
    }
}
