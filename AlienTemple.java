package Alien_Temple;

import java.util.Scanner;
import java.util.Random;

public class AlienTemple {

    int choice;
    int playerHP;
    String playerName;
    String playerWeapon;
    Scanner myScanner = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        AlienTemple game = new AlienTemple();
        game.playerSetUp();
        game.room1();
    }

    public void playerSetUp() {
        playerHP = 300;
        playerWeapon = "Barefists";
        System.out.println("Your HP: " + playerHP);
        System.out.println("Your weapon: " + playerWeapon);

        System.out.println("Please enter your name: ");
        playerName = myScanner.nextLine();

        System.out.println("Hello " + playerName + ", let us begin!!");
        System.out.println("");
        displayIntro();
    }

    public void displayIntro() {
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
    }

    public void room1() {
        System.out.println("\n--------------------------------------------\n");
        System.out.println("You have entered the first room. You see different symbols of what appear to be different shapes and notice the place is eerie and silent.");
        System.out.println("You find a dead body. Could this be one of the researchers?");
        System.out.println("What will you do?");
        System.out.println("1: Approach the body");
        System.out.println("2: Leave the temple");

        choice = myScanner.nextInt();

        if (choice == 1) {
            encounterFirstRoom();
        } else if (choice == 2) {
            gameOver();
        }
    }

    public void encounterFirstRoom() {
        playerWeapon = "Pistol";
        System.out.println("You found one of the researchers. His body has multiple scratches.");
        System.out.println("You find his log; his name was Danny, one of the new researchers with three others. You also find his pistol.");
        System.out.println("You read through his log. Nothing much, except you find they were looking for new life forms.");
        System.out.println("Your Weapon: " + playerWeapon);
        System.out.println("You hear a rumbling.............");
        System.out.println("The door has closed behind you. You start to fear for your life.");
        System.out.println("You encounter the Alien that must have killed the researchers.");
        System.out.println("You see another room. You can run. What do you do?");
        System.out.println("1: Fight");
        System.out.println("2: Run to the next room");
        System.out.println("\n-----------------------------------\n");

        choice = myScanner.nextInt();
        if (choice == 1) {
            fight(500); // Passing monster HP for Room 1
        } else if (choice == 2) {
            room2();
        }
    }

    public void room2() {
        // Additional room logic
    }


    public void fight(int monsterHP) {
        while (monsterHP > 0 && playerHP > 0) {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Your HP: " + playerHP);
            System.out.println("Monster HP: " + monsterHP);
            System.out.println("\n1: Attack");
            System.out.println("2: Run");

            choice = myScanner.nextInt();

            if (choice == 1) {
                monsterHP = attack(monsterHP);
                if (monsterHP <= 0) {
                    win();
                }
            } else if (choice == 2) {
                System.out.println("You run away to the previous room!");
                // Logic for returning to the previous room
                break;
            }
        }
    }

    public int attack(int monsterHP) {
        int playerDamage = 0;

        if (playerWeapon.equals("Pistol")) {
            playerDamage = rand.nextInt(50) + 10; // Pistol damage
        } else if (playerWeapon.equals("Rifle")) {
            playerDamage = rand.nextInt(80) + 20; // Rifle damage
        }

        System.out.println("You attack the monster and give " + playerDamage + " damage!");
        monsterHP -= playerDamage;

        if (monsterHP > 0) {
            int monsterDamage = rand.nextInt(25) + 5;
            System.out.println("The monster attacks you and gives " + monsterDamage + " damage!");
            playerHP -= monsterDamage;

            if (playerHP <= 0) {
                dead();
            }
        }

        return monsterHP;
    }

    public void dead() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are dead!!!");
        System.out.println("\n\nGAME OVER");
        System.out.println("\n------------------------------------------------------------------\n");
    }

    public void win() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You killed the monster!");
        System.out.println("The monster dropped a key!");
        System.out.println("You obtained a mysterious key!\n\n");
        // Logic for moving to the next room
        System.out.println("\n------------------------------------------------------------------\n");
    }

    public void gameOver() {
        System.out.println("You decided to leave the temple. Game Over.");
        System.exit(0);
    }

}
