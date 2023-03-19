

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
//        try{
//            PrintStream output = new PrintStream("Test_unsynchronized.txt");
//            System.setOut(output);
//        }catch(FileNotFoundException e){
//            System.out.println("FILE NOT FOUND");
//            System.exit(0);
//        }
        Network objNetwork = new Network();            /* Activate the network */
        objNetwork.start();
        Server server1 = new Server("Server1");
        server1.start();
        Server server2 = new Server("Server2");
        server2.start();
//        Server server3 = new Server("Server3");
//        server3.start();
        Client objClient1 = new Client("sending");          /* Start the sending client thread */
        objClient1.start();
        Client objClient2 = new Client("receiving");        /* Start the receiving client thread */
        objClient2.start();
        
      /*..............................................................................................................................................................*/
       
    }
    
 }
