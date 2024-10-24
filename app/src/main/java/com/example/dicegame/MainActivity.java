package com.example.dicegame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rzutBtn, resetBtn;
    private TextView first, second, third, fourth, fifth ;
    private TextView wynikTegoLos, wynikGry, liczbaRzutow;
    private int sumScore =0;
    private int rollCount = 0;

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
    public void rollDice() {
        Random rand = new Random();
        int[] diceRes = new int[5];

        for (int i = 0; i < 5; i++) {
            diceRes[i] = rand.nextInt(6) + 1; // Numbers between 1 and 6
        }

        displayDiceResults(diceRes);

        int rollScore = 0;
        for(int i=0; i<diceRes.length;i++){
            rollScore += diceRes[i];
        }

        updateScore(rollScore);
        updateRollCount();
    }

    public void resetGame() {
        first.setText("?");
        second.setText("?");
        third.setText("?");
        fourth.setText("?");
        fifth.setText("?");

        sumScore = 0;
        rollCount = 0;
        wynikTegoLos.setText("Wynik tego losowania: 0");
        wynikGry.setText("Wynik gry: 0");
        liczbaRzutow.setText("Liczba rzutów: 0");
    }

    public void updateScore(int newScore) {
        sumScore += newScore;
        wynikTegoLos.setText("Wynik tego losowania: " + newScore);
        wynikGry.setText("Wynik gry: " + sumScore);
    }

    public void updateRollCount() {
        rollCount++;
        liczbaRzutow.setText("Liczba rzutów: " + rollCount);
    }

    public void displayDiceResults(int[] diceResults) {
        first.setText(String.valueOf(diceResults[0]));
        second.setText(String.valueOf(diceResults[1]));
        third.setText(String.valueOf(diceResults[2]));
        fourth.setText(String.valueOf(diceResults[3]));
        fifth.setText(String.valueOf(diceResults[4]));
    }
}