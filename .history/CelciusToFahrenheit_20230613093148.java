import java.util.*;
public class CelciusToFahrenheit {
   public static void main(String[] args) {
    float temperature;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter temperature in Fahrenheits");
    temperature = in.nextFloat();
    temperature = ((temperature+32)*5/9);
    System.out.println("Temperature in Fahrenheits : "+);
   } 
}
