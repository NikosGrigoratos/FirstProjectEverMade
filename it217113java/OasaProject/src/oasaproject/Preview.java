package oasaproject;

import java.util.*;
// just previews tickets
public class Preview {
    public void preview(HashMap totalTickets){    
        Scanner input = new Scanner(System.in);
        Menu menuObject = new Menu();
        menuObject.printAskForCode();
        int tmpcode = input.nextInt(); 
        Ticket tmp = (Ticket) totalTickets.get(tmpcode); 
        if(tmp.getDuration() > 0){
            int time = tmp.getDuration();
            String tmptoprint = time/24/60 + "days" + ":" + time/60%24+"hours" + ':' + time%60+"minutes";
            System.out.println("Type: " + tmp.getType()+ " Kind: " + tmp.getKind()+ " Duration: " + tmptoprint+ " Trips: " + tmp.getTrips()+ " Serial: " + tmp.getSerial() );
        }
        else{
            System.out.println("Type: " + tmp.getType()+ " Kind: " + tmp.getKind()+ " Duration: " + tmp.getDuration()+ " Trips: " + tmp.getTrips()+ " Serial: " + tmp.getSerial() );
        }
        
    }
}
