package oasaproject;
import java.util.*;
 // just a class to print
public class Menu {
    public void printKeepRunning() {
        System.out.println("Do you want to exit?(Press 1 to exit or 2 to continue)");
    }
    public void printError() {
        System.out.println("Invalid option");
    }
    public void printMainMenu () {
        System.out.println("1. Buy your ticket\n2. Reload your ticket\n3. Preview your ticket information\n");
    }
    public void printChoice () {
        System.out.println("Put the number of the choice you want\n");
    }
    public void printChoiceType () {
        System.out.println("Do you want normal or reduced ticket? (Type 'normal' for normal or 'reduced' for reduced)\n");
    }
    public void printChoiceTripsDur () {
        System.out.println("Do you want a specific amount of trips or a specific duration? (Press 'trips' for trips or 'duration' for duration\n");
    }
    public void printTripsAmount () {
        System.out.println("How many trips do you want?(1 or 5 or 11)\n");
    }
    public void printDurationAmount () {
        System.out.println("Which duration do you want?(1. 90mins, 2. daily, 3. weekly, 4. monthly) (Type 1-4))\n");
    }
    public void printAskUserFirstName () {
        System.out.println("Give your first name please");
    }
    public void printAskUserSecondName () {
        System.out.println("Give your second name please");
    }
    public void printHowToPay () {
        System.out.println("Press 1 to pay with cash or press 2 to pay with debit or credit card");
    }
    public void printInsertCash () {
        System.out.println("Insert the cash to the machine");
    }
    public void printInsertCard () {
        System.out.println("Insert the card to the machine");
    }
    public void printType () {
        System.out.println("Press 1 for online ticket or 2 for printed");
    }
    public void print30DurationPrice () {
        System.out.println("Price is 30 euros");
    }
    public void print30DurationPriceReduced () {
        System.out.println("Price is 15 euros");
    }
    public void printAskForCode (){
        System.out.println("Type the serial of the ticket");
    }
    public void printMoreTrips (){
        System.out.println("How many more trips you need?");
    }
    public void printMoreDuration (){
        System.out.println("How much more duration you need?");
    }
    public void printDone (){
        System.out.println("Done");
    }
    public void printEmail (){
        System.out.println("Type your email please");
    }
}
