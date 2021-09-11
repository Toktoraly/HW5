package com.company;

public class Hero {
    private int Health;
    private int damage;
    private String TypeAttack;

    public Hero(int health, int damage, String typeAttack) {
        this.Health = health;
        this.damage = damage;
        this.TypeAttack = typeAttack;
    }

    public Hero(int health, int damage) {
        Health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return damage;
    }

    public String getTypeAttack() {
        return TypeAttack;
    }
}
