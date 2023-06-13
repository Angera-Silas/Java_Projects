import java.util.*;
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        temperature = in.nextFloat();
        temperature = ((temperature-32)*5/9);
        System.out.println("Temperature in degree Celcius : "+temperature);
    }
    
}
