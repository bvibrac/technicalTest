package com.benjamin.test;

public class Fighter {
    String name;
    int health;
    int defenseLevel;
    int offenseLevel;

    public Fighter(String name, int health, int defenseLevel, int offenseLevel) {
        this.name = name;
        this.health = health;
        this.defenseLevel = defenseLevel;
        this.offenseLevel = offenseLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public int getOffenseLevel() {
        return offenseLevel;
    }

    public void setOffenseLevel(int offenseLevel) {
        this.offenseLevel = offenseLevel;
    }
}
