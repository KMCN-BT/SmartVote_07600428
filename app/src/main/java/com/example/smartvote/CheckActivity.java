
package com.example.smartvote;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        Button buttoncheck = findViewById(R.id.check_button);

        buttoncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText NumberText = findViewById(R.id.editText_number);
                String number = NumberText.getText().toString();

                if(NumberText.length() != 13){
                    Toast t = Toast.makeText(CheckActivity.this, "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    if(number.equals("1111111111111") || number.equals("2222222222222")){
                        AlertDialog.Builder dialog = new AlertDialog.Builder(CheckActivity.this);
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                        dialog.setNegativeButton("OK", null);
                        dialog.show();
                    }
                    else{
                        AlertDialog.Builder dialog = new AlertDialog.Builder(CheckActivity.this);
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณไม่มีมีสิทธิเลือกตั้ง");
                        dialog.setNegativeButton("OK", null);
                        dialog.show();
                    }
                }

            }
        });
    }
}