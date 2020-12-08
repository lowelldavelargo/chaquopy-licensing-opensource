package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public int[] intanswer = new int[] {2,2,1,1,0,0,3,3,1,3};
    public int[] intanswer_1 = new int[] {2,1,2,1,2,1,2,1,2,1};
    public int[] intanswer_2 = new int[] {0,0,0,0,0,1,1,1,1,1};
    public int[] intanswer_3 = new int[] {3,2,1,0,1,2,3,2,1,2};

    FloatingActionButton add_button;
    RecyclerView recyclerView;

    MyDatabaseHelper myDB;
    ArrayList<String> student_id, student_fullname, student_idnumber, student_mobilenumber, student_score;
    CustomAdapter customAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.records_view);
        add_button = findViewById(R.id.add_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                intent.putExtra("int", intanswer);
                intent.putExtra("int_1", intanswer_1);
                intent.putExtra("int_2", intanswer_2);
                intent.putExtra("int_3", intanswer_3);
                startActivity(intent);
            }
        });

        myDB = new MyDatabaseHelper(MainActivity.this);
        student_id = new ArrayList<>();
        student_fullname = new ArrayList<>();
        student_idnumber = new ArrayList<>();
        student_mobilenumber = new ArrayList<>();
        student_score = new ArrayList<>();
        storeDataInArrays();

        customAdapter = new CustomAdapter(MainActivity.this, student_id,student_fullname,student_idnumber,student_mobilenumber,student_score);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    void storeDataInArrays(){
        Cursor cursor = myDB.readAllData();
        if(cursor.getCount() == 0){
            Toast.makeText(this,"No Data.", Toast.LENGTH_SHORT).show();
        }else{
            while (cursor.moveToNext()){
                student_id.add(cursor.getString(0));
                student_fullname.add(cursor.getString(1));
                student_idnumber.add(cursor.getString(2));
                student_mobilenumber.add(cursor.getString(3));
                student_score.add(cursor.getString(4));
            }

        }
    }


}