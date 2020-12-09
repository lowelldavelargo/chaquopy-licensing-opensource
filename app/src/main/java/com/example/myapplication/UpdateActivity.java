package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    public int[] intanswer = new int[] {2,2,1,1,0,0,3,3,1,3};
    public int[] intanswer_1 = new int[] {2,1,2,1,2,1,2,1,2,1};
    public int[] intanswer_2 = new int[] {1,1,1,1,1,1,1,1,1,1};
    public int[] intanswer_3 = new int[] {3,2,1,0,1,2,3,2,1,2};





    EditText fullname_input, mobilenumber_input, idnumber_input, score;
    Button camera_button;

    String id, fullname, mobilenumber, idnumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        fullname_input = findViewById(R.id.fullname_input2);
        mobilenumber_input = findViewById(R.id.mobilenumber_input2);
        idnumber_input = findViewById(R.id.idnumber_input2);
        camera_button = findViewById(R.id.camera_button2);


        getAndSetIntentData();
        camera_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //MyDatabaseHelper myDB = new MyDatabaseHelper(UpdateActivity.this);
                //fullname = fullname_input.getText().toString().trim();
                //mobilenumber = mobilenumber_input.getText().toString().trim();
                //idnumber = idnumber_input.getText().toString().trim();
                //idnumber = idnumber_input.getText().toString().trim();
                //myDB.updateData(id, fullname, idnumber,mobilenumber);

                String fullname = fullname_input.getText().toString();
                String mobilenumber = mobilenumber_input.getText().toString();
                String idnumber = idnumber_input.getText().toString();

                Intent intent = new Intent(UpdateActivity.this, Camera2.class);
                intent.putExtra("intv1", intanswer);
                intent.putExtra("int_1v1", intanswer_1);
                intent.putExtra("int_2v1", intanswer_2);
                intent.putExtra("int_3v1", intanswer_3);
                intent.putExtra("idv1", id);
                intent.putExtra("fullnamev1", fullname);
                intent.putExtra("mobilenumberv1", mobilenumber);
                intent.putExtra("idnumberv1", idnumber);
                startActivity(intent);

            }
        });

    }
    void getAndSetIntentData(){
        if(getIntent().hasExtra("id") && getIntent().hasExtra("fullname") && getIntent().hasExtra("mobilenumber")  &&
                getIntent().hasExtra("idnumber")){
            //Getting Data from Intent
            id = getIntent().getStringExtra("id");
            fullname = getIntent().getStringExtra("fullname");
            mobilenumber = getIntent().getStringExtra("mobilenumber");
            idnumber = getIntent().getStringExtra("idnumber");


            //Setting Intent Data
            fullname_input.setText(fullname);
            mobilenumber_input.setText(idnumber);
            idnumber_input.setText(mobilenumber);
        }else{
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }
}