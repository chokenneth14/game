package org.team1515.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arvin on 1/11/15.
 */
public class Entity {
    Sprite sprite;



    public Entity(Sprite sprite){
        this.sprite = sprite;
    }

    public void render(SpriteBatch batch) {
        sprite.draw(batch);
    }

}
