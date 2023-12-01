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

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    package Alien_Temple;

import java.util.Scanner;



public class AlienTemple {
    
    int choice;
    int playerHP;
    int monsterHP;
    String playerName;
    String playerWeapon;
    
    Scanner myScanner = new Scanner(System.in);

public static void main(String[] args){
        AlienTemple game;
        game = new AlienTemple();
        game.playerSetUp();
        game.Room();
    }
  
public void playerSetUp(){
  
  playerHP = 300;
  monsterHP = 500;
 
  String playerWeapon;
  playerWeapon ="Barefists";
  

  System.out.println("Your Hp: " +playerHP);
  System.out.println("Your weapon: " +playerWeapon);

  String playerName;

  

  System.out.println("Please enter your name: ");
  playerName = myScanner.nextLine();

  System.out.println("Hello " + playerName + ", let us begin!!");
  System.out.println("");
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


public void Room() {

    System.out.println("\n--------------------------------------------\n");
    System.out.println(" You have entered the first room you see different symbols of what appears to be different shapes and notice the place is eerie and silent ");
    System.out.println(" You find a dead body could this be one of the researchers you ask?");
    System.out.println("What will you do?");
    System.out.println("1: You approach the body ");
    System.out.println("2: You decide to get out the temple");
    
    choice = myScanner.nextInt();

    if(choice==1){
        playerWeapon="Rifle";
        System.out.println("You found one of the researchers his body seems to have multiple scratches.");
        System.out.println("You found his log his name was Danny one of the new researchers with three other researchers and found his pistol");
        System.out.println(" You read through his log nothing much except you find they were looking for new lifeforms");
        System.out.println("Your Weapon: " +playerWeapon);
        System.out.println(" You hear rumbling.............");
        System.out.println(" The door has closed behind you. You start to fear for your life");
        System.out.println("You encounter the Alien that must have killed the researchers");
        System.out.println("You see a another room you can run what do you do?  ");
        System.out.println("1: Fight");
        System.out.println("2: Run");
        System.out.println("\n-----------------------------------\n");
        
        choice = myScanner.nextInt();
        if (choice == 1){
            fight();
        }
        else if (choice == 2){
            System.out.println("You cannnot run");
            Room();
        }
        
    }

    if(choice==2){
        System.out.println("Game Over");
        System.exit(0);
    }

    
}
//public void Room2(){
  //  System.out.println("\n--------------------------------------------\n");
 //   System.out.println(" You have entered the second room you find what appears to be water and you are thirsty.");
 //   System.out.println(" What do you want to do ?");
 //   System.out.println("1: Drink the water ");
  //  System.out.println("Your HP is recovered.");
  //  playerHP = playerHP + 10;
 //   System.out.println("2: leave it alone ");
 //   System.out.println("You find another body and a log his name was Zayan  ");
  //  System.out.println("");

 //   choice = myScanner.nextInt();
  //  fight(monsterHPRoom2);
    
//}


public void fight() {
    
    System.out.println("\n------------------------------------------------------------------\n");
    System.out.println("Your HP: " + playerHP);
    System.out.println("Monster HP: " + monsterHP);
    System.out.println("\n1: Attack");
    System.out.println("2: Run");
    System.out.println("\n------------------------------------------------------------------\n");

    choice = myScanner.nextInt();

    
    if (choice == 1) {
    
        attack();
    }
        else if (choice ==2){
            System.out.println(" You fool there is no where to run since the door is closed");
            fight();
        }
    }




public void attack() {
    int playerDamage = 0;

    if (playerWeapon.equals("Rifle")) {
        playerDamage = new java.util.Random().nextInt(40);
    

    System.out.println("You attacked the monster and gave " + playerDamage + " damage!");

    monsterHP = monsterHP - playerDamage;

    System.out.println("Monster HP: " + monsterHP);

    if (monsterHP < 1) {
        win();
    } 
    else if (monsterHP > 0) {
        int monsterDmg = 0;

        monsterDmg= new java.util.Random().nextInt(4);
        System.out.println("The monster attacked you and gave " + monsterDmg + " damage!");

        playerHP = playerHP - monsterDmg;

        System.out.println("Player HP: " + playerHP);

        if (playerHP < 1) {
            dead();
        } 

         else if (playerHP > 0){
           
             fight();
            }
        }
    }
}
    




public void dead() {
    System.out.println("\n------------------------------------------------------------------\n");
    System.out.println("YOU DIED!!!");
    System.out.println("\n\nGAME OVER");
    System.out.println("\n------------------------------------------------------------------\n");

}


public void win() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You killed the monster!");
		System.out.println("The monster dropped a obelisk key!");
		System.out.println("You obtaind an obelisk key!\n\n");
		System.out.println("1: Exit temple");
		System.out.println("\n------------------------------------------------------------------\n");

		

		choice = myScanner.nextInt();
		if (choice == 1) {
			end();
		}

	}
public void end() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You killed the Alien Congrats!!");
		System.out.println("\n\n           THE END                    ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
}
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
package Alien_Temple;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Alien_Temple.AlienTemple.ChoiceHandler;
import Alien_Temple.AlienTemple.TitleScreenHandler;

import javax.swing.Action;
import javax.swing.JButton;


import java.awt.Container;

public class AlienTemple {

