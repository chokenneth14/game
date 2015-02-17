package org.team1515.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import org.team1515.entities.Car;
import org.team1515.entities.Direction;
import org.team1515.entities.Circle;

/**
 * Created by azadeh2 on 1/17/2015.
 */
public class GameScreen implements Screen {
    SpriteBatch batch;
    Circle circle;
    Car car;

    @Override
    public void show() {
        batch = new SpriteBatch();
        circle = new Circle(new Sprite(new Texture("circle.png")), 0.15f, new Vector2(2, 2), 3);
        car = new Car(new Sprite(new Texture("car.png")), 0.15f, Direction.UP, new Sprite(new Texture("badlogic.jpg")), new Vector2(2, 2));
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        circle.render(batch);
        car.render(batch);

        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
