package WordGames;

import Assertion.Assert;

public class Game {

    static class GameOne{
        public static void main(String[] args){
            Countries countries = new Countries();
            Capitals capitals = new Capitals();
            if (countries.values.length == capitals.values.length){
                System.out.println("Let's see what we got here...");
                for (int i = 0; i < countries.values.length; i++) {
                    System.out.printf("%s - %s %n", countries.values[i], capitals.values[i]);
                }
                System.out.println("Nice?");
            }
            else {
                System.out.println("Arrays are not equal!");
            }
        }
    }

    static class GameTwo{
        public static void main(String[] args){
            Cities cities = new Cities();
            if (cities.values1.length == cities.values2.length){
                for (int i = 0; i < cities.values1.length; i++) {
                    Assert.that(cities.values1[i].substring(cities.values1[i].length() - 1).toLowerCase().equals(
                            cities.values2[i].substring(0, 1).toLowerCase()),
                            String.format("Something is wrong here: %s %s", cities.values1[i], cities.values2[i]));
                    System.out.printf("Correct! %s %s %n",cities.values1[i], cities.values2[i]);
                    if (i + 1 < cities.values1.length) {
                        Assert.that(cities.values2[i].substring(cities.values2[i].length() - 1).toLowerCase().equals(
                                cities.values1[i + 1].substring(0, 1).toLowerCase()),
                                String.format("Something is wrong here: %s %s", cities.values2[i], cities.values1[i + 1]));
                        System.out.printf("Correct! %s %s %n",cities.values2[i], cities.values1[i + 1]);
                    }
                }
                System.out.println("Well Done!");
            }
            else {
                System.out.println("Arrays are not equal!");
            }
        }
    }
}
