
package atm;

import java.util.Scanner;

public class Keypad {
    private String acc;
    private String password;
    Scanner sc =new Scanner(System.in);
    Scanner ab =new Scanner(System.in);

    public int inputaccnum(){
     try{
             acc=sc.nextLine();
             if(acc.length()!=3){
                 throw new IllegalArgumentException("Invalid account length");
             }
         }
         catch(IllegalArgumentException e){
             System.out.println("Exception"+e);
             
         }return Integer.parseInt(acc);
}
   public int inputpin(){
       try{
             password=ab.nextLine();
             
             if(password.length()!=3){
                 throw new IllegalArgumentException("Invalid PIN length. Please enter exactly 3 digits.");
             }
         }
         catch(Exception e){
             System.out.println("Exception"+e);
             
         }return Integer.parseInt(password);
}}
