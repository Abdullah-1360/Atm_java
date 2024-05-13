package atm;
public class Transaction extends Account{
    
    Cashstock c= new Cashstock();
    public void depositfund(int funds, int acc, int pass) {
        
        Node n = validate(acc, pass);
        if (n != null) {
            
            n.balance += funds;
            System.out.println("Deposit successful. New balance: " + n.balance);
        } else {
            System.out.println("Account not found or invalid PIN.");
        }
    }
    protected void checkbal(int pass,int accnum){
        Node current=head;
        while(current!=null){
            if(accnum==current.accountnum&&pass==current.pin){
                System.out.println("Account No: "+current.accountnum);
                System.out.println("Balance: "+current.balance+" $"); 
                }
            current=current.next;
        }}
    public void withdraw(int amount, int acc, int pass) {

        Node n = validate(acc, pass);
        if (n != null) {
           
            if (c.withdrawal(amount)) {
                n.balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + n.balance);
            } else {
                System.out.println("Insufficient funds or invalid amount.");
            }
        } else {
            
            System.out.println("Account not found or invalid PIN.");
        }
    }
}
