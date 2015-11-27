public class euler17{
  public static void main(String[] args){
    int l = 0;
    for (int i = 1; i < 1000; i++){
      l+=writeNumber(i).length();
      System.out.println(writeNumber(i));
    }
    System.out.println(l);
  }
  public static String writeNumber(int n){
    String result = "";
    
    if ((n / 10)%10 != 1){
      if (n % 10 == 1){
        result += "one";
      } else if (n % 10 == 2){
        result += "two";
      } else if (n % 10 == 3){
        result += "three";
      } else if (n % 10 == 4){
        result += "four";
      } else if (n % 10 == 5){
        result += "five";
      } else if (n % 10 == 6){
        result += "six";
      } else if (n % 10 == 7){
        result += "seven";
      } else if (n % 10 == 8){
        result += "eight";
      } else if (n % 10 == 9){
        result += "nine";
      }
    } else {
      if (n%10 == 0){
        result += "ten";
      } else if (n%10 == 1) {
        result += "eleven";
      } else if (n%10 == 2) {
        result += "twelve";
      } else if (n%10 == 3) {
        result += "thirteen";
      } else if (n%10 == 4) {
        result += "fourteen";
      } else if (n%10 == 5) {
        result += "fifteen";
      } else if (n%10 == 6) {
        result += "sixteen";
      } else if (n%10 == 7) {
        result += "seventeen";
      } else if (n%10 == 8) {
        result += "eighteen";
      } else if (n%10 == 9){
        result += "nineteen";
      }
    }
    
    if (n/10 == 0 || n/10 == 1){ 
      return result; 
    }
    
    n = n/10;
    
    if (n%10 == 2){
      result = "twenty"+result;
    } else if (n%10 == 3){
      result = "thirty"+result;
    } else if (n%10 == 4){
      result = "forty"+result;
    } else if (n%10 == 5){
      result = "fifty"+result;
    } else if (n%10 == 6){
      result = "sixty"+result;
    } else if (n%10 == 7){
      result = "seventy"+result;
    } else if (n%10 == 8){
      result = "eighty"+result;
    } else if (n%10 == 9){
      result = "ninety"+result;
    }
    
    if (n/10 == 0){
      return result;
    }
    
    n = n/10;
    
    if (result == ""){
      result="hundred"+result;
    } else {
      result="hundredand"+result;
    }
    
    if (n % 10 == 1){
      result = "one"+result;
    } else if (n % 10 == 2){
      result = "two"+result;
    } else if (n % 10 == 3){
      result = "three"+result;
    } else if (n % 10 == 4){
      result = "four"+result;
    } else if (n % 10 == 5){
      result = "five"+result;
    } else if (n % 10 == 6){
      result = "six"+result;
    } else if (n % 10 == 7){
      result = "seven"+result;
    } else if (n % 10 == 8){
      result = "eight"+result;
    } else if (n % 10 == 9){
      result = "nine"+result;
    }
    
    return result;
  }
}