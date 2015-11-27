public class euler15{
  static int size = 20;
  
  public static void main(String[] args){
    long[][] grid = new long[size+1][size+1];
    
    for (int i = size - 1; i >= 0; i--){
      grid[i][size] = 1;
      grid[size][i] = 1;
    }
    
    for (int i = size - 1; i >= 0; i--){
      for (int j = size - 1; j >= 0; j--){
        grid[i][j]=grid[i][j+1]+grid[i+1][j];
      }
    }
    
    System.out.println(grid[0][0]);
  }
}