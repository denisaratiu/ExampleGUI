/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author ratid6445
 */
public class TextFileEg {
    // contact list
    private Contact[] contacts;
    private int position = 0;
    
    // constructor
    public TextFileEg(){
    // create a blank file reader
        FileReader file = null;
        try {
            // fix this proper loading later
            URL url = TextFileExample.class.getResource("input.txt");
            System.out.println(url);
            
 
            // all of the file reading
            // creating the file reader
            file = new FileReader(url.getFile());
        } catch (Exception e) {
            // handle any errors
            // print out the lovely red errors
            e.printStackTrace();
            //exit the program
            System.exit(0);
        }
        
        // use a scanner with the file
        Scanner in = new Scanner(file);
        
        // get the number of addresses 
        int numAddresses = in.nextInt();
        //System.out.println(numAddresses);
        
        // move to the next line
        in.nextLine();
        
        // create an empty roladex
        contacts = new Contact[numAddresses];
        
        // go through the file
        for(int i = 0; i < numAddresses; i++){
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine().trim();
            // create the contact using that information
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNumber(phone);
            // add contact to list
            contacts[i] = c;
        }
    }
    
    public String getName(){
    return contacts[position].getName();
    }
    
    public String getPhone(){
        return contacts[position].getPhone();
    }
    
    public String getEmail(){
        return contacts[position].getEmail();
    }
    
    public int numContacts(){
        return contacts.length;
    }
    
    public int getPosition(){
        return position;
    }
    
    public void next(){
        // if there is another contact
        if(position < contacts.length-1){
            // move to the next spot
            position++;
        }
    }
    
    public void prev(){
        if(position > 0){
            position--;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // create a blank file reader
        FileReader file = null;
        try {
            // fix this proper loading later
            URL url = TextFileExample.class.getResource("input.txt");
            System.out.println(url);
            
 
            // all of the file reading
            // creating the file reader
            file = new FileReader(url.getFile());
        } catch (Exception e) {
            // handle any errors
            // print out the lovely red errors
            e.printStackTrace();
            //exit the program
            System.exit(0);
        }
        
        // use a scanner with the file
        Scanner in = new Scanner(file);
        
        // get the number of addresses 
        int numAddresses = in.nextInt();
        //System.out.println(numAddresses);
        
        // move to the next line
        in.nextLine();
        
        // create an empty roladex
        Contact[] contacts = new Contact[numAddresses];
        
        // go through the file
        for(int i = 0; i < numAddresses; i++){
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine().trim();
            // create the contact using that information
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNumber(phone);
            // add contact to list
            contacts[i] = c;
        }
    }
    }

