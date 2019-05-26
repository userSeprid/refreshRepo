package com.game.processor;

public enum GameDifficulty {
    Easy(1, 25,60, 15),
    Normal(5, 30, 40, 30),
    Hard(10, 15, 25, 60);


    private int MonsterStatsModificator;
    private int NeutralEventChanceValue;
    private int PositiveEventChanceValue;
    private int NegativeEventChanceValue;

    GameDifficulty(int monsterStatsModificator, int neutralEventChanceValue, int positiveEventChanceValue, int negativeEventChanceValue) {
        MonsterStatsModificator = monsterStatsModificator;
        NeutralEventChanceValue = neutralEventChanceValue;
        PositiveEventChanceValue = positiveEventChanceValue;
        NegativeEventChanceValue = negativeEventChanceValue;
    }

    public int getMonsterStatsModificator() {
        return MonsterStatsModificator;
    }

    public int getNeutralEventChanceValue() {
        return NeutralEventChanceValue;
    }

    public int getPositiveEventChanceValue() {
        return PositiveEventChanceValue;
    }

    public int getNegativeEventChanceValue() {
        return NegativeEventChanceValue;
    }
}
