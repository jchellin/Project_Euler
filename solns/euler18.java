import java.io.*;

public class euler18{
  static int dim = 15;
  
  public static void main(String[] args){
    String[][] gridStr = new String[dim][dim];
    try {
      BufferedReader br = new BufferedReader(new FileReader("euler18_nums.txt"));
      String input = br.readLine();
      for (int i = 0; input != null; i++){
        gridStr[i]=input.split(" ");
        input = br.readLine();
      }
      br.close();
      
      int[][] grid = new int[dim][dim];
      
      for (int i = 0; i < dim; i++){
        for (int j = 0; j <= i; j++){
          grid[i][j]=Integer.parseInt(gridStr[i][j]);
        }
      }
      
      for (int i = dim - 2; i >= 0; i--){
        for (int j = 0; j <= i; j++){
          if (grid[i+1][j+1] > grid[i+1][j]){
            grid[i][j]=grid[i][j]+grid[i+1][j+1];
          } else {
            grid[i][j]=grid[i][j]+grid[i+1][j];
          }
        }
      }
      
      /*for (int i = 0; i < dim; i++){
        for (int j = 0; j <= i; j++){
          System.out.print(grid[i][j]+" ");
        }
        System.out.println();
      }*/
      
      int j = 0;
      
      System.out.print("Path for maximum sum: ");
      
      for (int i = 0; i < dim-1; i++){
        if (grid[i+1][j+1] > grid[i+1][j]){
          System.out.print(Integer.parseInt(gridStr[i][j])+" --> ");
          j++;
        } else {
          System.out.print(Integer.parseInt(gridStr[i][j])+" --> ");
        }
      }
      System.out.println(gridStr[dim-1][j]);
      System.out.println("The maximum sum is "+grid[0][0]);
      
    } catch (FileNotFoundException e){
      System.out.println("No file");
    } catch (IOException e){
      System.out.println("Error");
    }
  }
}
