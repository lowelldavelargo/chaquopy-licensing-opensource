package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

import java.io.ByteArrayOutputStream;

public class Camera extends AppCompatActivity {

    public String score;


    Button btn,btn_save;
    TextView tv;
    ImageView iv,iv1;

    BitmapDrawable drawable;
    Bitmap bitmap;
    String imageString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);



        btn = (Button)findViewById(R.id.analyze_button);
        tv = (TextView)findViewById(R.id.text_view);
        iv = (ImageView)findViewById(R.id.image_view);
        iv1 = (ImageView)findViewById(R.id.image_view1);
        btn_save = (Button) findViewById(R.id.save_button);



        if(!Python.isStarted())
            Python.start(new AndroidPlatform(this));

        final Python py = Python.getInstance();
        PyObject pyobj = py.getModule("script");


        int[] intanswer = getIntent().getIntArrayExtra("int");
        int[] intanswer_1 = getIntent().getIntArrayExtra("int_1");
        int[] intanswer_2 = getIntent().getIntArrayExtra("int_2");
        int[] intanswer_3 = getIntent().getIntArrayExtra("int_3");



        String fullname = getIntent().getStringExtra("fullname");
        String mobilenumber = getIntent().getStringExtra("mobilenumber");
        String idnumber = getIntent().getStringExtra("idnumber");







        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                drawable = (BitmapDrawable)iv.getDrawable();
                bitmap = drawable.getBitmap();
                imageString = getImageString(bitmap);
                PyObject obj = pyobj.callAttr("main",imageString,intanswer,intanswer_1,intanswer_2,intanswer_3);
                String str = obj.toString();
                byte data[] = android.util.Base64.decode(str, Base64.DEFAULT);
                Bitmap bmp = BitmapFactory.decodeByteArray(data, 0,data.length);
                iv.setImageDrawable(null);
                iv1.setImageBitmap(bmp);
                PyObject obj1 = pyobj.callAttr("main1",imageString,intanswer,intanswer_1,intanswer_2,intanswer_3);
                score = obj1.toString();
                tv.setText(score);


            }
        });

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(Camera.this);
                myDB.addstudent(fullname, mobilenumber, score, idnumber);
                Intent intent = new Intent(Camera.this, AddActivity.class);
                intent.putExtra("flag", 1);
                startActivity(intent);


            }

        });


    }
    private String getImageString(Bitmap bitmap){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100,baos);
        byte[]imageBytes = baos.toByteArray();
        String encodedImage = android.util.Base64.encodeToString(imageBytes, Base64.DEFAULT);
        return encodedImage;
    }
}