/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author KELVIN
 */
 

import adt.Hashing;
import entity.student;
import entity.admin;
import java.util.Date;
import java.util.Scanner;
import adt.HashMapInterface;
import java.text.ParseException;
public class home {
     
    public static HashMapInterface<String, student> blacklists = new Hashing<>();         
    public static HashMapInterface<String, admin> deactivation = new Hashing<>();         

    public static void main(String[] args) throws ParseException {
            home hm = new home();

            hm.initialize();
            hm.menu();   
        }  
  
    public void initialize() throws ParseException {
             

             blacklists.add("2001123",new student("2001123","Ng Ka Fai","Check out late"));
             blacklists.add("2001124",new student("2001124","Cheong Ai Yan","Throw Rubbish"));
             blacklists.add("2001125",new student("2001125","Yeok Jia Wei","Make noise"));
             blacklists.add("2001126",new student("2001126","Ng Mei Mei","Vandalisme"));
             blacklists.add("2001122",new student("2001112","Liu Poh Yee","Check out late"));
             blacklists.add("2002324",new student("2002324","Muhamad Ahamd","Throw Rubbish"));
             blacklists.add("2001245",new student("2001245","Wee Yu Ooi","Make noise"));
             blacklists.add("2008726",new student("2008726","Jay Chou","Vandalisme"));   
             blacklists.add("2008736",new student("2008736","Goh Li Ying","Involved in Fighting"));
             blacklists.add("2008712",new student("2008712","Wong Li Xin","Vandalisme"));   
             blacklists.add("2008711",new student("2008711","Cheah Ker Xin","Speak bad words")); 
             blacklists.add("2002323",new student("2002323","Yew Chee Kin","Destroy Computer"));
             
             deactivation.add("AD12352",new admin("AD12352","Lai Yoke Sam","Lomg leave"));
             deactivation.add("AD12353",new admin("AD12353","Celine Kuan Xie Ern","Part time admin"));
             deactivation.add("AD12354",new admin("AD12354","Chuin Kai See","Long Leave"));
             deactivation.add("AD12355",new admin("AD12355","Ali Mohamad","Part time admin"));
             deactivation.add("AD12356",new admin("AD12356","Liu Pui Yee","Part time admin"));
             deactivation.add("AD12357",new admin("AD12357","Muhamad Farzi","Part time admin"));
             deactivation.add("AD12358",new admin("AD12358","Wee Li Li","Part time admin"));
             deactivation.add("AD12359",new admin("AD12359","Wang Li Hong","Long Leave"));   
             deactivation.add("AD12360",new admin("AD12360","Wu Yi Yan","Involved in Fighting"));
             deactivation.add("AD13454",new admin("AD12354","Wong See Jun","Long Leave"));   
             deactivation.add("AD12351",new admin("AD12351","Ooi Jun Pee","Long Leave")); 
             deactivation.add("AD12352",new admin("AD12352","Yew Kin Wei","Long Leave"));

         }
    
    
    public  void menu() {

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
        login();

    }
  
