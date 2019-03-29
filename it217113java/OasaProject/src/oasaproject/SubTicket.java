package oasaproject;
public class SubTicket extends Ticket{
      // class for tickets which require personal info, a Ticket's subclass 
    public SubTicket(String type, String kind, int duration, int trips, int serial, String firstname,
            String secondname) {
        super(type, kind, duration, trips, serial);
        this.firstname = firstname;
        this.secondname = secondname;
    }
   
    private String firstname;
    private String secondname;
   
   
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getSecondname() {
        return secondname;
    }
    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
   
   
}
