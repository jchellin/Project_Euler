import java.io.*;

public class euler13{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new FileReader("euler13_nums.txt"));
      String[] nums = new String[100];
      String input = br.readLine();
      for (int i = 0; input!=null; i++){
        nums[i]=input;
        input = br.readLine();
      }
      br.close();
      
      int[] digSums = new int[50];
      for (int j = 0; j < 50; j++){
        digSums[j]=0;
      }
      
      for (int j = 49; j >= 0; j--){
        for (int i = 0; i < 100; i++){
          digSums[j]+=Integer.parseInt(Character.toString(nums[i].charAt(j)));
          if (digSums[j] >= 10 && j != 0){
            digSums[j-1] += (int)(digSums[j]/10);
            digSums[j]=digSums[j]%10;
          }
        }
      }
      
      for (int i = 0; i < 50; i++){
        System.out.print(digSums[i]);
      }
      
    } catch (FileNotFoundException e){
      System.out.println("No file");
    } catch (IOException e){
      System.out.println("Error");
    }

  }
  
}