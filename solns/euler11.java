import java.io.*;

public class euler11{
  public static void main(String[] args){
    int[][] grid = makeGrid("euler11_grid.txt");
    int prod = vertical(grid);
    System.out.println(vertical(grid,0,0));
    System.out.println(horizontal(grid,0,0));
    System.out.println(diagonal(grid,6,8));
    if (horizontal(grid)>prod)
      prod=horizontal(grid);
    if (diagonala(grid)>prod)
      prod=diagonala(grid);
    if (diagonalb(grid)>prod)
      prod=diagonalb(grid);
    System.out.println(prod);
  }
  
  public static int[][] makeGrid(String filename){
    try{
      BufferedReader br = new BufferedReader(new FileReader(filename));
      String input = br.readLine();
      int[][] grid = new int[20][20];
      for (int j = 0; input!=null; j++)
      {
        String[] split = input.split(" ");
        for (int i=0; i<split.length;i++) {
          grid[j][i]=Integer.parseInt(split[i]);
        }
        input = br.readLine();
      }
      br.close();
      return grid;
    }
    catch(IOException e){
      return null;
    }
  }
  
  public static int vertical(int[][] grid){
    int sum=0;
    int tempSum=0;
    for (int x = 0; x < 16; x++){
      for (int y = 0; y < 20; y++){
        tempSum=grid[x][y]*grid[x+1][y]*grid[x+2][y]*grid[x+3][y];
        if (tempSum>sum)
          sum=tempSum;
      }
    }
    return sum;
  }
  
  public static int horizontal(int[][] grid){
    int sum=0;
    int tempSum=0;
    for (int x = 0; x < 20; x++){
      for (int y = 0; y < 16; y++){
        tempSum=grid[x][y]*grid[x][y+1]*grid[x][y+2]*grid[x][y+3];
        if (tempSum>sum)
          sum=tempSum;
      }
    }
    return sum;
  }
  
  public static int diagonala(int[][] grid){
    int sum=0;
    int tempSum=0;
    for (int x = 0; x < 16; x++){
      for (int y = 0; y < 16; y++){
        tempSum=grid[x][y]*grid[x+1][y+1]*grid[x+2][y+2]*grid[x+3][y+3];
        if (tempSum>sum)
          sum=tempSum;
      }
    }
    return sum;
  }
  public static int diagonalb(int[][] grid){
    int sum=0;
    int tempSum=0;
    for (int x=0; x<16; x++){
      for (int y = 4; y<20; y++){
        tempSum=grid[x][y]*grid[x+1][y-1]*grid[x+2][y-2]*grid[x+3][y-3];
        if (tempSum>sum)
          sum=tempSum;
      }
    }
    return sum;
  }
  
  public static int diagonal(int[][] grid, int x, int y){
    int sum = grid[x][y]*grid[x+1][y+1]*grid[x+2][y+2]*grid[x+3][y+3];
    return sum;
  }
  public static int vertical(int[][] grid, int x, int y){
    int sum = grid[x][y]*grid[x][y+1]*grid[x][y+2]*grid[x][y+3];
    return sum;
  }
  public static int horizontal(int[][] grid, int x, int y){
    int sum = grid[x][y]*grid[x+1][y]*grid[x+2][y]*grid[x+3][y];
    return sum;
  }
}