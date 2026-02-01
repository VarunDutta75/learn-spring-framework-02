package com.in28minutes.learn_spring_framework.examples.a1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class gameRunner {
	private GamingConsole game;
	public gameRunner(@Qualifier("SupeContraGameQualifier")GamingConsole game) {
		this.game = game;
	}
	public void run() {
		System.out.println("Running game: "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
