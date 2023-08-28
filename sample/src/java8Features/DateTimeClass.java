package java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class DateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime curTime = LocalDateTime.now();
	      System.out.println("Current DateTime: " + curTime);
			
	      LocalDate date1 = curTime.toLocalDate();
	      System.out.println("date1: " + date1);
			
	      int month = curTime.getMonth().getValue();
	      int day = curTime.getDayOfMonth();
	      int seconds = curTime.getSecond();
			
	      System.out.println( month +" "+ day +" "+ seconds);

	}

}
