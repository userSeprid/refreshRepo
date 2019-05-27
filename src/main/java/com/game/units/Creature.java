package com.game.units;

public abstract class Creature {
    private int health;
    private String name;
    private int attackPoints;
    private int defencePoints;
    private int speed;
    private final Race race;

    public Creature(int health, String name, int attackPoints, int defencePoints, int speed, Race race) {
        this.health = health;
        this.name = name;
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.speed = speed;
        this.race = race;
    }

    public void attack(Creature attacker, Creature attackedUnit) {
        attackedUnit.setHealth(attackedUnit.getHealth() - (attacker.getAttackPower() - attackedUnit.getDefencePoints()));
    }

    public int getAttackPower() {
        return (int) (attackPoints + attackPoints * race.getAttackPointsModificator());
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
