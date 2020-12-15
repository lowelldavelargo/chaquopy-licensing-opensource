package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    public static int [] finalintanswerupdate = new int[10];
    public static int [] finalintanswer1update = new int[10];
    public static int [] finalintanswer2update = new int[10];
    public static int [] finalintanswer3update = new int[10];





    EditText fullname_input, mobilenumber_input, idnumber_input, score;
    Button camera_button, delete_button, answerkey_button;

    String id , fullname, mobilenumber, idnumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        fullname_input = findViewById(R.id.fullname_input2);
        mobilenumber_input = findViewById(R.id.mobilenumber_input2);
        idnumber_input = findViewById(R.id.idnumber_input2);
        camera_button = findViewById(R.id.camera_button2);
        delete_button = findViewById(R.id.delete_button);
        answerkey_button = findViewById(R.id.answerkey_button);

        int[] intanswer = getIntent().getIntArrayExtra("int");
        int[] intanswer_1 = getIntent().getIntArrayExtra("int_1");
        int[] intanswer_2 = getIntent().getIntArrayExtra("int_2");
        int[] intanswer_3 = getIntent().getIntArrayExtra("int_3");

        int flagreturnupdate = getIntent().getExtras().getInt("flagreturnupdate");

        String fullnamev1 = getIntent().getStringExtra("fullnamev1");
        String mobilenumberv1 = getIntent().getStringExtra("mobilenumberv1");
        String idv1 = getIntent().getStringExtra("idv1");
        String idnumberv1 = getIntent().getStringExtra("idnumberv1");

        getAndSetIntentData();

        if(flagreturnupdate==1) {
            finalintanswerupdate = intanswer;
            finalintanswer1update = intanswer_1;
            finalintanswer2update = intanswer_2;
            finalintanswer3update = intanswer_3;
            fullname_input.setText(fullnamev1);
            mobilenumber_input.setText(mobilenumberv1);
            idnumber_input.setText(idnumberv1);
            id = idv1;
        }

        ActionBar ab = getSupportActionBar();
        if (ab != null){
            ab.setTitle(fullname);
        }

        answerkey_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UpdateActivity.this, AnswerKey.class);
                String fullname = fullname_input.getText().toString();
                String mobilenumber = mobilenumber_input.getText().toString();
                String idnumber = idnumber_input.getText().toString();
                intent.putExtra("fullnamev1", fullname);
                intent.putExtra("mobilenumberv1", mobilenumber);
                intent.putExtra("idnumberv1", idnumber);
                intent.putExtra("idv1", id);
                intent.putExtra("flaganswerkey_update", 1);
                startActivity(intent);

            }
        });
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
                intent.putExtra("intv1", finalintanswerupdate);
                intent.putExtra("int_1v1", finalintanswer1update);
                intent.putExtra("int_2v1", finalintanswer2update);
                intent.putExtra("int_3v1", finalintanswer3update);
                intent.putExtra("idv1", id);
                intent.putExtra("fullnamev1", fullname);
                intent.putExtra("mobilenumberv1", mobilenumber);
                intent.putExtra("idnumberv1", idnumber);
                startActivity(intent);

            }
        });

        delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmDialog();
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
            //Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    void confirmDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Delete " + fullname + " ?");
        builder.setMessage("Are you sure you want to delete " + fullname + " ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(UpdateActivity.this);
                myDB.deleteOneRow(id);
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create().show();
    }
}