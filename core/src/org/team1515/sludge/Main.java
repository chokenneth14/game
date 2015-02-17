package org.team1515.sludge;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.team1515.screens.GameScreen;


public class Main extends Game {
	SpriteBatch batch;

	GameScreen gameScreen;

	@Override

	public void create() {
		batch = new SpriteBatch();

		gameScreen = new GameScreen();

		setScreen(gameScreen);
	}

	@Override
	public void render() {
		super.render();
	}
}