        JFrame window;
        Container Alien; // button panels 
        JPanel titleAlienpanel, startAlienpanel, Alientextpanel, AlienchoicePanel, AlienplayerPanel; //panel for our buttons
        JLabel titleAlienLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName; // to add text for panels
        Font titleFont = new Font("Times New Roman", Font.PLAIN, 90); //font type of title
        Font startFont = new Font("Times New Roman", Font.PLAIN, 18); //font type of start button
        JButton startButton, choice1, choice2, choice3, choice4;
        JTextArea mainTextArea;
        int playerHP;
        int AlienHP;
        int obeliskKey;
        String playerWeapon, position;
        Scanner myScanner = new Scanner(System.in);


        TitleScreenHandler AlienHandler = new TitleScreenHandler();
        ChoiceHandler choiceHandler = new ChoiceHandler();
    public static void main(String[] args) {
        new AlienTemple();
    }


public AlienTemple(){
    // Our window creation
    window = new JFrame();
    window.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // adds function to window to close *important
    window.getContentPane().setBackground(Color.black); //set color of the window
    window.setLayout(null); // default layout but we want custom
    Alien = window.getContentPane();

    titleAlienpanel = new JPanel();
    titleAlienpanel.setBounds(100, 100, 600, 150); // panel for title name xy axis and width height of panel
    titleAlienpanel.setBackground(Color.black);
    titleAlienLabel = new JLabel("Alien Temple");
    titleAlienLabel.setForeground(Color.green); //color of text
    titleAlienLabel.setFont(titleFont);
    //start button
    startAlienpanel = new JPanel();// button panel
    startAlienpanel.setBounds(300, 400, 200, 100);
    startAlienpanel.setBackground(Color.black);

    startButton = new JButton("START GAME"); //button
    startButton.setBackground(Color.blue);
    startButton.setForeground(Color.black);
    startButton.setFont(startFont);
    startButton.addActionListener(AlienHandler);//when start button pressed call the titlescreenhandler class
    startButton.setFocusPainted(false);

    
    
    titleAlienpanel.add(titleAlienLabel);
    startAlienpanel.add(startButton);
    Alien.add(titleAlienpanel); 
    Alien.add(startAlienpanel);


    window.setVisible(true); // visible window
}
public void createGameScreen(){
        titleAlienpanel.setVisible(false); //disable title panel
        startAlienpanel.setVisible(false); //disable start panel
        Alientextpanel = new JPanel();
        Alientextpanel.setBounds(100, 100, 600, 250);
        Alientextpanel.setBackground(Color.black);
        Alien.add(Alientextpanel);
        //Main text color changes
        mainTextArea = new JTextArea("This is going to be great");//edit the main text
        mainTextArea.setBounds(100, 100, 600, 250);
        
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.green);
        mainTextArea.setFont(startFont); //use font from start button
        mainTextArea.setLineWrap(true); //text lapping if text is too long
        Alientextpanel.add(mainTextArea);

        AlienchoicePanel = new JPanel();
        AlienchoicePanel.setBounds(250,350, 300, 150);
        AlienchoicePanel.setBackground(Color.black);
        AlienchoicePanel.setLayout(new GridLayout(4,1));//puts the choice buttons in columns
        Alien.add(AlienchoicePanel);

