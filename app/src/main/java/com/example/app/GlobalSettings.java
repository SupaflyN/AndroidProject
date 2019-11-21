package com.example.app;

import android.app.Application;

public class GlobalSettings extends Application {

    private int Score;

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;

    }
}
