/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import static client.home.deactivation;
import java.util.Scanner;
import entity.admin;

/**
 *
 * @author KELVIN
 */
public class DeactivationAm {


    public  void daMenu(){
        Scanner sc = new Scanner(System.in);
        home hm = new home();
        int selection;
        
        System.out.println("\n");
        System.out.print("    __________________________\n");
        System.out.print("   | |  Admin Deactivation  | |\n");
        System.out.print("   | |______________________| |\n");
        System.out.print("   | |                      | |\n");
        System.out.print("   | | 1.Add                | |\n");
        System.out.print("   | | 2.Search             | |\n");
        System.out.print("   | | 3.Activate           | |\n");
        System.out.print("   | | 4.Display            | |\n");
        System.out.print("   | |                      | |\n");
        System.out.print("   | | 5.Exit               | |\n");
        System.out.print("   |_|______________________|_|\n");
        System.out.print("\n");

      do{
             System.out.print("Enter your selection: ");
             selection = sc.nextInt();
            if(selection>6||selection<1){
                System.out.println("\nThe Selection is Not Valid!!!!\nPlease Try Again\n");
            }else{
                switch(selection){
                    case 1:
                        add();
                        break;

                    case 2:
                        search();
                        break;

                    case 3:
                        remove();
                        break;
                    case 4:
                        display();
                        break;

                    default:
                        hm.admin();
                        break;

                }
            }
          
      }while(selection>6||selection<1);
        
    }
        public void add(){

    
                        System.out.print(".-=~=-.                                              .-=~=-.\n");
                        System.out.print("(__  _)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.(__  _)\n");
                        System.out.print("( _ __)                                              (__  _)\n");
                        System.out.print("( _ __)               Deactivation admin             (__  _)\n");
                        System.out.print("(__  _)                                              (__  _)\n");
                        System.out.print("(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.(_ ___)\n");
                        System.out.print("`-._.-'                                              `-._.-'\n");
                        
   

                Scanner value = new Scanner(System.in);
                 System.out.print("Please enter  admin ID:");
                String key = value.nextLine();
                System.out.print("Please enter  Name: ");
                String name = value.nextLine();
                System.out.print("Please enter reason to deactivate:");
                String reason = value.nextLine();
                System.out.println("");
                
                if (deactivation.search(key) == null)
                {
                deactivation.add(key,new admin(key, name, reason));

                System.out.println("Admin ID:"+key+" Deactivated");
                System.out.println("");
                 System.out.println(deactivation.search(key));
                 
                Scanner s=new Scanner(System.in);
                System.out.println("Press Enter to Continue");
                s.nextLine();
                daMenu();
                }
                else{
                System.out.println("Error!This admin had been deactivated. Please try again.");
                System.out.println("");
                Scanner s=new Scanner(System.in);
                System.out.println("Do you want to insert again?(y=yes/n=no)");
                s.nextLine();
                
                if("y".equals(s)){
                add();
                }else if("n".equals(s)){
                        daMenu();
                }else{
                   System.out.print("Input invalid!!");                              
                    daMenu();
                }
                        
                     }
                
                 }
                
     
        
       private void search(){

                        Scanner sc = new Scanner(System.in);
                        System.out.print(".-=~=-.                                                  .-=~=-.\n");
                        System.out.print("(__  _)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=--(__  _)\n");
                        System.out.print("( _ __)                                                  (__  _)\n");
                        System.out.print("( _ __)                 Deactivation search              (__  _)\n");
                        System.out.print("(__  _)                                                  (__  _)\n");
                        System.out.print("(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-.=-(_ ___)\n");
                        System.out.print("`-._.-'                                                  `-._.-'\n");
                        System.out.print("Please enter your admin ID to search: ");
                          Scanner index = new Scanner(System.in);
                          String studentID = index.nextLine();
                          System.out.println("");
                          System.out.println(deactivation.search(studentID));
                          System.out.println("");
                          System.out.println("Do you want to search again?(y=yes/n=no)");
                          String s = index.nextLine();                                 
                              if("y".equals(s)){
                                 search();
                            }else if("n".equals(s)){
                                daMenu();
                              }else{
                           System.out.print("Input invalid!!");                              
                                      daMenu();
                            }
                        
                     }
                          
                      
       
       private void remove(){
                        System.out.print(".-=~=-.                                                 .-=~=-.\n");
                        System.out.print("(__  _)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-(__  _)\n");
                        System.out.print("( _ __)                                                 (__  _)\n");
                        System.out.print("( _ __)               Activation admin                  (__  _)\n");
                        System.out.print("(__  _)                                                 (__  _)\n");
                        System.out.print("(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-.=(_ ___)\n");
                        System.out.print("`-._.-'                                                  `-._.-'\n");
                        System.out.print("Please enter your admin ID to remove: ");
                          Scanner index = new Scanner(System.in);
                          String studentID = index.nextLine();
                          System.out.println("");
                          System.out.println(deactivation.remove(studentID));
                          deactivation.displayAll();
                          System.out.println("");
                          System.out.println("Do you want to remove again?(y=yes/n=no)");
                          String s = index.nextLine();                                 
                              if("y".equals(s)){
                                 remove();
                            }else if("n".equals(s)){
                                daMenu();
                              }else{
                           System.out.print("Input invalid!!");                              
                                      daMenu();
                            }
                        
                     }
       

       private void display(){


                        System.out.print(".-=~=-.                                                 .-=~=-.\n");
                        System.out.print("(__  _)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-(__  _)\n");
                        System.out.print("( _ __)                                                 (__  _)\n");
                        System.out.print("( _ __)             Deactivation List                   (__  _)\n");
                        System.out.print("(__  _)                                                 (__  _)\n");
                        System.out.print("(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-.=(_ ___)\n");
                        System.out.print("`-._.-'                                                  `-._.-'\n");
        
                        
                System.out.println("");
                deactivation.displayAll();
                System.out.println("");
                Scanner s=new Scanner(System.in);
                System.out.println("Press Enter to Continue");
                s.nextLine();
                daMenu();
                
       }
}

