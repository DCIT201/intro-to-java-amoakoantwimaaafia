import java.util.Scanner;

public class TemperatureConverter {
     public static void main(String[] args) {
        // create scanner input
        Scanner scanner=new Scanner(System.in);
        // Option Guidelines
        System.out.println("Convert with fun!");
        System.out.println("OPTION1: Convert Celsius to Fahrenheit");
        System.out.println("OPTION2:Convert Fahrenheit to Celcius");
        // accepting user option
        System.out.println("Enter option:  ");
        int option = scanner.nextInt();
        // Enter temperature value to convert
        System.out.println("Enter temperature value to convert:  ");
        double temperature = scanner.nextDouble();
        // perform conversions
    if (option==1){
    double fahrenheit = (temperature * 9 / 5) + 32; 
    System.out.println(temperature + "Celcuis is" + fahrenheit + "fahrenheit");
    }
    else if(option==2){
        double celcius=(temperature - 32) * 5 / 9;
        System.out.println(temperature + " Fahrenheit is " + celcius + " Celsius.");
    }
    else{
        System.out.println("INVALID INPUT TRY AGAIN");
    }
    System.out.println("HAPPY CONVERTING WITH YOU!");

    
}
}
