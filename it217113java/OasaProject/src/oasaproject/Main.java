package oasaproject;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        int menuChoice;
        Scanner input = new Scanner(System.in);
        Menu menuObject = new Menu();
        HashMap<Integer, Ticket> totalTickets = new HashMap<Integer, Ticket>();
        Normal normalObject = new Normal();
        Reduced reducedObject = new Reduced();
        Renew renewObject = new Renew();
        Preview previewObject = new Preview();
        boolean flag = true;
        while(flag == true) {
            menuObject.printMainMenu();
            menuObject.printChoice();
            menuChoice = input.nextInt();
            switch (menuChoice) {
            case 1: // chooses to buy a ticket
                menuObject.printChoiceType();
                input.nextLine(); // throw away the /n
                String tmp = input.nextLine();
                if(tmp.equals("normal")) {
                    menuObject.printChoiceTripsDur();
                    String tmp2 = input.nextLine();
                    normalObject.Normal(totalTickets, tmp2); //calls normal class to create a new ticket
                }else if(tmp.equals("reduced")) {
                    menuObject.printChoiceTripsDur();
                    String tmp2 = input.nextLine();
                    reducedObject.Reduced(totalTickets, tmp2); //calls reduced class to create a new ticket
                }else {
                    menuObject.printError();
                }
                break;
            case 2:
                renewObject.Renew(totalTickets); // renews the ticket
                break;
            case 3:
                previewObject.preview(totalTickets); //previews ticket info
                break;
            }
            
    menuObject.printKeepRunning();
    int tmprun = input.nextInt();
    if (tmprun == 1) {
        flag = false;
    }
        }
    }
           
}
