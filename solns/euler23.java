import java.util.*;

public class euler23{
  public static void main(String[] args){
    ArrayList<Integer> a = new ArrayList<Integer>();
    boolean[] nums = new boolean[28124];
    long sum = 0;
    
    //make a list of all abundant numbers
    for (int i = 0; i < 28123; i++){
      if (classify(i) == 1){
        a.add(i);
      }
    }
    
    //determine which numbers under 28123 can be written as a sum of abundant
    //numbers
    for (int i = 0; i < a.size(); i++){
      for (int j = i; j < a.size(); j++){
        if (a.get(i)+a.get(j)<28123){
          nums[a.get(i)+a.get(j)]=true;
        }
      }
    }
    
    //add those numbers which can't to the "sum" variable
    for (int i = 1; i < 28123; i++){
      if (!nums[i])
        sum+=i;
    }
    System.out.println(sum);
  }
  
  public static int classify(int n){
    //returns 0 if perfect; -1 if deficient; 1 if abundant
    int divSum = 0;
    for (int i = 1; i < n; i++){
      if (n % i == 0) {
        divSum+=i;
      }
    }
    if (divSum==n)
      return 0;
    else if(divSum>n)
      return 1;
    else
      return -1;
  }
}