        choice1 = new JButton("choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.black);
        choice1.setFont(startFont);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");// shows to differ from start button
        AlienchoicePanel.add(choice1);

        choice2 = new JButton("choice 2");
        choice2.setBackground(Color.white);
        choice2.setForeground(Color.black);
        choice2.setFont(startFont);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        AlienchoicePanel.add(choice2);

        choice3 = new JButton("choice 3");
        choice3.setBackground(Color.white);
        choice3.setForeground(Color.black);
        choice3.setFont(startFont);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        AlienchoicePanel.add(choice3);

        choice4 = new JButton("choice 4");
        choice4.setBackground(Color.white);
        choice4.setForeground(Color.black);
        choice4.setFont(startFont);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        AlienchoicePanel.add(choice4);

        AlienplayerPanel = new JPanel();
        AlienplayerPanel.setBounds(100,15,600,50);
        AlienplayerPanel.setBackground(Color.black);
        AlienplayerPanel.setLayout(new GridLayout(1,4));
        Alien.add(AlienplayerPanel);

        hpLabel = new JLabel("HP: ");
        hpLabel.setFont(startFont);
        hpLabel.setForeground(Color.white);
        AlienplayerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(startFont);
        hpLabelNumber.setForeground(Color.white);
        AlienplayerPanel.add(hpLabelNumber);
        weaponLabel = new JLabel("Weapon: ");
        weaponLabel.setFont(startFont);
        weaponLabel.setForeground(Color.white);
        AlienplayerPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(startFont);
        weaponLabelName.setForeground(Color.white);
        AlienplayerPanel.add(weaponLabelName);

        playerSetUp();
    }   

    public void playerSetUp(){
        obeliskKey = 0;
        position = "playerSetUp";
        playerHP = 300;
        AlienHP = 500;
        playerWeapon ="Barefist";
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
        choice4.setVisible(true);
        weaponLabelName.setText(playerWeapon);
        hpLabelNumber.setText("" + playerHP);
        mainTextArea.setText("In the year 2739, you respond to a distress call from a deserted research outpost \n on a mysterious planet. The abandoned outpost reveals researchers who vanished while exploring an alien temple. Their distress beacon signals a mystery. With no alternatives, you venture into the temple to rescue the missing researchers. \n\n Enter the temple");
        choice1.setText("Enter");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        
        
      
      
      
      }
    public void Room(){
       position = "Room";
       mainTextArea.setText(
        "You have entered the main room\n" +
        "You find a dead body; could this be one of the researchers, you ask?\n" +
        "You approach the body.\n\n" +
        "You found one of the researchers!\n" +
        "You hear rumbling.............\n" +
        "The door has closed behind you, you try to open it and it is locked.\n" +
        "You see three different rooms; which one do you want to enter?"
);

        choice1.setText("West Room");
        choice2.setText("North Room");
        choice3.setText("East Room");
        choice4.setText("Main door out");



        

    }

    public void WestRoom(){
        position = "WestRoom";
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
        choice4.setVisible(true);
        mainTextArea.setText(
        "\n--------------------------------------------\n" +
        "You have entered a strange room; you find what appears to be a stream of water, and you are preety thirsty.\n" +
        "What do you want to do?\n\n"
         );

       
    
          

        choice1.setText("Drink water");
        choice2.setText("Go back to MAIN ROOM");
        choice3.setText("");
        choice4.setText("");


    }
    public void runAway() {
        position = "runAway";
        mainTextArea.setText("You tried to run away, but the door is locked!\nThe alien is getting closer!");
        choice1.setText("Fight");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }
    public void NorthRoom (){

        position = "NorthRoom";

        if (obeliskKey == 1) {
            mainTextArea.setText("You've already obtained the obelisk key. There's nothing else to do in this room.");
            choice1.setText("Back to Main Room");
            choice2.setText("");
            choice3.setText("");
            choice4.setText("");
        } else {
            
                mainTextArea.setText(
                    "The door closes behind you.\n" +
                    "You encounter some form of alien lifeform that is running towards you.\n" +
                    "You tried opening the door but it is locked.\n\n" +
                    " You must fight!!!"
            );
            
    

        choice1.setText("Fight");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");

    }
}


