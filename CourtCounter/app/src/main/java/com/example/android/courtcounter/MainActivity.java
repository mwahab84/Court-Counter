package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare and initialize 2 variables to hold Team A & Team B scores' values
    //respectively...
    int scoreTeamA,scoreTeamB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Create a method that displays the score of Team A by changing the text value of the score TextView
    //it takes and integer as an argument that represents the score to be shown
    public void displayScoreTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //Create a method that displays the score of Team B by changing the text value of the score TextView
    //it takes and integer as an argument that represents the score to be shown
    public void displayScoreTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Create a method that adds 3 points to Team A and then displays the new score value
    public void plusThreePointsA(View view){
        scoreTeamA+=3;
        displayScoreTeamA(scoreTeamA);
    }

    //Create a method that adds 2 points to Team A and then displays the new score value
    public void plusTwoPointsA(View view){
        scoreTeamA+=2;
        displayScoreTeamA(scoreTeamA);
    }

    //Create a method that adds 1 point to Team A and then displays the new score value
    public void freeThrowA(View view){
        scoreTeamA+=1;
        displayScoreTeamA(scoreTeamA);
    }

    //Create a method that adds 3 points to Team B and then displays the new score value
    public void plusThreePointsB(View view){
        scoreTeamB+=3;
        displayScoreTeamB(scoreTeamB);
    }

    //Create a method that adds 2 points to Team B and then displays the new score value
    public void plusTwoPointsB(View view){
        scoreTeamB+=2;
        displayScoreTeamB(scoreTeamB);
    }

    //Create a method that adds 1 point to Team B and then displays the new score value
    public void freeThrowB(View view){
        scoreTeamB+=1;
        displayScoreTeamB(scoreTeamB);
    }

    //Create a method that resets score variables to zero and displays it on the appropriate TextViews
    public void resetScore(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);

    }
}
