package com.jmartin.drop_game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.jmartin.drop_game.dropGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("dropGame - JMartin");
		config.setWindowedMode(800,400);
		config.setForegroundFPS(60);
		new Lwjgl3Application(new dropGame(), config);
	}
}
