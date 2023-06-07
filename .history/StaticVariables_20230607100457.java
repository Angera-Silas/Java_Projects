import java.io.*;
public class StaticVariables {
    private static double salary;// Static 
    public static final String DEPARTMENT = "Development";
    public static void main(String[] args) {
        salary = 100000;
        System.out.println(DEPARTMENT +" average salary: " + salary);
    }
}
