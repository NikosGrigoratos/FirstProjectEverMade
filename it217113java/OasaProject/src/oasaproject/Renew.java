package oasaproject;

import java.util.*;

public class Renew {
    public void Renew(HashMap totalTickets){
        Scanner input = new Scanner(System.in);
        Menu menuObject = new Menu();
        Normal normalObject = new Normal();
        Reduced reducedObject = new Reduced();
        int code; //code of the new ticket
        menuObject.printAskForCode();
        int tmpcode = input.nextInt(); //code of the old ticket
        Ticket tmp = (Ticket) totalTickets.get(tmpcode); //old ticket
        if(tmp.getType().equals("normal")){
            if(tmp.getTrips() == 0){
                //duration tickets here
                code = normalObject.Normal(totalTickets, "duration"); // purchases new ticket and gets the serial as return
                Ticket newTicket = (Ticket) totalTickets.get(code); //new ticket
                int tmpolddur = tmp.getDuration(); // old duration
                int tmpnewdur = newTicket.getDuration(); //new duration
                int totaldur = tmpolddur + tmpnewdur; // old + new duration
                String oldKind = tmp.getKind();
                Ticket ticketObject= new Ticket("normal", oldKind, 0, totaldur, code); // creates the new ticket object
                totalTickets.put(code, ticketObject); // puts the new ticket object to the hasmap with the new code
                totalTickets.remove(tmpcode); //  removed the old ticket viia key
                menuObject.printDone();
            // same goes to above but for discounted tickets
            }else{
                //trips tickets here
                //System.out.println(totalTickets.get(tmpcode)); old ticket
                code = normalObject.Normal(totalTickets, "trips");
                Ticket newTicket = (Ticket) totalTickets.get(code); //new ticket
                //System.out.println(totalTickets.get(code)); new ticket
                int tmpoldtrips = tmp.getTrips(); // old trips
                int tmpnewtrips = newTicket.getTrips(); //new trips
                int totalTrips = tmpoldtrips + tmpnewtrips;
                String oldKind = tmp.getKind();
                Ticket ticketObject= new Ticket("normal", oldKind, 0, totalTrips, code);
                totalTickets.put(code, ticketObject);
                totalTickets.remove(tmpcode);
                menuObject.printDone();
            }
        }else{
            if(tmp.getTrips() == 0){
                //duration tickets here
                code = reducedObject.Reduced(totalTickets, "duration");
                Ticket newTicket = (Ticket) totalTickets.get(code); //new ticket
                int tmpolddur = tmp.getDuration(); // old duration
                int tmpnewdur = newTicket.getDuration(); //new duration
                int totaldur = tmpolddur + tmpnewdur;
                String oldKind = tmp.getKind();
                Ticket ticketObject= new Ticket("reduced", oldKind, 0, totaldur, code);
                totalTickets.put(code, ticketObject);
                totalTickets.remove(tmpcode);
                menuObject.printDone();
            }else{
                //trips tickets here
                code = reducedObject.Reduced(totalTickets, "trips");
                Ticket newTicket = (Ticket) totalTickets.get(code); //new ticket
                int tmpoldtrips = tmp.getTrips(); // old trips
                int tmpnewtrips = newTicket.getTrips(); //new trips
                int totalTrips = tmpoldtrips + tmpnewtrips;
                String oldKind = tmp.getKind();
                Ticket ticketObject= new Ticket("reduced", oldKind, 0, totalTrips, code);
                totalTickets.put(code, ticketObject);
                totalTickets.remove(tmpcode);
                menuObject.printDone();
            }
        }
    }
}
