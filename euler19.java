public class euler19{
  public static void main(String[] args){
    int day = 2;
    int sundays = 0;
    
    for (int year = 1900; year <= 2000; year++){
      for (int month = 1; month <= 12; month++){
        for (int date = 1; date <= 31; date++){/*
          if (day == 1){
            System.out.print("Sunday");
          } else if (day == 2){
            System.out.print("Monday");
          } else if (day == 3){
            System.out.print("Tuesday");
          } else if (day == 4){
            System.out.print("Wednesday");
          } else if (day == 5){
            System.out.print("Thursday");
          } else if (day == 6){
            System.out.print("Friday");
          } else if (day == 7){
            System.out.print("Saturday");
          }
          System.out.print(", ");
          if (month == 1){
            System.out.print("January");
          } else if (month == 2){
            System.out.print("February");
          } else if (month == 3){
            System.out.print("March");
          } else if (month == 4){
            System.out.print("April");
          } else if (month == 5){
            System.out.print("May");
          } else if (month == 6){
            System.out.print("June");
          } else if (month == 7){
            System.out.print("July");
          } else if (month == 8){
            System.out.print("August");
          } else if (month == 9){
            System.out.print("September");
          } else if (month == 10){
            System.out.print("October");
          } else if (month == 11){
            System.out.print("November");
          } else if (month == 12){
            System.out.print("December");
          }
          
          System.out.println(" "+date+", "+year+". ");*/
          
          if (date == 1 && day == 1 && year > 1900){
            sundays++;
          }
          
          day++;
          if (day > 7){
            day = 1;
          }
          
          if (date == 30 && (month == 9 || month == 4 || month == 6 || month == 11)){
            break;
          }
          if (date == 28 && month == 2 && (!(year%4 == 0) || (year%100 == 0 && !(year%400 == 0)))){
            break;
          }
          if (date == 29 && month == 2 && year%4 == 0 && (!(year%100 == 0) || year%400 == 0)){
            break;
          }
        }
      }
    }
    System.out.println(sundays);
  }
}
