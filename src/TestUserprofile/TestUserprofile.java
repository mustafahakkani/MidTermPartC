/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUserprofile;

import java.util.Scanner;

/**
 *
 * @author musta
 */
public class TestUserprofile {
    public static void main(String[] args)
    {
       String[] genres = {"Drama", "Action", "Comedy", "Mystery"};
       System.out.println("genres: ");
        for (String genre : genres) {
            System.out.println("    " + genre);
        }
        Scanner scn1=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=scn1.nextLine();
       
        Scanner scn2=new Scanner(System.in);
        System.out.print("Genre: ");
        String gen;
        gen = scn1.nextLine();
     
        System.out.println("Profile is created!");
        
        
    }
    
}