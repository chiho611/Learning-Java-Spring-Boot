package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();

        // 1 object creation
        var game = new PacmanGame();

        // 2 object creation + wiring of dependencies
        // game is dependency of GameRunner
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }

}
