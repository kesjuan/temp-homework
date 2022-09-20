package scans;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);




        System.out.print("Is the temperature outside Low, High or Humid? ");
       String temperature = scan.nextLine();
       if (temperature.matches("low") || temperature.matches("Low")){
           System.out.println("A coat may be needed");
       } else if (temperature.matches("humid" )|| temperature.matches("Humid")) {
           System.out.println("its muggy");
       } else if (temperature.matches("High") || temperature.matches("high")) {
           System.out.println("sunblock may be needed");
       }




    }

}
