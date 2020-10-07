package ru.geekbrains.java_level_b.lesson_a;

import java.awt.*;

public class Background extends Sprite {
    static float sum = 0f;
    static float howOften = 0.5f; //как часто будет менять бг при единице раз в секунду

    public Background() {
    }

    private Color backgroundColor() {
        return new Color(
                (int) (Math.random() * 255), // R
                (int) (Math.random() * 255), // G
                (int) (Math.random() * 255)  // B
        );
    }

    @Override
    void update(GameCanvas canvas, float deltaTime) {
        super.update(canvas, deltaTime);
        if(sum > howOften){
            canvas.setBackground(backgroundColor());
            sum = 0;
        }
        else {
            sum += deltaTime;
        }
    }
}