    public  void login(){

        try(Scanner input=new Scanner(System.in)){
        System.out.print("Enter your role: ");
        String role=input.nextLine();
       if("1".equals(role)){
             System.out.print("Enter your Student ID:");
           String user=input.nextLine();
           System.out.print("Enter your password: ");
          String  pass=input.nextLine();
          if(blacklists.search(user)!=null){
                      System.out.print("\n");
                      System.out.print("\n");
                System.out.println("Student ID "+user+" Blacklisted.Please contact administrator");
                        System.out.print("\n");
                 System.out.println("Press Enter to Continue");
                                 Scanner s=new Scanner(System.in);
                                s.nextLine();
                                  menu();
          }else{
          
        System.out.print("   _       __________    __________  __  _________    \n");
        System.out.print("  | |     / / ____/ /   / ____/ __ \\/  |/  / ____/    \n");
        System.out.print("  | | /| / / __/ / /   / /   / / / / /|_/ / __/       \n");
        System.out.print("  | |/ |/ / /___/ /___/ /___/ /_/ / /  / / /___       \n");
        System.out.print("  |__/|__/_____/_____/\\____/\\____/_/  /_/_____/       \n\n");
        System.out.println("User ID: "+user);
              student();
          }
            }
            else if("2".equals(role)){
           System.out.print("Enter your Student ID:");
           String user=input.nextLine();
           System.out.print("Enter your password: ");
          String  pass=input.nextLine();
           if(deactivation.search(user)!=null){
                      System.out.print("\n");
                      System.out.print("\n");
                System.out.println("Admin ID "+user+" Deactivated.Please contact administrator");
                        System.out.print("\n");
                 System.out.println("Press Enter to Continue");
                                 Scanner s=new Scanner(System.in);
                                s.nextLine();
                                  menu();
           }else{
          
        System.out.print("   _       __________    __________  __  _________    \n");
        System.out.print("  | |     / / ____/ /   / ____/ __ \\/  |/  / ____/    \n");
        System.out.print("  | | /| / / __/ / /   / /   / / / / /|_/ / __/       \n");
        System.out.print("  | |/ |/ / /___/ /___/ /___/ /_/ / /  / / /___       \n");
        System.out.print("  |__/|__/_____/_____/\\____/\\____/_/  /_/_____/       \n\n");
        System.out.println("User ID: "+user);
              admin();
            }
            }
            else{
              System.out.println("\nThe Selection is Not in 1 or 2!!!!\nPlease Try Again\n");
              menu();
              }
       
                  
     
    }}
    public void  student(){
          
                 int selection;
        Scanner sc = new Scanner(System.in);
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
                do{
            System.out.print("Enter your selection: ");
                selection = sc.nextInt();

            if(selection>6||selection<1){
                System.out.println("\nThe Selection is Not Valid!!!!\nPlease Try Again\n");
            }
                else{
                  switch (selection) {
                      case 1:
                        break;
                      case 2:
                        break;
                      default:
                        menu();
                        break;
                        }
            }
      }while(selection<1||selection>3);
        
    }
    
    public void admin(){
             BlackList bl=new BlackList();
             DeactivationAm da=new DeactivationAm();

             int selection;
      
        
        Scanner sc = new Scanner(System.in);

         System.out.print("   _________________________________________\n");
	System.out.print(" / \\                                        \\.\n");
	System.out.print("|   |            ADMIN  MENU                 |.\n");
	System.out.print(" \\_ |_______________________________________|.\n");
	System.out.print("    |                                       |.\n");
        System.out.print("    |                                       |.\n");
	System.out.print("    |    1.BOOKING                          |.\n");
	System.out.print("    |    2.STUDENT PROFILE                  |.\n");
	System.out.print("    |    3.STAFF PROFILE                    |.\n");
	System.out.print("    |    4.BLACKLIST STUDENT                |.\n");
        System.out.print("    |    5.REPORT                           |.\n");
        System.out.print("    |    6.ROOM                             |.\n");
        System.out.print("    |    7.DEACTIVATION ADMIN               |.\n");
        System.out.print("    |                                       |.\n");
	System.out.print("    |    8.Exit                             |.\n");
        System.out.print("    |_______________________________________|.\n");
         do{
            System.out.print("Enter your selection: ");
                selection = sc.nextInt();

            if(selection>7||selection<1){
                System.out.println("\nThe Selection is Not Valid!!!!\nPlease Try Again\n");
            }
                else{
                  switch (selection) {
                      case 1:
                        break;
                      case 2:
                        break;
                      case 3:
                        break;
                      case 4:
                          bl.blMenu();
                          break;
                      case 5:
                        break;
                      case 6:
                        break;
                      case 7:
                          da.daMenu();
                          break;
                      default:
                        menu();
                        break;
                        }
            }
        
      }while(selection<1||selection>7);
    }
    
    

}
    
  



