package org.team1515.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Circle {
    List<MovableEntity> circles;
    Vector2 speed;
    Sprite sprite;
    Random random;
    int circleFrequency;

    public Circle(Sprite sprite, float scale, Vector2 speed, int circleFrequency) {
        circles = new ArrayList<MovableEntity>();
        this.sprite = sprite;
        sprite.setScale(scale);
        this.circleFrequency = circleFrequency;
        random = new Random();
    }

    public void addCircle() {
        Direction direction;
        switch(random.nextInt(4)) {
            case 0:
                direction = Direction.UP;
                break;
            case 1:
                direction = Direction.DOWN;
                break;
            case 2:
                direction = Direction.LEFT;
                break;
            case 3:
                direction = Direction.RIGHT;
                break;
            default:
                direction = Direction.UP;
        }
        MovableEntity circle = new MovableEntity(sprite.getTexture(), direction, speed, sprite.getScaleX());
        circle.sprite.setOrigin(random.nextInt(Gdx.graphics.getWidth()), random.nextInt(Gdx.graphics.getHeight()));
        circles.add(circle);
    }

    public void render(SpriteBatch batch) {
        if(random.nextInt(1000) < circleFrequency) {
            addCircle();
        }

        for(Entity circle : circles) {
            if(Gdx.input.isTouched() && new Rectangle(Gdx.input.getX(), Gdx.input.getY(), 1, 1).overlaps(circle.sprite.getBoundingRectangle())) {
                System.out.println("Hit circle");
            } else {
                System.out.println("Not hit");
            }
            circle.render(batch);
        }
    }
}
