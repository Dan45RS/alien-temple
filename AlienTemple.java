package Alien_Temple;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

public class AlienTemple
{
    public void newGame()
    {
        // I'm thinking we should move everything except creating a new save file
        // to the playGame() function as in the switch statements below, so that 
        // newGame() only creates a new save file, and playGame() selects from
        // available save files to play -Alec
        
        // Intro
        String introParagraph = "ALIEN TEMPLE\n\n"
            + "The year is 2739. You are a space adventurer,\n"
            + "answering the distress call of a research outpost\n"
            + "on a mysterious planet. When you arrive at the\n"
            + "outpost, you find it abandoned: the researchers\n"
            + "were apparently investigating a nearby alien temple,\n"
            + "but one day it seems they never returned from the\n"
            + "temple, and yet strangely their distress beacon was\n"
            + "activated. Seeing no other choice, you enter the\n"
            + "temple hoping to rescue the missing researchers....\n";
        System.out.println(introParagraph);
        // game functionality stuff goes not in 
    }
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            // Instead of immediately asking if the player wants to venture forth, lets use that for when the
            // player opts to start a NEW game
            
            // at the start menu there should be a few options, including:
            // new game, load game, quit, anything else we can think of

            // Actually, that does make sense. Real quick question: does next() only take in one word, or can
            // it also take multiple? - Dan
    
            String choice = sc.next();            
            switch(choice)
            {
                case "new game":
                    // String newGameLocation = newGame();
                    // playGame(newGameLocation);
                case "load game":
                    // playGame(NULL);
                case "quit":
                    break;
            }
            // for the new game option: 
            // 1) ask the player for a file name
            // 2) create file with that name
            // 3) then just run loadGame() lol

            // What's a save file's usual extension? (like .exe, .dmg, .c, .java, ...)

            // Looks like it's typically .gam

            /*
            if(choice == "new game")
            {
                System.out.println(introParagraph);
                // startGame();
            }
            else if(choice == "load game")// guilt-trip the player ig...
            {
                // maybe let's not do this lol:
                // System.out.println("\nUpon reaching the temple where the signal was received, you suddenly 
                // begin to have second thoughts on whether you actually want to enter or not. You suddenly 
                // started to fear for your life and what the worst thing would happen once you set foot inside. 
                // Eventually, you give up, take the ship back home. Everybody back at the station asks what 
                // happened, and you describe why you didn't go in. They try to comfort you and say that it's 
                // okay, but in reality they despise you because you turned out to be a fuckin' coward. \"How 
                // could you?\", \"You left them to die. \", \"This is all your fault.\" You are filled with 
                // so much dread until you decide to leave the station for good because you couldn't live with 
                // the choice that you made, merely hoping that you are gone for good, so that everyone will 
                // forget that you existed... ");
                sc.close();
                return;
            }
            */
            sc.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }              
}
