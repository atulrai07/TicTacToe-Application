package com.example.tictacatul;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class TicTac_Atul extends AppCompatActivity {
    int count = 0;
    int flag = 0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView result_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        init();

    }
    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        result_txt = findViewById(R.id.result_txt);

    }


    public void Check(View view){

        Button btnCurrent = (Button)view;

        if (btnCurrent.getText().toString().equals("")) {

            count++;
            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }

            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    //1
                    Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                    result_txt.setText(b1+" is the winner 🥇");
                    Delay();
                    newGame();
                    result_txt.setText(b1+" was the winner 🥇");

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    //2
                    Toast.makeText(this, "Winner is : " + b4, Toast.LENGTH_SHORT).show();
                    result_txt.setText(b2+" is the winner 🥇");
                    Delay();
                    newGame();
                    result_txt.setText(b2+" was the winner 🥇");
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    //3
                    Toast.makeText(this, "Winner is : " + b7, Toast.LENGTH_SHORT).show();
                    result_txt.setText(b7+" is the winner 🥇");
                    Delay();
                    newGame();
                    result_txt.setText(b7+" was the winner 🥇");
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    //4
                    Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                    result_txt.setText(b1+" is the winner 🥇");
                    Delay();
                    newGame();
                    result_txt.setText(b1+" was the winner 🥇");
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    //5
                    Toast.makeText(this, "Winner is : " + b2, Toast.LENGTH_SHORT).show();
                    result_txt.setText(b2+" is the winner 🥇");
                    Delay();
                    newGame();
                    result_txt.setText(b2+" was the winner 🥇");
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    //6
                    Toast.makeText(this, "Winner is : " + b3, Toast.LENGTH_SHORT).show();
                    result_txt.setText(b3+" is the winner 🥇");
                    Delay();
                    newGame();
                    result_txt.setText(b3+" was the winner 🥇");
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    //7
                    Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                    result_txt.setText(b1+" is the winner 🥇");
                    Delay();
                    newGame();
                    result_txt.setText(b1+" was the winner 🥇");
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    //8
                    Toast.makeText(this, "Winner is : " + b3, Toast.LENGTH_SHORT).show();
                    result_txt.setText(b3+" is the winner 🥇");
                    Delay();
                    newGame();
                    result_txt.setText(b3+" was the winner 🥇");
                } else if (count==9) {
                    Toast.makeText(this, "Draw, कोई नहीं जीता", Toast.LENGTH_SHORT).show();
                    Delay();
                    newGame();
                    result_txt.setText("कोई नहीं जीता 🤓");
                }

            }

        }

    }
    public void newGame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag = 0;
        count = 0;
    }
    public void Delay() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}