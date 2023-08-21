package org.bp9.specialization;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class MarsExpedition {

    public MarsExpedition() throws InterruptedException {

        Scanner input = new Scanner(System.in);

        System.out.println("The Mars expedition prep program is about to begin... Please stand by.");
        sleep(1000); // 1000 milliseconds (1 second) delay
        System.out.println("Booting up...");
        sleep(2000); // 2000 milliseconds (2 seconds) delay
        System.out.println("...");
        sleep(1000); // 1000 milliseconds (1 second) delay
        System.out.println("...");
        sleep(1000); // 1000 milliseconds (1 second) delay
        System.out.println("...");
        sleep(1000); // 1000 milliseconds (1 second) delay
        System.out.println("Ready");

        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("Welcome " + userName + "!  \n" +
                "— Welcome to the Expedition prep program. Are you ready to head out into the new world? Type yes or no");
        String readiness = input.nextLine();
        if (readiness.toLowerCase() == "yes") {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (readiness.toLowerCase() == "no") {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your expedition team? (Input an int number)");

        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }


    }
}
