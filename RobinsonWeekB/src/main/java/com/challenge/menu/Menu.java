package com.challenge.menu;

import java.util.Scanner;

import com.challenge.bean.One4All;
import com.challenge.writer.TeamLog;


public class Menu {
	
	static Scanner newUA = new Scanner(System.in);
	
	public static void  firstMenu() {
		
		System.out.println("Welcome to  UA the world's greatest hero school.");
		System.out.println("Would you like to be the next PLUS ULTRA hero of this generation?  (y/n)");
		
		String opt  = newUA.nextLine();
		switch (opt) {
		
		case "y":
			createHero();
			break;
		case "n":
			System.out.println("Nani desu ka?! Get out of here then! Baka!");
			break;
		default:
			System.out.println("Input not recognized, please use y or n");
			firstMenu();
		}
	}
	
	public static void createHero() {
		System.out.println("Your One4All PLUS ULTRA team will include 5 key members.");
		System.out.println("Every team needs an under dog to to motivate them. What's the name of yours?");
		String udHero = newUA.nextLine();
		System.out.println("No UA team is successful without someone to gather intelligence. Name your spy hero.");
		String spyHero = newUA.nextLine();
		System.out.println("Would it be a hero team without your hotheaded powerhouse? Who is (s)she?");
		String phHero = newUA.nextLine();
		System.out.println("No matter how PLUS ULTRA, your team will need the help and advice of a seasoned Hero. Name your senpai:");
		String supHero = newUA.nextLine();
		System.out.println("By manditory obligation you gotta take an emo kid with you. Sorry I don't make the rules. Who you draggin'?");
		String emoHero = newUA.nextLine();
		
		 One4All newTeam = new One4All(udHero,spyHero,phHero,supHero,emoHero);
		 TeamLog.logTeam("info", "Your PLUS ULTRA team led by " + newTeam.getEndeavorBackup() + " was created");
		 System.out.println(newTeam.toString());
		 System.out.println("Would you like to make another UA Hero PLUS ULRA team?y/n)");
		 String opt2  = newUA.nextLine();
		 
		 switch (opt2) {
			
			case "y":
				createHero();
				break;
			case "n":
				System.out.println("Nani desu ka?! Get out of here then! Baka!");
				break;
			default:
				System.out.println("Input not recognized, please use y or n");
				firstMenu();
		 }
	}
	
	
}

	


