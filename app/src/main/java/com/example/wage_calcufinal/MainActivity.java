package com.example.wage_calcufinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainActivity1 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalcu;

        btnCalcu = findViewById(R.id.btnCalcu);

        btnCalcu.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v) {

        EditText txtOperand1;
        TextView txtAnswer1, txtAnswer2, txtAnswer3, txtAnswer4;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtAnswer1 = findViewById(R.id.txtAnswer1);
        txtAnswer2 = findViewById(R.id.txtAnswer2);
        txtAnswer3 = findViewById(R.id.txtAnswer3);
        txtAnswer4 = findViewById(R.id.txtAnswer4);

        int op1 = 0;

        op1 = Integer.parseInt(txtOperand1.getText().toString());

        switch (v.getId()) {
            case R.id.btnCalcu:
                int wage;
                if (op1 > 8) {
                    wage = op1 * 100;
                } else if (op1 > 8) {
                    op1 -= 8;
                    wage = 800 + (op1 * 130);
                    txtAnswer1.setText("Hours:" + (op1 + 8));
                    txtAnswer2.setText("Total wage" + wage);
                    txtAnswer3.setText("Overtime Hours" + txtOperand1);
                    txtAnswer4.setText("Overtime Wage" + op1 * 130);
                } else {
                    txtAnswer1.setText("Invalid Input"); }
            }
        }
    }