package com.game.units;

public enum Race {
    Human(1, 0, 0.5, 0.5),
    Dwarf(1, 0, 0, 0.5),
    Elf(0.5, 1, 0, 0.5),
    Orc(0, 0.5, 1, 0.5);

    private double healthModificatior;
    private double speedModificator;
    private double attackPointsModificator;
    private double defencePointsModificator;

    Race(double healthModificatior, double speedModificator, double attackPointsModificator, double defencePointsModificator) {
        this.healthModificatior = healthModificatior;
        this.speedModificator = speedModificator;
        this.attackPointsModificator = attackPointsModificator;
        this.defencePointsModificator = defencePointsModificator;
    }

    public double getHealthModificatior() {
        return healthModificatior;
    }

    public double getSpeedModificator() {
        return speedModificator;
    }

    public double getAttackPointsModificator() {
        return attackPointsModificator;
    }

    public double getDefencePointsModificator() {
        return defencePointsModificator;
    }
}
