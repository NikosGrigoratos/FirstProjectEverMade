package oasaproject;
import java.util.*;
 //Ticket class to create ticket objects
public class Ticket {
   
    private String type; // "normal" "reduced"
    private String kind; // "online" "printed"
    private int duration; // in minutes
    private int trips;
    private int serial;
 
    public Ticket(String type, String kind, int duration, int trips, int serial) {
        super();
        this.type = type;
        this.kind = kind;
        this.duration = duration;
        this.trips = trips;
        this.serial = serial;
    }
 
    public String getType() {
        return type;
    }
   
    public String getKind() {
        return kind;
    }
   
    public int getDuration() {
        return duration;
    }
   
    public int getTrips() {
        return trips;
    }
   
    public void setType(String newType) {
        type = newType;
    }
   
    public void setKind(String newKind) {
        kind = newKind;
    }
   
    public void setDuration(int newDuration) {
        duration = newDuration;
    }
   
    public void setTrips(int newTrips) {
        trips = newTrips;
    }
 
    public int getSerial() {
        return serial;
    }
 
    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Ticket{" + "type=" + type + ", kind=" + kind + ", duration=" + duration + ", trips=" + trips + ", serial=" + serial + '}';
    }
   
    
   
}