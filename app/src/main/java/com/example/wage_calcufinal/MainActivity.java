package com.example.wage_calcufinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int op1 = 0;
    int op1more = 0;
    int wage;
    int overwage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtOperand1;
        TextView txtAnswer1, txtAnswer2, txtAnswer3, txtAnswer4;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtAnswer1 = findViewById(R.id.txtAnswer1Hours);
        txtAnswer2 = findViewById(R.id.txtAnswer2Over);
        txtAnswer3 = findViewById(R.id.txtAnswer3Wage);
        txtAnswer4 = findViewById(R.id.txtAnswer4OW);

        txtAnswer1.setText("-");
        txtAnswer2.setText("-");
        txtAnswer3.setText("-");
        txtAnswer4.setText("-");

        txtOperand1.setInputType(InputType.TYPE_CLASS_NUMBER);

        Button btnCalcu;

        btnCalcu = findViewById(R.id.btnCalcu);

        btnCalcu.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        EditText txtOperand1;
        TextView txtAnswer1, txtAnswer2, txtAnswer3, txtAnswer4;
        Button HoursTXT, WageTXT, OvrTmeHTXT, OvrTmeWTXT;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtAnswer1 = findViewById(R.id.txtAnswer1Hours);
        txtAnswer2 = findViewById(R.id.txtAnswer2Over);
        txtAnswer3 = findViewById(R.id.txtAnswer3Wage);
        txtAnswer4 = findViewById(R.id.txtAnswer4OW);

        txtOperand1.setInputType(InputType.TYPE_CLASS_NUMBER);

        op1 = Integer.parseInt(txtOperand1.getText().toString());

        if (v.getId() == R.id.btnCalcu) {
            if (op1 > 0) {
                if (op1 <= 8) {
                    wage = op1 * 100;
                    op1more = 0;
                    overwage = 0;
                }
                else if (op1 > 8) {
                    op1more = op1 - 8;
                    wage = 800 + (op1more * 130);
                    overwage = wage - 800;
                }
                txtAnswer1.setText(Integer.toString(op1));
                txtAnswer2.setText(Integer.toString(op1more));
                txtAnswer3.setText(Integer.toString(wage) + " PHP");
                txtAnswer4.setText(Integer.toString(overwage) + " PHP");
            }
            if (op1 <= 0 || op1 > 24) {
                txtAnswer1.setText("Invalid");
                txtAnswer2.setText("Invalid");
                txtAnswer3.setText("Invalid");
                txtAnswer4.setText("Invalid");
            }
            }
        }
    }
