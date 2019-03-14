package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_roll;
    TextView tv_rollNumber;
    ImageView iv_dice, iv_dice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_roll = (Button) findViewById(R.id.btn_roll);
        tv_rollNumber = (TextView) findViewById(R.id.tv_rollNumber);
        iv_dice = (ImageView) findViewById(R.id.iv_dice);
        iv_dice2 = (ImageView) findViewById(R.id.iv_dice2);

        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int theRoll;
                int theRoll2;

                //random number between 1-6
                theRoll = r.nextInt(6) + 1;
                theRoll2 = r.nextInt(6) + 1;

                tv_rollNumber.setText("You rolled a " + theRoll2 + " and a " + theRoll);

                switch (theRoll) {
                    case 1: {
                        iv_dice.setImageResource(R.drawable.d1);
                        iv_dice2.setImageResource(R.drawable.d1);
                        break;
                    }

                    case 2: {
                        iv_dice.setImageResource(R.drawable.d2);
                        break;
                    }

                    case 3: {
                        iv_dice.setImageResource(R.drawable.d3);
                        break;
                    }

                    case 4: {
                        iv_dice.setImageResource(R.drawable.d4);
                        break;
                    }

                    case 5: {
                        iv_dice.setImageResource(R.drawable.d5);
                        break;
                    }

                    case 6: {
                        iv_dice.setImageResource(R.drawable.d6);
                        break;
                    }
                }

                switch (theRoll2) {
                    case 1: {
                        iv_dice2.setImageResource(R.drawable.d1);
                        break;
                    }

                    case 2: {
                        iv_dice2.setImageResource(R.drawable.d2);
                        break;
                    }

                    case 3: {
                        iv_dice2.setImageResource(R.drawable.d3);
                        break;
                    }

                    case 4: {
                        iv_dice2.setImageResource(R.drawable.d4);
                        break;
                    }

                    case 5: {
                        iv_dice2.setImageResource(R.drawable.d5);
                        break;
                    }

                    case 6: {
                        iv_dice2.setImageResource(R.drawable.d6);
                        break;

                    }
                }
            }
        });
    }
}
