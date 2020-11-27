package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class AnswerKey extends AppCompatActivity {
    public Button button_save;
    public int[] answer_key = new int[10];
    public int[] ansker_key1 = new int[] {2,1,2,1,2,1,2,1,2,1};
    public int[] ansker_key2 = new int[] {0,0,0,0,0,1,1,1,1,1};
    public int[] ansker_key3 = new int[] {3,2,1,0,1,2,3,2,1,2};

    RadioButton oneA,oneB,oneC,oneD,twoA,twoB,twoC,twoD,threeA,threeB,threeC,threeD,fourA,fourB,fourC,fourD,fiveA,fiveB,fiveC,fiveD,sixA,sixB,sixC,sixD,sevenA,sevenB,sevenC,sevenD,eightA,eightB,eightC,eightD,nineA,nineB,nineC,nineD,tenA,tenB,tenC,tenD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_key);



        button_save = (Button)findViewById(R.id.btn_save);
        oneA = (RadioButton)findViewById(R.id.oneA);
        oneB = (RadioButton)findViewById(R.id.oneB);
        oneC = (RadioButton)findViewById(R.id.oneC);
        oneD = (RadioButton)findViewById(R.id.oneD);
        twoA = (RadioButton)findViewById(R.id.twoA);
        twoB = (RadioButton)findViewById(R.id.twoB);
        twoC = (RadioButton)findViewById(R.id.twoC);
        twoD = (RadioButton)findViewById(R.id.twoD);
        threeA = (RadioButton)findViewById(R.id.threeA);
        threeB = (RadioButton)findViewById(R.id.threeB);
        threeC = (RadioButton)findViewById(R.id.threeC);
        threeD = (RadioButton)findViewById(R.id.threeD);
        fourA = (RadioButton)findViewById(R.id.fourA);
        fourB = (RadioButton)findViewById(R.id.fourB);
        fourC = (RadioButton)findViewById(R.id.fourC);
        fourD = (RadioButton)findViewById(R.id.fourD);
        fiveA = (RadioButton)findViewById(R.id.fiveA);
        fiveB = (RadioButton)findViewById(R.id.fiveB);
        fiveC = (RadioButton)findViewById(R.id.fiveC);
        fiveD = (RadioButton)findViewById(R.id.fiveD);
        sixA = (RadioButton)findViewById(R.id.sixA);
        sixB = (RadioButton)findViewById(R.id.sixB);
        sixC = (RadioButton)findViewById(R.id.sixC);
        sixD = (RadioButton)findViewById(R.id.sixD);
        sevenA = (RadioButton)findViewById(R.id.sevenA);
        sevenB = (RadioButton)findViewById(R.id.sevenB);
        sevenC = (RadioButton)findViewById(R.id.sevenC);
        sevenD = (RadioButton)findViewById(R.id.sevenD);
        eightA = (RadioButton)findViewById(R.id.eightA);
        eightB = (RadioButton)findViewById(R.id.eightB);
        eightC = (RadioButton)findViewById(R.id.eightC);
        eightD = (RadioButton)findViewById(R.id.eightD);
        nineA = (RadioButton)findViewById(R.id.nineA);
        nineB = (RadioButton)findViewById(R.id.nineB);
        nineC = (RadioButton)findViewById(R.id.nineC);
        nineD = (RadioButton)findViewById(R.id.nineD);
        tenA = (RadioButton)findViewById(R.id.tenA);
        tenB = (RadioButton)findViewById(R.id.tenB);
        tenC = (RadioButton)findViewById(R.id.tenC);
        tenD = (RadioButton)findViewById(R.id.tenD);

        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(oneA.isChecked()){
                    answer_key[0] = 0;
                }
                if(twoA.isChecked()){
                    answer_key[1] = 0;
                }
                if(threeA.isChecked()){
                    answer_key[2] = 0;
                }
                if(fourA.isChecked()){
                    answer_key[3] = 0;
                }
                if(fiveA.isChecked()){
                    answer_key[4] = 0;
                }
                if(sixA.isChecked()){
                    answer_key[5] = 0;
                }
                if(sevenA.isChecked()){
                    answer_key[6] = 0;
                }
                if(eightA.isChecked()){
                    answer_key[7] = 0;
                }
                if(nineA.isChecked()){
                    answer_key[8] = 0;
                }
                if(tenA.isChecked()){
                    answer_key[9] = 0;
                }
                if(oneB.isChecked()){
                    answer_key[0] = 1;
                }
                if(twoB.isChecked()){
                    answer_key[1] = 1;
                }
                if(threeB.isChecked()){
                    answer_key[2] = 1;
                }
                if(fourB.isChecked()){
                    answer_key[3] = 1;
                }
                if(fiveB.isChecked()){
                    answer_key[4] = 1;
                }
                if(sixB.isChecked()){
                    answer_key[5] = 1;
                }
                if(sevenB.isChecked()){
                    answer_key[6] = 1;
                }
                if(eightB.isChecked()){
                    answer_key[7] = 1;
                }
                if(nineB.isChecked()){
                    answer_key[8] = 1;
                }
                if(tenB.isChecked()){
                    answer_key[9] = 1;
                }

                Intent intent = new Intent(AnswerKey.this,MainActivity.class);
                intent.putExtra("int", answer_key);
                intent.putExtra("int_1", ansker_key1);
                intent.putExtra("int_2", ansker_key2);
                intent.putExtra("int_3", ansker_key3);
                startActivity(intent);


            }
        });
    }

}