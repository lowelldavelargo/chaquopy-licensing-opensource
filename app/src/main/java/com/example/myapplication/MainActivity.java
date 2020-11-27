package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {
    public Button button;


    Button btn;
    TextView tv;
    ImageView iv,iv1;

    BitmapDrawable drawable;
    Bitmap bitmap;
    String imageString = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btn);
        tv = (TextView)findViewById(R.id.text_view);
        iv = (ImageView)findViewById(R.id.image_view);
        button = (Button)findViewById(R.id.answerkey);
        iv1 = (ImageView)findViewById(R.id.image_view1);



        if(!Python.isStarted())
            Python.start(new AndroidPlatform(this));

        final Python py = Python.getInstance();
        PyObject pyobj = py.getModule("script");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AnswerKey.class);
                startActivity(i);
            }
        });

        Intent intent = getIntent();
        int[] intanswer = intent.getIntArrayExtra("int");
        int[] intanswer_1 = intent.getIntArrayExtra("int_1");
        int[] intanswer_2 = intent.getIntArrayExtra("int_2");
        int[] intanswer_3 = intent.getIntArrayExtra("int_3");
        String score = getIntent().getStringExtra("score");
        tv.setText(score);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Camera.class);
                intent.putExtra("int", intanswer);
                intent.putExtra("int_1", intanswer_1);
                intent.putExtra("int_2", intanswer_2);
                intent.putExtra("int_3", intanswer_3);
                startActivity(intent);



            }
        });


    }

}