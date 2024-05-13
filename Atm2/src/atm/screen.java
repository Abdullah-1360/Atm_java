package atm;

import static java.lang.System.exit;
import java.util.Scanner;

public class screen extends Account{
    Keypad k=new Keypad();Transaction t=new Transaction();
    Scanner s= new Scanner(System.in);
    Scanner cl= new Scanner(System.in);
    Scanner ck= new Scanner(System.in);
    private int acc,pass;
    int c=3,ch=1;
    public void welcomescreen(){
        System.out.println("*****Welcome******");
        try{
        while(validateacc(acc)==false){
        System.out.println("Please Enter 3-Digit Account number:");
        acc=k.inputaccnum();
        if(validateacc(acc)==false){
            System.out.println("Invalid Account");
        }}do{
            System.out.println("Enter 3-Digit pin");
        pass=k.inputpin();c--;
        if(validate(acc,pass)==null){
            System.out.println("Invalid PIN");
        }
        if(c==0){
            System.out.println("Out of Tries ");
            exit(0);
        }
        }while(c!=0&&validate(acc,pass)==null);
            }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }do{
            menu();
             ch=s.nextInt();
        switch(ch){
            case 1 -> t.checkbal(pass,acc);
            case 2 -> {
                System.out.println("Enter Amount to deposit");
                int fund = cl.nextInt();
                t.depositfund(fund, acc, pass);
                }
            case 3 -> {
                System.out.println("Enter amount to withdraw");
                int fund=ck.nextInt();
                t.withdraw(fund, acc, pass);
                }
            default -> exit(0);
                
        }}while(ch>0&&ch<4);
    }
    void menu(){
        System.out.println("*****Main Menu*****");
        System.out.println("1 -> Check Balance");
        System.out.println("2 -> Deposit amount");
        System.out.println("3 -> Withdraw amount");
        System.out.println("4 -> Exit");
       
        
    }
    
}
