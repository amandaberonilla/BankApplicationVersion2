

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author Kerly Titus
 */
public class Driver extends Thread {

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
    
 }
