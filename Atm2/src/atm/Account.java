package atm;

class Node {
    int accountnum;
   int pin;
   int balance;
     Node next;

    public Node(int accountnum, int pin, int balance) {
        this.accountnum = accountnum;
        this.pin = pin;
        this.balance = balance;
        this.next = null;
    }

    public Node() {
    }

    

}public class Account {
  Node head;
   
Node addacc(int accountnum, int pin, int balance) {
        Node newNode = new Node(accountnum,pin,balance);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
    public Account() {
        createaccount();
   }
     

    public void createaccount() {
      head= addacc(123,123,100);
      head=  addacc(456,456,400);
      head=  addacc(789,789,700);
    }
   
    public boolean validateacc(int accnum){
        Node current=head; 
        while(current!=null){
            if(accnum==current.accountnum){
                
                    return true;
                }
            current=current.next;
        }
    return false;
}
    public Node validate(int accnum,int pass){
        Node current=head; 
        while(current!=null){
            if(accnum==current.accountnum){
                if(pass==current.pin){
                    return current;
                }}
            current=current.next;
        }
    return null;
}
}
        
    

