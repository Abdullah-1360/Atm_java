package atm;

public class Cashstock {
    int note_10=0;
    int note_50=0;
    int note_100=0;
   public boolean withdrawal(int amount) {
    while (amount >= 100 ) {
        amount -= 100;
        note_100++;
    }
    while (amount >= 50 ) {
        amount -= 50;
        note_50++;
    }
    while (amount >= 10 ) {
        amount -= 10;
        note_10++;
    }
    if (amount != 0) {
        System.out.println("Invalid Amount. Unable to dispense.");
        return false;
    }
    
    System.out.println(note_100 + ": 100$");
    System.out.println(note_50 + ":  50$");
    System.out.println(note_10 + ":  10$");
    System.out.println("Withdrawn successfully");

    note_10 = 0;
    note_50 = 0;
    note_100 = 0;
    
    return true;
}

}
