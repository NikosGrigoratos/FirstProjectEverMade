package oasaproject;
import java.util.*;
// same as normal but for discounted tickets
public class Reduced {
    public int Reduced(HashMap totalTickets, String tmp2){
        Scanner input = new Scanner(System.in);
        Menu menuObject = new Menu();
        Random rand = new Random();
        int n = rand.nextInt(50000000) + 1;
        if(tmp2.equals("trips")) {
            menuObject.printTripsAmount();
            int tripsAmount = input.nextInt();
            if(tripsAmount==1 || tripsAmount == 5 || tripsAmount==11){
               System.out.println("Price: " + (tripsAmount*0.6));
               input.nextLine(); 
               menuObject.printAskUserFirstName();
                String tmpfirstname = input.nextLine();
                menuObject.printAskUserSecondName();
                String tmpsecondname = input.nextLine();
                menuObject.printType();
                int tmptype = input.nextInt();
                        if(tmptype == 1) {
                            System.out.println("Your ticket serial is " + n);
                            SubTicket subTicketObject= new SubTicket("reduced", "online", 0, tripsAmount, n, tmpfirstname, tmpsecondname);
                            totalTickets.put(n, subTicketObject);
                            menuObject.printEmail();
                            input.nextLine();
                            return n;
                        }else if(tmptype == 2){
                            System.out.println("Your ticket serial is " + n);
                            Ticket ticketObject= new Ticket("reduced", "printed", 0, tripsAmount, n);
                            totalTickets.put(n, ticketObject);
                            return n;
                        }else {
                            menuObject.printError();
                        }
            }else{
                menuObject.printError();
            }   
        }else if(tmp2.equals("duration")){
            menuObject.printDurationAmount();
            int durationAmount = input.nextInt();
            switch (durationAmount){
                case 1:
                    System.out.println("Price: " + "0.6");
                    input.nextLine();
                    menuObject.printAskUserFirstName();
                    String tmpfirstname = input.nextLine();
                    menuObject.printAskUserSecondName();
                    String tmpsecondname = input.nextLine();
                    System.out.println("Your ticket serial is " + n);
                    menuObject.printType();
                    int tmptype = input.nextInt();
                    if(tmptype == 1) {
                        SubTicket subTicketObject= new SubTicket("reduced", "online", 90, 0, n, tmpfirstname, tmpsecondname);
                        totalTickets.put(n, subTicketObject);
                        menuObject.printEmail();
                        input.nextLine();
                        return n;
                    }else if(tmptype == 2){
                        SubTicket subTicketObject= new SubTicket("reduced", "printed", 90, 0, n, tmpfirstname, tmpsecondname);
                        totalTickets.put(n, subTicketObject);
                        return n;
                    }else {
                        menuObject.printError();
                    }
                    break;
                case 2:
                    System.out.println("Price: " + "3.0");
                    input.nextLine();
                    menuObject.printAskUserFirstName();
                    tmpfirstname = input.nextLine();
                    menuObject.printAskUserSecondName();
                    tmpsecondname = input.nextLine();
                    System.out.println("Your ticket serial is " + n);
                    menuObject.printType();
                    tmptype = input.nextInt();
                    if(tmptype == 1) {
                        SubTicket subTicketObject= new SubTicket("reduced", "online", 1440, 0, n, tmpfirstname, tmpsecondname);
                        totalTickets.put(n, subTicketObject);
                        menuObject.printEmail();
                        input.nextLine();
                        return n;
                    }else if(tmptype == 2){
                        SubTicket subTicketObject= new SubTicket("reduced", "printed", 1440, 0, n, tmpfirstname, tmpsecondname);
                        totalTickets.put(n, subTicketObject);
                        return n;
                    }else {
                        menuObject.printError();
                    }
                    break;
                case 3:
                    System.out.println("Price: " + "4.5");
                    input.nextLine();
                    menuObject.printAskUserFirstName();
                    tmpfirstname = input.nextLine();
                    menuObject.printAskUserSecondName();
                    tmpsecondname = input.nextLine();
                    System.out.println("Your ticket serial is " + n);
                    menuObject.printType();
                    tmptype = input.nextInt();
                    if(tmptype == 1) {
                        SubTicket subTicketObject= new SubTicket("reduced", "online", 10080, 0, n, tmpfirstname, tmpsecondname);
                        totalTickets.put(n, subTicketObject);
                        menuObject.printEmail();
                        input.nextLine();
                        return n;
                    }else if(tmptype == 2){
                            SubTicket subTicketObject= new SubTicket("reduced", "printed", 10080, 0, n, tmpfirstname, tmpsecondname);
                            totalTickets.put(n, subTicketObject);
                            return n;
                    }else {
                        menuObject.printError();
                    }
                    break;
                case 4:
                    menuObject.printAskUserFirstName();
                    tmpfirstname = input.nextLine();
                    menuObject.printAskUserSecondName();
                    tmpsecondname = input.nextLine();
                    menuObject.print30DurationPriceReduced();
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
                        SubTicket subTicketObject = new SubTicket("reduced", "online", 43200, 0, n, tmpfirstname, tmpsecondname);
                        totalTickets.put(n, subTicketObject);
                        menuObject.printEmail();
                        input.nextLine();
                        return n;
                    }else if(tmptype == 2){
                        SubTicket subTicketObject = new SubTicket("reduced", "printed", 43200, 0, n, tmpfirstname, tmpsecondname);
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
                



