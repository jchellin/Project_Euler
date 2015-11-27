import java.io.*;

public class euler22{
  public static String[] names;
  
  public static void main(String[] args){
    readFile("euler22_names.txt");
    sort();
    long sum = 0;
    for (int i = 0; i < names.length; i++){
      sum += getScore(i);
    }
    System.out.println(sum);
  }
  
  public static void readFile(String filename){
    try{
      BufferedReader br = new BufferedReader(new FileReader(filename));
      String input = br.readLine();
      input=input.substring(1,input.length()-1);
      names = input.split("\",\"");
      br.close();
    } catch(FileNotFoundException e){
      System.out.println("File not found");
    } catch(IOException e){
      System.out.println("Problem");
    }
  }
  
  public static void sort(){
    boolean sorted = false;
    while (!sorted){
      sorted=true;
      for (int i = 0; i < names.length-1; i++){
        if(compare(names[i],names[i+1])==-1){
          swap(i,i+1);
          sorted=false;
        }
      }
    }
  }
  
  // returns 1 if first argument is first; -1 if second; 0 if they are the same.
  public static int compare(String a, String b){
    int len;
    if (a.length()>b.length()){
      len=b.length();
    } else{
      len=a.length();
    }
    for (int i = 0; i<len; i++){
      if (a.charAt(i)>b.charAt(i)){
        return -1;
      } else if (a.charAt(i)<b.charAt(i)){
        return 1;
      }
    }
    if (a.length()>b.length()){
      return -1;
    } else if (a.length()<b.length()) {
      return 1;
    }
    return 0;
  }
  
  public static void swap(int a, int b){
    String temp = names[a];
    names[a]=names[b];
    names[b]=temp;
  }
  
  public static int getScore(int a){
    String name = names[a];
    int result = 0;
    for (int i = 0; i < name.length(); i++){
      result+=(int)name.charAt(i)-64;
    }
    result*=a+1;
    return result;
  }
}