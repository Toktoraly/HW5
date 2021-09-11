package com.company;

public class Boss {
    private int BossHealth;
    private int BossDamage;
    private String BossDefence;

    public Boss(int bossHealth, int bossDamage, String bossDefence) {
        BossHealth = bossHealth;
        BossDamage = bossDamage;
        BossDefence = bossDefence;
    }

    public int getBossHealth() {
        return BossHealth;
    }

    public void setBossHealth(int bossHealth) {
        BossHealth = bossHealth;
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public String getBossDefence() {
        return BossDefence;
    }

    public void setBossDefence(String bossDefence) {
        BossDefence = bossDefence;
    }
}
