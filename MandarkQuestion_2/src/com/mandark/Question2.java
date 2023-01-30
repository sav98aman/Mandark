package com.mandark;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Question2 {

	
public static void main(String[] args) {
        
    	try {
    		
    		
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            while (sc.hasNextLine()) {
            	String inputCommand = sc.nextLine();
//            	System.out.println(inputCommand);//input is Com
            	// Split Beacuse Perfrom operation On DataStr.
            	
            	String[] input=inputCommand.trim().split(",");
            
            	
            	if(input[1].equalsIgnoreCase("Manager") && input[2].equals("R&D")){
            		//write In Manager.csv file
            		System.out.println("Mager***");
            		String data = input[0]+input[0]+","+input[1]+","+input[2];
            		System.out.println(data);
	            		//write
	            		try {
	                        FileWriter writer = new FileWriter("C:\\Users\\Aman_pc\\Desktop\\Mandark\\MandarkQuestion_2\\Input\\manager.csv", true);
	                        writer.write(data);
	                        writer.write("\r\n");   // write new line
	
	                        writer.close();
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    }
            		
            	}
            	//Single Name File Wirte
            	
            	String[] name=input[0].split(" ");
            	if(name.length==1) {
            		System.out.println("Sibgle Na,e*******************");
            		String data = input[0]+input[0]+","+input[1]+","+input[2];
            		System.out.println(data);
	//            		write
	            		try {
	                        FileWriter writer = new FileWriter("C:\\Users\\Aman_pc\\Desktop\\Mandark\\MandarkQuestion_2\\Input\\single_name_employees.csv", true);
	                        writer.write(data);
	                        writer.write("\r\n");   // write new line
	                        writer.close();
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    }
            	}
            	
            	
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
        	System.err.println(e.getMessage());
        }
        
    }
}
