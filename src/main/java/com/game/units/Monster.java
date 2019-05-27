package com.game.units;

import com.game.processor.GameDifficulty;

public class Monster extends Creature {
    public Monster(int health, String name, int attackPoints, int defencePoints, int speed, Race race, GameDifficulty currentGameDifficulty) {
        super(health,
                "Angry Monster",
                attackPoints * currentGameDifficulty.getMonsterStatsModificator(),
                defencePoints * currentGameDifficulty.getMonsterStatsModificator(),
                speed * currentGameDifficulty.getMonsterStatsModificator(),
                race
        );
    }

    private Race getRandomRace() {

        return null;
    }
}
