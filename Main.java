import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Measurement Conversion System");
        System.out.println("Please Enter Your Username & Password For Login");
        System.out.print("Username: ");
        String Name_1=input.next();
        System.out.print("Password: ");
        String Password_1=input.next();
        MeasurementConversion conversion=new MeasurementConversion();
         conversion.setUserName("Ifan");
         conversion.setPassword("Pass");
         String Name_2=conversion.getUserName();
         String Password_2=conversion.getPassword();
         if(Name_1.equals(Name_2) && Password_1.equals(Password_2))
         {
             System.out.println("Login Successful");
             conversion.Conversion();
         }
         else
         {
             System.out.println("Warning Your Password is Not Correct \"Program Terminate Within 5 Seconds\"");
                 TimeUnit.SECONDS.sleep(5);
         }

    }
}