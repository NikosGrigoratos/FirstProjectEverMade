package oasaproject;
import java.util.*;
// creates non-discounted tickets
public class Normal {
    public int Normal(HashMap totalTickets, String tmp2){
        Scanner input = new Scanner(System.in);
        Menu menuObject = new Menu();
        Random rand = new Random();
        int n = rand.nextInt(50000000) + 1;
        if(tmp2.equals("trips")) {
            menuObject.printTripsAmount();
            int tripsAmount = input.nextInt();
            if(tripsAmount==1 || tripsAmount == 5 || tripsAmount==11){
                System.out.println("Price: " + (tripsAmount*1.4));
                menuObject.printType();
                int tmptype = input.nextInt();
                        if(tmptype == 1) {
                            System.out.println("Your ticket serial is " + n);
                            Ticket ticketObject= new Ticket("normal", "online", 0, tripsAmount, n);
                            totalTickets.put(n, ticketObject); //puts the ticket in the hashmap
                            menuObject.printEmail();
                            input.nextLine();
                            return n; // returns the ticket serial
                        }else if(tmptype == 2){
                            System.out.println("Your ticket serial is " + n);
                            Ticket ticketObject= new Ticket("normal", "printed", 0, tripsAmount, n);
                            totalTickets.put(n, ticketObject);
                            return n;
                        }else {
                            menuObject.printError();
                        }
            }else{
                menuObject.printError();
            }   // same for non-trips tickets
        }else if(tmp2.equals("duration")){
            menuObject.printDurationAmount();
            int durationAmount = input.nextInt();
            switch (durationAmount){
                case 1:
                    System.out.println("Price: " + "1.4");
                    System.out.println("Your ticket serial is " + n);
                    menuObject.printType();
                    int tmptype = input.nextInt();
                    if(tmptype == 1) {
                        Ticket ticketObject= new Ticket("normal", "online", 90, 0, n);
                        totalTickets.put(n, ticketObject);
                        menuObject.printEmail();
                        input.nextLine();
                        return n;
                    }else if(tmptype == 2){
                        Ticket ticketObject= new Ticket("normal", "printed", 90, 0, n);
                        totalTickets.put(n, ticketObject);
                        return n;
                    }else {
                        menuObject.printError();
                    }
                    break;
                case 2:
                    System.out.println("Price: " + "4.5");
                    System.out.println("Your ticket serial is " + n);
                    menuObject.printType();
                    tmptype = input.nextInt();
                    if(tmptype == 1) {
                        Ticket ticketObject= new Ticket("normal", "online", 1440, 0, n);
                        totalTickets.put(n, ticketObject);
                        menuObject.printEmail();
                        input.nextLine();
                        return n;
                    }else if(tmptype == 2){
                        Ticket ticketObject= new Ticket("normal", "printed", 1440, 0, n);
                        totalTickets.put(n, ticketObject);
                        menuObject.printEmail();
                        input.nextLine();
                        return n;
                    }else {
                        menuObject.printError();
                    }
                    break;
                case 3:
                    System.out.println("Price: " + "6.5");
                    System.out.println("Your ticket serial is " + n);
                    menuObject.printType();
                    tmptype = input.nextInt();
                    if(tmptype == 1) {
                        Ticket ticketObject= new Ticket("normal", "online", 10080, 0, n);
                        totalTickets.put(n, ticketObject);
                        menuObject.printEmail();
                        input.nextLine();
                        return n;
                    }else if(tmptype == 2){
                            Ticket ticketObject= new Ticket("normal", "printed", 10080, 0, n);
                            totalTickets.put(n, ticketObject);
                            menuObject.printEmail();
                            input.nextLine();
                            return n;
                    }else {
                        menuObject.printError();
                    }
                    break;
                case 4:
                    menuObject.printAskUserFirstName();
                    input.nextLine(); // throw away the /n
                    String tmpfirstname = input.nextLine();
                    menuObject.printAskUserSecondName();
                    String tmpsecondname = input.nextLine();
                    menuObject.print30DurationPrice();
                    menuObject.printHowToPay();
                    int tmppay = input.nextInt();
                    if(tmppay == 1) {
                        menuObject.printInsertCash();
                    }else if(tmppay == 2) {
                        menuObject.printInsertCard();
                    }else {
                        menuObject.printError();
                    }
                    System.out.println("Your ticket serial is " + n);
                    menuObject.printType();
                    tmptype = input.nextInt();
                    if(tmptype == 1) {
                        SubTicket subTicketObject = new SubTicket("normal", "online", 43200, 0, n, tmpfirstname, tmpsecondname);
                        totalTickets.put(n, subTicketObject);
                        menuObject.printEmail();
                        input.nextLine();
                        return n;
                    }else if(tmptype == 2){
                        SubTicket subTicketObject = new SubTicket("normal", "printed", 43200, 0, n, tmpfirstname, tmpsecondname);
                        totalTickets.put(n, subTicketObject);
                        return n;
                    }else {
                        menuObject.printError();
                    }
                    break;
                default:
                    menuObject.printError();
                    break;
                }
        }
    return 0;
    }    
}
    
                



