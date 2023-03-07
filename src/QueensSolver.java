public class QueensSolver {
    private String[][] grid;

    public QueensSolver(int size){
        grid = new String[size][size];
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                grid[row][col] = "[ ]";
            }
        }
        grid[0][2] = "[Q]";
        grid[1][0] = "[Q]";
        grid[2][3] = "[Q]";
        grid[3][1] = "[Q]";
    }

    public void eliminateBoxes(int row, int col){
        grid[row][col] = "[Q]";
        for (int c = 0; c < grid.length; c++){
            if (c != col) grid[row][c] = "[-]";
        }
        for (int r = 0; r < grid.length; r++){
            if (r != row) grid[r][col] = "[-]";
        }

    }

    public void printSolutions(){
        for (String[] row : grid){
            for (String box : row){
                System.out.print(box + " ");
            }
            System.out.println();
        }
    }




}
