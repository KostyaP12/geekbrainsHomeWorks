package ru.geekbrains.java_level_b.lesson_a;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    private MainCircles controller;
    long lastFrameTime;
    private static final int FPS_SLEEP_TIME = 17;
    Background background = new Background();

    GameCanvas(MainCircles controller) {
        this.controller = controller;
        lastFrameTime = System.nanoTime();
    }

    @Override
    protected void paintComponent(Graphics g) { // while (true) {
        super.paintComponent(g);
        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        controller.onDrawFrame(this, g, deltaTime, background);
        lastFrameTime = currentTime;
        try {
            Thread.sleep(FPS_SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();
    }

    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }

}