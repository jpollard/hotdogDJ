package com.happyrobotics.hotdogderek.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.happyrobotics.hotdogderek.HotdogDerek;
import com.happyrobotics.hotdogderek.Scenes.Hud;

public class PlayScreen implements Screen {
    private HotdogDerek game;

    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private Hud hud;

    public PlayScreen(HotdogDerek game){
        this.game = game;
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(HotdogDerek.V_WIDTH, HotdogDerek.V_HEIGHT, gamecam);
        hud = new Hud(game.batch);
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        // Clear the screen
         Gdx.gl.glClearColor(1, 0, 0, 1);
         Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

         // set view for the game world
         game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
         hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
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
