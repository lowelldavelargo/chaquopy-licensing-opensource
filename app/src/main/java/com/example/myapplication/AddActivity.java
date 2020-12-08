package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    EditText fullname_input, mobilenumber_input, idnumber_input;
    TextView tv;
    public static int [] finalintanswer = new int[10];
    public static int [] finalintanswer1 = new int[10];
    public static int [] finalintanswer2 = new int[10];
    public static int [] finalintanswer3 = new int[10];



    Button camera_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add2);


        tv = (TextView)findViewById(R.id.text_view);
        fullname_input = findViewById(R.id.fullname_input);
        mobilenumber_input = findViewById(R.id.mobilenumber_input);
        idnumber_input = findViewById(R.id.idnumber_input);
        camera_button = findViewById(R.id.camera_button);

        int[] intanswer = getIntent().getIntArrayExtra("int");
        int[] intanswer_1 = getIntent().getIntArrayExtra("int_1");
        int[] intanswer_2 = getIntent().getIntArrayExtra("int_2");
        int[] intanswer_3 = getIntent().getIntArrayExtra("int_3");
        int flag = getIntent().getExtras().getInt("flag");

         if(flag!=1) {
             finalintanswer = intanswer;
             finalintanswer1 = intanswer_1;
             finalintanswer2 = intanswer_2;
             finalintanswer3 = intanswer_3;
         }





        camera_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fullname = fullname_input.getText().toString();
                String mobilenumber = mobilenumber_input.getText().toString();
                String idnumber = idnumber_input.getText().toString();
                Intent intent = new Intent(AddActivity.this, Camera.class);
                intent.putExtra("int", finalintanswer);
                intent.putExtra("int_1", finalintanswer1);
                intent.putExtra("int_2", finalintanswer2);
                intent.putExtra("int_3", finalintanswer3);
                intent.putExtra("fullname", fullname);
                intent.putExtra("mobilenumber", mobilenumber);
                intent.putExtra("idnumber", idnumber);
                startActivity(intent);
            }
        });
    }
}