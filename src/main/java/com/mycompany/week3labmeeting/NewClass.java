/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week3labmeeting;

import java.util.Scanner;

/**
 *
 * @author itlabs
 */

public class NewClass {
    
   public int lengthName( String l){
      
       return l.length();
   
       
   }
   
    public static void main(String[] args) {
        NewClass nc= new NewClass();
        
        int ln=nc.lengthName("ghjkl");
        System.out.println(""+ln);
        
    }
}
        
    

