package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    private long backPressedTime;
    private Toast backToast;

    public int[] intanswer = new int[10];
    public int[] intanswer_1 = new int[10];
    public int[] intanswer_2 = new int[10];
    public int[] intanswer_3 = new int[10];
    public int counter, flaganswerkey_returntomainfinal;

    FloatingActionButton add_button;
    RecyclerView recyclerView;

    ImageView empty_imageview;
    TextView no_data;

    MyDatabaseHelper myDB;
    ArrayList<String> student_id, student_fullname, student_idnumber, student_mobilenumber, student_score;
    CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.records_view);
        add_button = findViewById(R.id.add_button);
        empty_imageview = findViewById(R.id.empty_imageview);
        no_data = findViewById(R.id.no_data);





   //  if(counter >= 1) {

   //          int[] intreturntomain = getIntent().getIntArrayExtra("intreturntomain");
   //          int[] int_1returntomain = getIntent().getIntArrayExtra("int_1returntomain");
   //          int[] int_2returntomain = getIntent().getIntArrayExtra("int_2returntomain");
   //          int[] int_3returntomain = getIntent().getIntArrayExtra("int_3returntomain");
   //          int flaganswerkey_returntomain = getIntent().getExtras().getInt("flaganswerkey_returntomain");
   //          intanswer = intreturntomain;
   //          intanswer_1 = int_1returntomain;
   //          intanswer_2 = int_2returntomain;
   //          intanswer_3 = int_3returntomain;
   //          flaganswerkey_returntomainfinal = flaganswerkey_returntomain;




     //}


        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;

                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                intent.putExtra("intmain", intanswer);
                intent.putExtra("int_1main", intanswer_1);
                intent.putExtra("int_2main", intanswer_2);
                intent.putExtra("int_3main", intanswer_3);
                //if(flaganswerkey_returntomainfinal == 1){
                //intent.putExtra("flagmain", 1);}
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

        customAdapter = new CustomAdapter(MainActivity.this, this, student_id, student_fullname, student_idnumber, student_mobilenumber, student_score);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            recreate();
        }
    }


    void storeDataInArrays() {
        Cursor cursor = myDB.readAllData();
        if (cursor.getCount() == 0) {
            empty_imageview.setVisibility(View.VISIBLE);
            no_data.setVisibility(View.VISIBLE);
        } else {
            while (cursor.moveToNext()) {
                student_id.add(cursor.getString(0));
                student_fullname.add(cursor.getString(1));
                student_idnumber.add(cursor.getString(2));
                student_mobilenumber.add(cursor.getString(3));
                student_score.add(cursor.getString(4));
            }
            empty_imageview.setVisibility(View.GONE);
            no_data.setVisibility(View.GONE);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.delete_all){
            confirmDialog();
        }
        return super.onOptionsItemSelected(item);
    }

    void confirmDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Delete All?");
        builder.setMessage("Are you sure you want to delete all Data?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(MainActivity.this);
                myDB.deleteAllData();
                //Refresh Activity
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
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

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();


    }
}