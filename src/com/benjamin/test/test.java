package com.benjamin.test;

import java.util.Random;

public class test {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java test [Name1] [Name2]. \n" +
                    "Name1 = name of the first fighter.\n" +
                    "Name2 = name of the second fighter.");
            System.exit(0);
        }
        String name1 = args[0];
        String name2 = args[1];

        Random random = new Random();

        Fighter fighter1 = new Fighter(name1, 100, random.nextInt(100)+ 1, random.nextInt(100) + 1);
        Fighter fighter2 = new Fighter(name2, 100, random.nextInt(100)+ 1, random.nextInt(100) + 1);

        while (fighter1.health >= 0 && fighter2.health >= 0) {
            System.out.println("----- NEW ROUND -----");
            hit(fighter1, fighter2);
            if (fighter2.getHealth() >= 0) {
                hit(fighter2, fighter1);
            }
            System.out.println(fighter1.getName() + " has " + fighter1.getHealth());
            System.out.println(fighter2.getName() + " has " + fighter2.getHealth());
            System.out.println("----- END ROUND -----");
        }
    }

    public static void hit(Fighter attack, Fighter defend) {
        Random random = new Random();

        System.out.println(attack.getName() + " is going to attack " + defend.getName());
        int damage = random.nextInt(100) + 1 + attack.getOffenseLevel() - attack.getDefenseLevel();
        if (damage > 0) {
            System.out.println(attack.getName() + " dealt " + damage + " to " + defend.getName());
            defend.setHealth(defend.getHealth() - damage);
            System.out.println(defend.getName() + " has " + defend.getHealth() + " remaining.");
        } else if (damage == 0) {
            System.out.println(defend.getName() + " avoided the attack, no damage taken");
        }
    }
}
