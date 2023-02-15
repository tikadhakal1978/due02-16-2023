/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dhakal.parkinggarage;

/**
 *
 * @author tikad
 */
import java.util.Scanner;
public class ParkingGarage {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      double totalCharge = 0, charge,hours; int numCustomer;
      System.out.print("Enter number of customers:");
      numCustomer = sc.nextInt();
      
      for (int i =1; i<=numCustomer; i++){
          System.out.print ("Enter number of hours parked for Customer- "+i+":");
      hours = sc.nextDouble();
      charge = 2;
      if (hours >3){
          
         charge += Math.ceil(hours-3)* 0.50;
         if (charge > 10)
             charge =10;
      }
         totalCharge +=charge;
         System.out.printf("Parking change for customer-%d: $%.2f\n", i,charge);
         System.out.printf("Total charge for %d customer who parked yesterday:%.2f\n\n",i, totalCharge);
          
      }
        
        
        
        
        
        
        
        
        
       
    }
}
