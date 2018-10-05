package com.sergifam.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {


    private Button TrueButtom;
    private Button FalseButtom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        TrueButtom = findViewById(R.id.true_button);
        TrueButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toastTrue = Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_LONG);
                toastTrue.setGravity(Gravity.TOP, 0, 120);
                toastTrue.show();
                //                Toast toastTrue = Toast.makeText(QuizActivity.this,
//                        R.string.correct_toast,
//                        Toast.LENGTH_LONG);
//                toastTrue.setGravity(Gravity.TOP, 0, 120);
//                toastTrue.show();
            }
        });
        FalseButtom = findViewById(R.id.false_button);
        FalseButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toastFalse = Toast.makeText(QuizActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT);

                toastFalse.setGravity(Gravity.BOTTOM, 0, 10);
                toastFalse.show();
            }
        });
    }
}
