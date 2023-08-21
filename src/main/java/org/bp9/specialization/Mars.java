package org.bp9.specialization;

public class Mars {
    public static void main(String[] args) throws InterruptedException {

//        new GuessingGame();
        new MarsExpedition();

        new FindingsList();

        String colonyName = "polyMorphia";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = landingCheck(45);

//  Beginning with the landing process and continuing until food production is underway on Mars,
//  everyone will eat 0.75 meals a day to perserve food. The landing process takes 2 days.
//
//  Calculate how many meals are left after landing using mathematical operators.
//  Print the number of meals that are left.
//
//  An extra crate of food is found increasing meals by 50%! Reassign the value of meals to be
//  50% higher than it was using a mathematical expression.
//
//  The births onboard are very perfectly timed and 5 more babies join the population during
//  the 2 days it takes to land. Reassign shipPopulation to reflect that.

        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

//  The ship is coming into it’s final descent and you need to figure out where to land.
//  Choose from these locations: The Hill, The Plain, The Ocean

//  Now create a String value called landingLocation and set it equal to “The Hill” or “The Plain” or “The Ocean”.

//  Create an if-else statement that checks to see if the landingLocation is equal to “The Plain” (ignoring case)
//  If it does print “Bbzzz Landing on the Plain”
//  If not print “ERROR!!! Flight plan already set. Landing on the Plain”
        String landingLocation =  "The Hill";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }

    }

//      Outside the main method, create a public function called landingCheck that returns a boolean value and takes in an int parameter called minutesLeft.
//      This method will print “directions” to the console based on minutes left until touchdown.

//      Inside landingCheck, create a for loop that initializes an int variable called minute which is set to 0.
//      The loop should increment by 1 until it reaches the number of minutesLeft.

//      Inside the loop, create an if statement.
//      If the number of minutes is even print “Right”, if the number of minutes is divisible by 3 print “Left”,
//      if the number is divisible by both 2 and 3 print “Keep Center”.
//      If the number isn’t divisible by any of those factors, print “Calculating”.

//      Call Thread.sleep(250) after the conditional but before the end of the loop to slow down the console on each loop
//      – it will add to the game ambience.

//      Print “Landed” after the for loop. And then return the boolean false
//      – we’ll save this to the landing variable in the main method since landing will be complete once this function completes.

//      Back inside the main method, reassign the value of landing to be the invocation of the
//      landingCheck() method passing in any integer for the number of minutes left until landing.

    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;


    }


}
