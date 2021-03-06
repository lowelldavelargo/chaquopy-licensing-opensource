package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class AddActivity extends AppCompatActivity {

    EditText fullname_input, mobilenumber_input, idnumber_input;
    TextView tv;
    public static int [] finalintanswer = new int[10];
    public static int [] finalintanswer1 = new int[10];
    public static int [] finalintanswer2 = new int[10];
    public static int [] finalintanswer3 = new int[10];



    Button camera_button, answerkey_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add2);


        tv = (TextView)findViewById(R.id.text_view);
        fullname_input = findViewById(R.id.fullname_input);
        mobilenumber_input = findViewById(R.id.mobilenumber_input);
        idnumber_input = findViewById(R.id.idnumber_input);
        camera_button = findViewById(R.id.camera_button);
        answerkey_button = findViewById(R.id.answerkey_button);

        String fullnamev1 = getIntent().getStringExtra("fullnamev1");
        String mobilenumberv1 = getIntent().getStringExtra("mobilenumberv1");
        String idnumberv1 = getIntent().getStringExtra("idnumberv1");



        int[] intanswer = getIntent().getIntArrayExtra("int");
        int[] intanswer_1 = getIntent().getIntArrayExtra("int_1");
        int[] intanswer_2 = getIntent().getIntArrayExtra("int_2");
        int[] intanswer_3 = getIntent().getIntArrayExtra("int_3");
        int[] intanswermain = getIntent().getIntArrayExtra("intmain");
        int[] intanswer_1main = getIntent().getIntArrayExtra("int_1main");
        int[] intanswer_2main = getIntent().getIntArrayExtra("int_2main");
        int[] intanswer_3main = getIntent().getIntArrayExtra("int_3main");
        int flagreturnadd = getIntent().getExtras().getInt("flagreturnadd");
        //int flagmain = getIntent().getExtras().getInt("flagmain");

         if(flagreturnadd==1) {
             finalintanswer = null;
             finalintanswer1 = null;
             finalintanswer2 = null;
             finalintanswer3 = null;
             finalintanswer = intanswer;
             finalintanswer1 = intanswer_1;
             finalintanswer2 = intanswer_2;
             finalintanswer3 = intanswer_3;
             fullname_input.setText(fullnamev1);
             mobilenumber_input.setText(mobilenumberv1);
             idnumber_input.setText(idnumberv1);
         }

        //if(flagmain==1) {
        //    finalintanswer = null;
        //    finalintanswer1 = null;
        //    finalintanswer2 = null;
        //    finalintanswer3 = null;
        //    finalintanswer = intanswermain;
        //    finalintanswer1 = intanswer_1main;
        //    finalintanswer2 = intanswer_2main;
        //    finalintanswer3 = intanswer_3main;
        //    //fullname_input.setText(fullnamev1);
        //    //mobilenumber_input.setText(mobilenumberv1);
        //    //idnumber_input.setText(idnumberv1);
        //}

        answerkey_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddActivity.this, AnswerKey.class);
                String fullname = fullname_input.getText().toString();
                String mobilenumber = mobilenumber_input.getText().toString();
                String idnumber = idnumber_input.getText().toString();
                intent.putExtra("fullnamev1", fullname);
                intent.putExtra("mobilenumberv1", mobilenumber);
                intent.putExtra("idnumberv1", idnumber);
                intent.putExtra("flaganswerkey_add", 1);
                startActivity(intent);

            }
        });





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