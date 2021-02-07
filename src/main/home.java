/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author KELVIN
 */
 
import java.util.Scanner;
public class home {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
               menu();
               login();         
        }
    
    public static void menu() {
        
        System.out.print("      ___________________________\n");
	System.out.print("    /|  TARUC LIBRARY DISCUSSION |\n");
        System.out.print("   | |     BOOKING SYSTEM        |\n");
	System.out.print("   | |___________________________|\n");
	System.out.print("   | |           LOGIN           |\n");
        System.out.print("   | |                           |\n");
        System.out.print("   | |          1.Student        |\n");
	System.out.print("   | |          2.Admin          |\n");	
        System.out.print("   | |                           |\n");
        System.out.print("   | |                           |\n");
        System.out.print("   |_|___________________________|\n");

    }
  
    public static String login(){

        try(Scanner input=new Scanner(System.in)){

        System.out.print("Enter your role: ");
        String user;    
        String role=input.nextLine();
            
            if("1".equals(role)){
           System.out.print("Enter your Student ID:");
            user=input.nextLine();
           System.out.print("Enter your password: ");
          String  pass=input.nextLine();
           System.out.println("\n");
            }else{
           System.out.print("Enter your Staff ID:");
            user=input.nextLine();
           System.out.print("Enter your password: ");
          String  pass=input.nextLine();
           System.out.println("\n");     
            }
        
        System.out.print("   _       __________    __________  __  _________    \n");
        System.out.print("  | |     / / ____/ /   / ____/ __ \\/  |/  / ____/    \n");
        System.out.print("  | | /| / / __/ / /   / /   / / / / /|_/ / __/       \n");
        System.out.print("  | |/ |/ / /___/ /___/ /___/ /_/ / /  / / /___       \n");
        System.out.print("  |__/|__/_____/_____/\\____/\\____/_/  /_/_____/       \n\n");
        System.out.println("User ID: "+user);
        
            if("1".equals(role)){
        System.out.print("   _________________________________________\n");
	System.out.print(" / \\                                        \\.\n");
	System.out.print("|   |            STUDENT  MENU               |.\n");
	System.out.print(" \\_ |_______________________________________|.\n");
	System.out.print("    |                                       |.\n");
        System.out.print("    |                                       |.\n");
        System.out.print("    |                                       |.\n");
	System.out.print("    |    1.Booking                          |.\n");
	System.out.print("    |    2.Profile                          |.\n");
        System.out.print("    |                                       |.\n");
      	System.out.print("    |    3.Exit                             |.\n");
        System.out.print("    |_______________________________________|.\n");
            }
            else {
        System.out.print("   _________________________________________\n");
	System.out.print(" / \\                                        \\.\n");
	System.out.print("|   |            ADMIN  MENU                 |.\n");
	System.out.print(" \\_ |_______________________________________|.\n");
	System.out.print("    |                                       |.\n");
        System.out.print("    |                                       |.\n");
	System.out.print("    |    1.BOOKING                          |.\n");
	System.out.print("    |    2.BLACKLIST                        |.\n");
	System.out.print("    |    3.PROFILE                          |.\n");
	System.out.print("    |    4.BLACKLIST                        |.\n");
        System.out.print("    |    5.REPORT                           |.\n");
        System.out.print("    |    6.Topic                            |.\n");
        System.out.print("    |    7.Room                             |.\n");
        System.out.print("    |                                       |.\n");
	System.out.print("    |    8.Exit                             |.\n");
        System.out.print("    |_______________________________________|.\n");
            }
        }
            return null;
    }}
    
  



