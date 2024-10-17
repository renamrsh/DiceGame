package com.example.dicegame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button rzutBtn, resetBtn;
    private TextView first, second, third, fourth, fifth ;
    private TextView wynikTegoLos, wynikGry, liczbaRzutow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rzutBtn = findViewById(R.id.rzutBtn);
        resetBtn = findViewById(R.id.resetBtn);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        fifth = findViewById(R.id.fifth);
        wynikTegoLos = findViewById(R.id.wynikTegoLos);
        wynikGry = findViewById(R.id.wynikGry);
        liczbaRzutow = findViewById(R.id.liczbaRzutow);


        rzutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetGame();
            }
        });

    }
    public void rollDice(){

    }
    public void resetGame(){

    }
    public void updateScore(int newScore){

    }
    public void updateRollCount(){

    }
    public void displayDiceResults(int[] diceResults){

    }
}