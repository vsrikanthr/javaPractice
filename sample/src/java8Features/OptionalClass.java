package java8Features;



import java.util.Optional;

public class OptionalClass {

   public static void main(String args[]) {
      Integer value1 = null;
      Integer value2 = 10;
      
      Optional<Integer> a = Optional.ofNullable(value1);
      Optional<Integer> b = Optional.of(value2);
      
      System.out.println(a.isPresent());
      System.out.println(b.isPresent());
      
      value1 = a.orElse(5);
      
      System.out.println(value1);
      System.out.println(value2);
      System.out.println(value1 + value2);
   }
	
   
}