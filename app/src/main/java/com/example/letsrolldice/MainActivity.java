package com.example.letsrolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button lower, higher;
    ImageView computerDie, playerDie, gameTie,
            computerWinner,playerWinner,finalResult;
    int computerScore =0;
    int playerScore =0;
    TextView ComputerScores, PlayerScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        computerDie = findViewById(R.id.computerImage);
        playerDie = findViewById(R.id.playerImage);
        gameTie = findViewById(R.id.game_tie);
        computerWinner = findViewById(R.id.computer_winner);
        playerWinner = findViewById(R.id.player_winner);
        lower = findViewById(R.id.Lower);
        higher = findViewById(R.id.Higher);
        finalResult = findViewById(R.id.finalResult);


        gameTie.setVisibility(View.INVISIBLE);
        computerWinner.setVisibility(View.INVISIBLE);
        playerWinner.setVisibility(View.INVISIBLE);
        finalResult.setVisibility(View.INVISIBLE);

        int[] dieArray = {R.drawable.dice1,
                R.drawable.dice2, R.drawable.dice3,
                R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        ComputerScores = findViewById(R.id.ComputerScore);
        PlayerScores = findViewById(R.id.PlayerScore);

        ComputerScores.setText("PTS: " + computerScore);
        PlayerScores.setText("PTS: " + playerScore);

        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randNextComputer = rand.nextInt(6);
                int randNextPlayer = rand.nextInt(6);
                computerDie.setImageResource(dieArray[randNextComputer]);
                playerDie.setImageResource(dieArray[randNextPlayer]);
                Toast.makeText(MainActivity.this, "Dice rolled for computer is " + (randNextComputer + 1) +
                        " and for player is " + (randNextPlayer + 1) , Toast.LENGTH_SHORT).show();
                if(randNextComputer < randNextPlayer){
                    //computerWinner.setVisibility(View.VISIBLE);
                    //playerWinner.setVisibility(View.INVISIBLE);
                    //gameTie.setVisibility(View.INVISIBLE);
                    finalResult.setVisibility(View.VISIBLE);
                    finalResult.setImageResource(R.drawable.computer_winner);
                    computerScore += 10;
                    ComputerScores.setText("PTS: " + computerScore);
                    PlayerScores.setText("PTS: " + playerScore);
                }else if(randNextComputer == randNextPlayer){
                    //computerWinner.setVisibility(View.INVISIBLE);
                    //playerWinner.setVisibility(View.INVISIBLE);
                    //gameTie.setVisibility(View.VISIBLE);
                    finalResult.setVisibility(View.VISIBLE);
                    finalResult.setImageResource(R.drawable.geme_tie);
                    ComputerScores.setText("PTS: " + computerScore);
                    PlayerScores.setText("PTS: " + playerScore);
                }else{
                    //computerWinner.setVisibility(View.INVISIBLE);
                    //playerWinner.setVisibility(View.VISIBLE);
                    //gameTie.setVisibility(View.INVISIBLE);
                    finalResult.setVisibility(View.VISIBLE);
                    finalResult.setImageResource(R.drawable.player_winner);
                    playerScore += 10;
                    ComputerScores.setText("PTS: " + computerScore);
                    PlayerScores.setText("PTS: " + playerScore);
                }
            }
        });

        higher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randNextComputer = rand.nextInt(6);
                int randNextPlayer = rand.nextInt(6);
                computerDie.setImageResource(dieArray[randNextComputer]);
                playerDie.setImageResource(dieArray[randNextPlayer]);
                Toast.makeText(MainActivity.this, "Dice rolled for computer is " + (randNextComputer + 1) +
                        " and for player is " + (randNextPlayer + 1) , Toast.LENGTH_SHORT).show();
                if(randNextComputer > randNextPlayer){
                    //computerWinner.setVisibility(View.VISIBLE);
                    //playerWinner.setVisibility(View.INVISIBLE);
                    //gameTie.setVisibility(View.INVISIBLE);
                    finalResult.setVisibility(View.VISIBLE);
                    finalResult.setImageResource(R.drawable.computer_winner);
                    computerScore += 10;
                    ComputerScores.setText("PTS: " + computerScore);
                    PlayerScores.setText("PTS: " + playerScore);
                }else if(randNextComputer == randNextPlayer){
                    //computerWinner.setVisibility(View.INVISIBLE);
                    //playerWinner.setVisibility(View.INVISIBLE);
                    //gameTie.setVisibility(View.VISIBLE);
                    finalResult.setVisibility(View.VISIBLE);
                    finalResult.setImageResource(R.drawable.geme_tie);
                    ComputerScores.setText("PTS: " + computerScore);
                    PlayerScores.setText("PTS: " + playerScore);
                }else{
                    //computerWinner.setVisibility(View.INVISIBLE);
                    //playerWinner.setVisibility(View.VISIBLE);
                    //gameTie.setVisibility(View.INVISIBLE);
                    finalResult.setVisibility(View.VISIBLE);
                    finalResult.setImageResource(R.drawable.player_winner);
                    playerScore += 10;
                    ComputerScores.setText("PTS: " + computerScore);
                    PlayerScores.setText("PTS: " + playerScore);
                }
            }
        });
    }
}