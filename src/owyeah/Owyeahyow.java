/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owyeah;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Owyeah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter your First name");
            String fName = scn.nextLine();
            
            System.out.println("Enter your Middle name");
            String mName = scn.nextLine();
            
            System.out.println("Enter your Last name");
            String lName = scn.nextLine();
            
            System.out.println("Enter your Age");
            String Age = scn.nextLine();
            
            System.out.println("Enter your Gender");
            String Gender = scn.nextLine();
            
            System.out.println("Enter your Birthdate");
            String Birthdate = scn.nextLine();
            
            
            System.out.println("Your Personal Data: " +fName + " " +mName + " " +lName + " " +Age +" " +Gender + " " +Birthdate +" ");
        }
                
                
        
    }
    
}
