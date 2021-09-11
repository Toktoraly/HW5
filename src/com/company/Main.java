package com.company;

import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero(250, 40, "Magic");
        Hero hero1 = new Hero(240, 35);
        System.out.println("Heroes Health is " + hero.getHealth());

        Boss boss = new Boss(300, 50, "Archer");
        boss.setBossDamage(350);
        boss.setBossDefence("Magic");
        boss.setBossHealth(50);
        System.out.println( "Boss health is: "+ boss.getBossHealth());
        System.out.println("Boss damage: "+ boss.getBossDamage());
        System.out.println("Boss defence is " + boss.getBossDamage());
    }


    public static Hero[] CreateHeroes(){
        Hero hero = new Hero(250, 40, "Magic");
        Hero hero1 = new Hero(240, 35);
        Hero [] heroes = {hero, hero1};
        return heroes;
    }
}
