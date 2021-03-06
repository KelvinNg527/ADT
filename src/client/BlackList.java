/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.Scanner;
import entity.student;
import java.text.ParseException;
import adt.HashMapInterface;
import static client.home.blacklists;

/**
 *
 * @author KELVIN
 */
public class BlackList {


    public  void blMenu(){
        Scanner sc = new Scanner(System.in);
        home hm = new home();
        int selection;
        
        System.out.println("\n");
        System.out.print("    __________________________\n");
        System.out.print("   | |      Black List      | |\n");
        System.out.print("   | |______________________| |\n");
        System.out.print("   | |                      | |\n");
        System.out.print("   | | 1.Add                | |\n");
        System.out.print("   | | 2.Search             | |\n");
        System.out.print("   | | 3.Remove             | |\n");
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
                        System.out.print("( _ __)               Blacklist Add                  (__  _)\n");
                        System.out.print("(__  _)                                              (__  _)\n");
                        System.out.print("(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.(_ ___)\n");
                        System.out.print("`-._.-'                                              `-._.-'\n");
                        
   

                Scanner value = new Scanner(System.in);
                 System.out.print("Please enter  student ID:");
                String key = value.nextLine();
                System.out.print("Please enter  Name: ");
                String name = value.nextLine();
                System.out.print("Please enter reason to blacklist:");
                String reason = value.nextLine();
                System.out.println("");
                
                if (blacklists.search(key) == null)
                {
                blacklists.add(key, new student(key, name, reason));

                System.out.println("Student ID:"+key+" Blacklisted");
                System.out.println("");
                 System.out.println(blacklists.search(key));
                 
                Scanner s=new Scanner(System.in);
                System.out.println("Press Enter to Continue");
                s.nextLine();
                blMenu();
                }
                else{
                System.out.println("Error!This student had been blacklisted. Please try again.");
                System.out.println("");
                Scanner s=new Scanner(System.in);
                System.out.println("Do you want to insert again?(y=yes/n=no)");
                s.nextLine();
                
                if("y".equals(s)){
                add();
                }else if("n".equals(s)){
                        blMenu();
                }else{
                   System.out.print("Input invalid!!");                              
                    blMenu();
  
                }
                        
                     }
                
                 }
                
     
        
       private void search(){

                        Scanner sc = new Scanner(System.in);
                        System.out.print(".-=~=-.                                                  .-=~=-.\n");
                        System.out.print("(__  _)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=--(__  _)\n");
                        System.out.print("( _ __)                                                  (__  _)\n");
                        System.out.print("( _ __)                 Blacklist search                 (__  _)\n");
                        System.out.print("(__  _)                                                  (__  _)\n");
                        System.out.print("(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-.=-(_ ___)\n");
                        System.out.print("`-._.-'                                                  `-._.-'\n");
                         System.out.print("Please enter your student ID to search: ");
                          Scanner index = new Scanner(System.in);
                          String studentID = index.nextLine();
                          System.out.println("");
                          System.out.println(blacklists.search(studentID));
                          System.out.println("");
                          System.out.println("Do you want to search again?(y=yes/n=no)");
                          String s = index.nextLine();                                 
                              if("y".equals(s)){
                                 search();
                            }else if("n".equals(s)){
                                blMenu();
                              }else{
                           System.out.print("Input invalid!!");                              
                                      blMenu();
                            }
                        
                     }
                          
                      
       
       private void remove(){
                        System.out.print(".-=~=-.                                                 .-=~=-.\n");
                        System.out.print("(__  _)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-(__  _)\n");
                        System.out.print("( _ __)                                                 (__  _)\n");
                        System.out.print("( _ __)               Blacklist remove                  (__  _)\n");
                        System.out.print("(__  _)                                                 (__  _)\n");
                        System.out.print("(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-.=(_ ___)\n");
                        System.out.print("`-._.-'                                                  `-._.-'\n");
                        System.out.print("Please enter your student ID to remove: ");
                          Scanner index = new Scanner(System.in);
                          String studentID = index.nextLine();
                          System.out.println("");
                          System.out.println(blacklists.remove(studentID));
                          blacklists.displayAll();
                          System.out.println("");
                          System.out.println("Do you want to remove again?(y=yes/n=no)");
                          String s = index.nextLine();                                 
                              if("y".equals(s)){
                                 remove();
                            }else if("n".equals(s)){
                                blMenu();
                              }else{
                           System.out.print("Input invalid!!");                              
                                      blMenu();
                            }
                        
                     }
       

       private void display(){


                        System.out.print(".-=~=-.                                                 .-=~=-.\n");
                        System.out.print("(__  _)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-(__  _)\n");
                        System.out.print("( _ __)                                                 (__  _)\n");
                        System.out.print("( _ __)                  BlackList                      (__  _)\n");
                        System.out.print("(__  _)                                                 (__  _)\n");
                        System.out.print("(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-.=(_ ___)\n");
                        System.out.print("`-._.-'                                                  `-._.-'\n");
                                   //Scanner index = new Scanner(System.in);
                //System.out.print("Please enter the key of Developer: ");
               // String keyIndex = index.nextLine();
                System.out.println("");
                blacklists.displayAll();
                System.out.println("");
                Scanner s=new Scanner(System.in);
                System.out.println("Press Enter to Continue");
                s.nextLine();
                blMenu();
                
       }
}

