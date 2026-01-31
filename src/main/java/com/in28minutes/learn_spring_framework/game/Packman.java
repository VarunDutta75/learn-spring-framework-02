package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class Packman implements GamingConsole{
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Down");
	}
	public void left() {
		System.out.println("left");
	}
	public void right() {
		System.out.println("right");
	}
	

}
