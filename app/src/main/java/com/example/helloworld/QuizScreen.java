package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuizScreen extends AppCompatActivity {
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView ScoreView;
    private TextView QuestionView;
    private Button ButtonChoice1;
    private Button ButtonChoice2;
    private Button ButtonChoice3;
    private Button ButtonQuit;

    private String Answer;
    private int Score = 0;
    private int QuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_screen);

        ScoreView = (TextView)findViewById(R.id.viewScore);
        QuestionView = (TextView)findViewById(R.id.question);
        ButtonChoice1 = (Button)findViewById(R.id.choice1);
        ButtonChoice2 = (Button)findViewById(R.id.choice2);
        ButtonChoice3 = (Button)findViewById(R.id.choice3);
        ButtonQuit = (Button) findViewById(R.id.quit) ;

        updateQuestion();

        //Start of Button Listener for Button1,2,3 and Quit
        ButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (ButtonChoice1.getText() == Answer){
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(QuizScreen.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizScreen.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        ButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (ButtonChoice2.getText() == Answer){
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();

                    Toast.makeText(QuizScreen.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizScreen.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        ButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (ButtonChoice3.getText() == Answer){
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();

                    Toast.makeText(QuizScreen.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizScreen.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        ButtonQuit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMain();
            }
        });

    }
    private void updateQuestion(){
        QuestionView.setText(mQuestionLibrary.getQuestion(QuestionNumber));
        ButtonChoice1.setText(mQuestionLibrary.getChoice1(QuestionNumber));
        ButtonChoice2.setText(mQuestionLibrary.getChoice2(QuestionNumber));
        ButtonChoice3.setText(mQuestionLibrary.getChoice3(QuestionNumber));

        Answer = mQuestionLibrary.getCorrectAnswer(QuestionNumber);
        QuestionNumber++;
    }
    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void updateScore(int point) {
        ScoreView.setText("" + Score);
    }
}

