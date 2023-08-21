package org.bp9.specialization;

import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {

        Thread.sleep(500);

        System.out.println("Welcome back. Let's organize the artifacts you've gathered!");
        System.out.println("Let's begin with the rocks!");

        ArrayList<String> rockCollection = new ArrayList<String>();

        rockCollection.add("rock");
        rockCollection.add("weird rock");
        rockCollection.add("smooth rock");
        rockCollection.add("not rock");

        System.out.println("Your rockCollection has been recorded. Here it is: ");
        System.out.println(rockCollection);

        Thread.sleep(500);
        System.out.println("There appears to be an imposter in the rock collection. ");
        System.out.println("I must remove it. One moment.");

        Thread.sleep(500);
        rockCollection.remove("not rock");
        System.out.println("The imposter has been removed. Here is the updated rock collection:");
        System.out.println(rockCollection);


        System.out.println("Time to organize the fossil collection! Please stand by...");

        Thread.sleep(1000);

        HashMap<String, String> fossilCollection = new HashMap<>();

        System.out.println("Your fossil collection data has been downloaded");

        fossilCollection.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilCollection.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilCollection.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");

        Scanner input = new Scanner(System.in);

        String fossilTopic = input.nextLine();

        if (fossilTopic.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilTopic + "\nDescription: " + fossilCollection.get(fossilTopic));
        } else if (fossilTopic.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilTopic + "\nDescription: " + fossilCollection.get(fossilTopic));
        } else if (fossilTopic.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilTopic + "\nDescription: " + fossilCollection.get(fossilTopic));
        }

//        Now lets

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();
        Iterator itr = supplies.iterator();

        supplies.add("Stun gun");
        supplies.add("First aid kit");
        supplies.add("Solar charger");

        System.out.println("\nSupplies Before Expedition:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        supplies.remove("Stun gun");
        System.out.println("\nSupplies afterExpedition:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
