/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd_calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author maxim
 */
public class Gcd_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int gcd1 = 0;
        int gcd2 = 0;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("This is the gcd-Calculator");
        System.out.print("Erste Zahl: ");
        gcd1 = Integer.parseInt(br.readLine());
        System.out.print("Zweite Zahl: ");
        gcd2 = Integer.parseInt(br.readLine());
        
        
        while(gcd2 > 0)
	{
		int c = gcd1 % gcd2;
		gcd1 = gcd2;
		gcd2 = c;
	}
        System.out.println(gcd1);
    }
    
}
