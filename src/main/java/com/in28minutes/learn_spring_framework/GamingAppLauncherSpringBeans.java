package com.in28minutes.learn_spring_framework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SupeContraGame;
import com.in28minutes.learn_spring_framework.game.gameRunner;
import com.in28minutes.learn_spring_framework.game.Packman;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.game")
public class GamingAppLauncherSpringBeans {
	
	
	public static void main(String[]args) {
		try (var context = new AnnotationConfigApplicationContext
				(GamingAppLauncherSpringBeans.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(gameRunner.class).run();
		}
	}
}