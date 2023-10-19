package InterviewProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

 class FloorPlanColorizer {
    private static final char[] COLORS = {'V', 'I', 'B', 'G', 'Y', 'O', 'R'};

    public static void main(String[] args) {
        String floorPlan = "##########\n" +
                "#   #    #\n" +
                "#   #    #\n" +
                "## #### ##\n" +
                "#        #\n" +
                "#        #\n" +
                "##########";



        colorizeFloorPlan(floorPlan);
    }

    public static void colorizeFloorPlan(String floorPlan) {
        char[][] grid = parseFloorPlan(floorPlan);
        List<Room> rooms = findRooms(grid);

        for (int i = 0; i < rooms.size(); i++) {
            char color = COLORS[i % COLORS.length];
            colorizeRoom(grid, rooms.get(i), color);
        }

        printFloorPlan(grid);
    }

    public static char[][] parseFloorPlan(String floorPlan) {
        String[] rows = floorPlan.split("\n");
        int numRows = rows.length;
        int numCols = rows[0].length();
        char[][] grid = new char[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                grid[i][j] = rows[i].charAt(j);
            }
        }

        return grid;
    }



    public static List<Room> findRooms(char[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;
        boolean[][] visited = new boolean[numRows][numCols];
        List<Room> rooms = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == ' ' && !visited[i][j]) {
                    Room room = new Room();
                    exploreRoom(grid, visited, i, j, room);
                    rooms.add(room);
                }
            }
        }

        return rooms;
    }

    public static void exploreRoom(char[][] grid, boolean[][] visited, int row, int col, Room room) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        if (row < 0 || row >= numRows || col < 0 || col >= numCols)
            return;

        if (grid[row][col] != ' ' || visited[row][col])
            return;
          if(isDoor(grid,row,col)){

              return;
          }
        visited[row][col] = true;
        room.addSpace(row, col);

        exploreRoom(grid, visited, row - 1, col, room); // Up
        exploreRoom(grid, visited, row + 1, col, room); // Down
        exploreRoom(grid, visited, row, col - 1, room); // Left
        exploreRoom(grid, visited, row, col + 1, room); // Right
    }

     private static boolean isDoor(char[][] grid, int row, int col) {
      if(grid[row][col-1]=='#'&&grid[row][col+1]=='#') return true;
      if(grid[row-1][col]=='#'&& grid[row+1][col]=='#')return true;

      return false;
     }

     public static void colorizeRoom(char[][] grid, Room room, char color) {
        for (int row : room.getRows()) {
            for (int col : room.getCols()) {
                if(grid[row][col] == ' ')
                grid[row][col] = color;
            }
        }
    }

    public static void printFloorPlan(char[][] grid) {
        for (char[] row : grid) {
            System.out.println(row);
        }
    }

    static class Room {
        private Set<Integer> rows;
        private Set<Integer> cols;

        public Room() {
            rows = new HashSet<>();
            cols = new HashSet<>();
        }

        public void addSpace(int row, int col) {
            rows.add(row);
            cols.add(col);
        }

        public Set<Integer> getRows() {
            return rows;
        }

        public Set<Integer> getCols() {
            return cols;
        }
    }
}
