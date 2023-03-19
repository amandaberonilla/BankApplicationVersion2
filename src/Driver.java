// -----------------------------------------------------
// COMP 346 - Winter 2023
// Suha Abubakr [40120785 - Section NN]
// Amanda Beronilla [ 40228871- Section WW]
// Assignment # 2
// Due Date: March 18, 2023 at 11:59 PM
// -----------------------------------------------------


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author Kerly Titus
 */
public class Driver extends Thread {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Welcome Message
        displayMessage();

        /* Complete here the code for the main method ...*/
        // Network Thread
        Network objNetwork = new Network();
        objNetwork.start();

        // Server Threads
        Server objServer1 = new Server("Thread1");
        objServer1.start();
        Server objServer2 = new Server("Thread2");
        objServer2.start();
        Server objServer3 = new Server("Thread3");
        objServer3.start();

        // Client Threads
        Client objClient1 = new Client("sending");
        objClient1.start();
        Client objClient2 = new Client("receiving");
        objClient2.start();
    }

    public static void displayMessage() {
        System.out.println(ANSI_YELLOW + "----------------------------------------");
        System.out.println("         COMP 346 Assignment 2");
        System.out.println("     Suha Abubakr & Amanda Beronilla");
        System.out.println("----------------------------------------" + ANSI_RESET);
    }
    
 }