    public void MainRoom (){
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
        choice4.setVisible(true);
        position = "MainRoom";
        mainTextArea.setText(" Main room seems you need a key to get out");

        choice1.setText("West Room");
        choice2.setText("North Room");
        choice3.setText("East Room");
        choice4.setText("Main door out");
    }
      
public void EastRoom (){
        position = "EastRoom";

mainTextArea.setText(
        
        "You find another researcher dead but he carried a Rifle!" +
        "You take the Rifle with you!!"
);

    playerWeapon = "Rifle";
    weaponLabelName.setText(playerWeapon);
    choice1.setText("Back to Main room");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");



    }

public void fight(){
        position = "fight";
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
        choice4.setVisible(true);
        mainTextArea.setText("Alien Hp: " + AlienHP);
        choice1.setText("Attack");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);

    }

public void attack(){
    position = "attack";

    int playerDamage = 10;
    if (playerWeapon.equals("Rifle")) {
        playerDamage = new java.util.Random().nextInt(90);
    } else if(playerWeapon.equals("Barefist")){
        playerDamage = new java.util.Random().nextInt(20);
    }
    mainTextArea.setText("You attacked the Alien and gave it " +playerDamage + " damage!");

    AlienHP = AlienHP - playerDamage;

    

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
}

public void Alienattack(){
    position = "Alienattack";
    int AlienDamage = 0;

    AlienDamage = new java.util.Random().nextInt(55);
    mainTextArea.setText("The Alien attacked you and gave " + AlienDamage + " damage! ");

    playerHP = playerHP - AlienDamage;
    hpLabelNumber.setText(""+playerHP);

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

}

public void lose(){
    position = "lose";

    mainTextArea.setText("You DIED!\n\n<GAME OVER>");
    choice1.setText("PLAY AGAIN");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    choice2.setVisible(false);
    choice3.setVisible(false);
    choice4.setVisible(false);



}

public void win(){
    position = "win";

    mainTextArea.setText("You defeated the Alien and the door opened!\nThe Alien dropped an Obelisk Key!\n\n(You obtained an Obelisk key)");
    obeliskKey = 1;

    choice1.setText("Go back to main room");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
}

    public void end(){
        position = "end";

        mainTextArea.setText(
        "You avenged the fellow Researchers and live for another Adventure!!!\n" +
        "\n\n  <THE END>");

    choice1.setText("PLAY AGAIN");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    choice2.setVisible(false);
    choice3.setVisible(false);
    choice4.setVisible(false);



    }
//To make buttons work
 public class TitleScreenHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){
        createGameScreen();
    }
 }

    public class ChoiceHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            String yourChoice = event.getActionCommand(); // 

            switch(position){
                case "playerSetUp" :
                switch (yourChoice) {
                    case "c1": Room();
                        break;
                    case "c2": break;
                    case "c3": break;
                }
                break;
            case "Room" :
                switch(yourChoice){
                
                case "c1": WestRoom();
                    break;
                case "c2": NorthRoom();
                    break;
                case "c3": EastRoom();
                    break;
                case "c4": if (obeliskKey == 1) {
                    // Call UI method for ending the game
                    end();
                } else {
                
                    MainRoom();
                }
                break;
                
            }
                break;
            case "WestRoom" :
            switch (yourChoice) {
                case "c1":  if (playerHP < 400){
                    playerHP = playerHP + 10;
                    hpLabelNumber.setText(""+playerHP);
                }
                break;
                case "c2": MainRoom();   
                    break;
                case "c3": break;
            }
            break;

            case "MainRoom" :
            switch (yourChoice) {
                case "c1": WestRoom();
                    break;
                case "c2": NorthRoom();
                    break;
                case "c3": EastRoom();
                    break;
                case "c4": if (obeliskKey == 1) {
                    // Call UI method for ending the game
                    end();
                } else {
                
                    MainRoom();
                }
            }
                    break;
            
            case "EastRoom" :
            switch (yourChoice) {
                case "c1": MainRoom(); break;
                }
                break;

              case "NorthRoom" :
            switch (yourChoice) {
                case "c1": fight(); break;
                case "c2": runAway(); break;
                }
                break;

              case "fight":
              switch (yourChoice) {
                case "c1": attack(); break;
                
                    
                }
                
              
              break;

              case "attack":
                switch (yourChoice) {
                    case "c1" :
                    if(AlienHP < 1){
                        win();
                    }
                    else{
                        Alienattack(); break;
                    }
                  break;
                
                }
                 break;
               case "Alienattack":
               switch (yourChoice) {
                case "c1": 
                if(playerHP < 1){
                    lose();
                }
                else{
                   fight(); break; 
                }
               break;
               }
               break;
            case "win":
             switch (yourChoice) {
                case "c1": MainRoom();
                    break;
             }
             break;
             case "lose":
             switch (yourChoice) {
                case "c1": playerSetUp();
                    break;
             }
             break;
             case "end":
             switch (yourChoice) {
                case "c1": playerSetUp();
                    break;
             }
                    break;
             case "runAway":
             switch (yourChoice) {
                case "c1": fight();break;
            
             }
             break;


                
         
            }


        }
    }
}
