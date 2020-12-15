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
    public int[] ansker_key1 = new int[10];
    public int[] ansker_key2 = new int[10];
    public int[] ansker_key3 = new int[10];

    RadioButton oneA,oneB,oneC,oneD,twoA,twoB,twoC,twoD,threeA,threeB,threeC,threeD,fourA,fourB,fourC,fourD,fiveA,fiveB,fiveC,fiveD,sixA,sixB,sixC,sixD,sevenA,sevenB,sevenC,sevenD,eightA,eightB,eightC,eightD,nineA,nineB,nineC,nineD,tenA,tenB,tenC,tenD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_key);

        String fullnamev1 = getIntent().getStringExtra("fullnamev1");
        String mobilenumberv1 = getIntent().getStringExtra("mobilenumberv1");
        String idv1 = getIntent().getStringExtra("idv1");
        String idnumberv1 = getIntent().getStringExtra("idnumberv1");


        int flaganswerkey_add = getIntent().getExtras().getInt("flaganswerkey_add");
        int flaganswerkey_update = getIntent().getExtras().getInt("flaganswerkey_update");


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
        oneA = (RadioButton)findViewById(R.id.oneA);
        RadioButton one_1A = (RadioButton)findViewById(R.id.one_1B);
        RadioButton two_1A = (RadioButton)findViewById(R.id.two_1B);
        RadioButton three_1A = (RadioButton)findViewById(R.id.three_1B);
        RadioButton four_1A = (RadioButton)findViewById(R.id.four_1B);
        RadioButton five_1A = (RadioButton)findViewById(R.id.five_1B);
        RadioButton six_1A = (RadioButton)findViewById(R.id.six_1B);
        RadioButton seven_1A = (RadioButton)findViewById(R.id.seven_1B);
        RadioButton eight_1A = (RadioButton)findViewById(R.id.eight_1B);
        RadioButton nine_1A = (RadioButton)findViewById(R.id.nine_1B);
        RadioButton twentyA = (RadioButton)findViewById(R.id.twentyB);
        RadioButton one_1B = (RadioButton)findViewById(R.id.one_1B);
        RadioButton two_1B = (RadioButton)findViewById(R.id.two_1B);
        RadioButton three_1B = (RadioButton)findViewById(R.id.three_1B);
        RadioButton four_1B = (RadioButton)findViewById(R.id.four_1B);
        RadioButton five_1B = (RadioButton)findViewById(R.id.five_1B);
        RadioButton six_1B = (RadioButton)findViewById(R.id.six_1B);
        RadioButton seven_1B = (RadioButton)findViewById(R.id.seven_1B);
        RadioButton eight_1B = (RadioButton)findViewById(R.id.eight_1B);
        RadioButton nine_1B = (RadioButton)findViewById(R.id.nine_1B);
        RadioButton twentyB = (RadioButton)findViewById(R.id.twentyB);
        RadioButton one_1C = (RadioButton)findViewById(R.id.one_1C);
        RadioButton two_1C = (RadioButton)findViewById(R.id.two_1C);
        RadioButton three_1C = (RadioButton)findViewById(R.id.three_1C);
        RadioButton four_1C = (RadioButton)findViewById(R.id.four_1C);
        RadioButton five_1C = (RadioButton)findViewById(R.id.five_1C);
        RadioButton six_1C = (RadioButton)findViewById(R.id.six_1C);
        RadioButton seven_1C = (RadioButton)findViewById(R.id.seven_1C);
        RadioButton eight_1C = (RadioButton)findViewById(R.id.eight_1C);
        RadioButton nine_1C = (RadioButton)findViewById(R.id.nine_1C);
        RadioButton twentyC = (RadioButton)findViewById(R.id.twentyC);
        RadioButton one_1D = (RadioButton)findViewById(R.id.one_1D);
        RadioButton two_1D = (RadioButton)findViewById(R.id.two_1D);
        RadioButton three_1D = (RadioButton)findViewById(R.id.three_1D);
        RadioButton four_1D = (RadioButton)findViewById(R.id.four_1D);
        RadioButton five_1D = (RadioButton)findViewById(R.id.five_1D);
        RadioButton six_1D = (RadioButton)findViewById(R.id.six_1D);
        RadioButton seven_1D = (RadioButton)findViewById(R.id.seven_1D);
        RadioButton eight_1D = (RadioButton)findViewById(R.id.eight_1D);
        RadioButton nine_1D = (RadioButton)findViewById(R.id.nine_1D);
        RadioButton twentyD = (RadioButton)findViewById(R.id.twentyD);
        RadioButton one_2A = (RadioButton)findViewById(R.id.one_2A);
        RadioButton two_2A = (RadioButton)findViewById(R.id.two_2A);
        RadioButton three_2A = (RadioButton)findViewById(R.id.three_2A);
        RadioButton four_2A = (RadioButton)findViewById(R.id.four_2A);
        RadioButton five_2A = (RadioButton)findViewById(R.id.five_2A);
        RadioButton six_2A = (RadioButton)findViewById(R.id.six_2A);
        RadioButton seven_2A = (RadioButton)findViewById(R.id.seven_2A);
        RadioButton eight_2A = (RadioButton)findViewById(R.id.eight_2A);
        RadioButton nine_2A = (RadioButton)findViewById(R.id.nine_2A);
        RadioButton thirtyA = (RadioButton)findViewById(R.id.thirtyA);
        RadioButton one_2B = (RadioButton)findViewById(R.id.one_2B);
        RadioButton two_2B = (RadioButton)findViewById(R.id.two_2B);
        RadioButton three_2B = (RadioButton)findViewById(R.id.three_2B);
        RadioButton four_2B = (RadioButton)findViewById(R.id.four_2B);
        RadioButton five_2B = (RadioButton)findViewById(R.id.five_2B);
        RadioButton six_2B = (RadioButton)findViewById(R.id.six_2B);
        RadioButton seven_2B = (RadioButton)findViewById(R.id.seven_2B);
        RadioButton eight_2B = (RadioButton)findViewById(R.id.eight_2B);
        RadioButton nine_2B = (RadioButton)findViewById(R.id.nine_2B);
        RadioButton thirtyB = (RadioButton)findViewById(R.id.thirtyB);
        RadioButton one_2C = (RadioButton)findViewById(R.id.one_2C);
        RadioButton two_2C = (RadioButton)findViewById(R.id.two_2C);
        RadioButton three_2C = (RadioButton)findViewById(R.id.three_2C);
        RadioButton four_2C = (RadioButton)findViewById(R.id.four_2C);
        RadioButton five_2C = (RadioButton)findViewById(R.id.five_2C);
        RadioButton six_2C = (RadioButton)findViewById(R.id.six_2C);
        RadioButton seven_2C = (RadioButton)findViewById(R.id.seven_2C);
        RadioButton eight_2C = (RadioButton)findViewById(R.id.eight_2C);
        RadioButton nine_2C = (RadioButton)findViewById(R.id.nine_2C);
        RadioButton thirtyC = (RadioButton)findViewById(R.id.thirtyC);
        RadioButton one_2D = (RadioButton)findViewById(R.id.one_2D);
        RadioButton two_2D = (RadioButton)findViewById(R.id.two_2D);
        RadioButton three_2D = (RadioButton)findViewById(R.id.three_2D);
        RadioButton four_2D = (RadioButton)findViewById(R.id.four_2D);
        RadioButton five_2D = (RadioButton)findViewById(R.id.five_2D);
        RadioButton six_2D = (RadioButton)findViewById(R.id.six_2D);
        RadioButton seven_2D = (RadioButton)findViewById(R.id.seven_2D);
        RadioButton eight_2D = (RadioButton)findViewById(R.id.eight_2D);
        RadioButton nine_2D = (RadioButton)findViewById(R.id.nine_2D);
        RadioButton thirtyD = (RadioButton)findViewById(R.id.thirtyD);
        RadioButton one_3A= (RadioButton)findViewById(R.id.one_3A);
        RadioButton two_3A= (RadioButton)findViewById(R.id.two_3A);
        RadioButton three_3A = (RadioButton)findViewById(R.id.three_3A);
        RadioButton four_3A= (RadioButton)findViewById(R.id.four_3A);
        RadioButton five_3A= (RadioButton)findViewById(R.id.five_3A);
        RadioButton six_3A= (RadioButton)findViewById(R.id.six_3A);
        RadioButton seven_3A= (RadioButton)findViewById(R.id.seven_3A);
        RadioButton eight_3A= (RadioButton)findViewById(R.id.eight_3A);
        RadioButton nine_3A= (RadioButton)findViewById(R.id.nine_3A);
        RadioButton fourtyA= (RadioButton)findViewById(R.id.fourtyA);
        RadioButton one_3B= (RadioButton)findViewById(R.id.one_3B);
        RadioButton two_3B= (RadioButton)findViewById(R.id.two_3B);
        RadioButton three_3B = (RadioButton)findViewById(R.id.three_3B);
        RadioButton four_3B= (RadioButton)findViewById(R.id.four_3B);
        RadioButton five_3B= (RadioButton)findViewById(R.id.five_3B);
        RadioButton six_3B= (RadioButton)findViewById(R.id.six_3B);
        RadioButton seven_3B= (RadioButton)findViewById(R.id.seven_3B);
        RadioButton eight_3B= (RadioButton)findViewById(R.id.eight_3B);
        RadioButton nine_3B= (RadioButton)findViewById(R.id.nine_3B);
        RadioButton fourtyB= (RadioButton)findViewById(R.id.fourtyB);
        RadioButton one_3C= (RadioButton)findViewById(R.id.one_3C);
        RadioButton two_3C= (RadioButton)findViewById(R.id.two_3C);
        RadioButton three_3C = (RadioButton)findViewById(R.id.three_3C);
        RadioButton four_3C= (RadioButton)findViewById(R.id.four_3C);
        RadioButton five_3C= (RadioButton)findViewById(R.id.five_3C);
        RadioButton six_3C= (RadioButton)findViewById(R.id.six_3C);
        RadioButton seven_3C= (RadioButton)findViewById(R.id.seven_3C);
        RadioButton eight_3C= (RadioButton)findViewById(R.id.eight_3C);
        RadioButton nine_3C= (RadioButton)findViewById(R.id.nine_3C);
        RadioButton fourtyC= (RadioButton)findViewById(R.id.fourtyC);
        RadioButton one_3D= (RadioButton)findViewById(R.id.one_3D);
        RadioButton two_3D= (RadioButton)findViewById(R.id.two_3D);
        RadioButton three_3D = (RadioButton)findViewById(R.id.three_3D);
        RadioButton four_3D= (RadioButton)findViewById(R.id.four_3D);
        RadioButton five_3D= (RadioButton)findViewById(R.id.five_3D);
        RadioButton six_3D= (RadioButton)findViewById(R.id.six_3D);
        RadioButton seven_3D= (RadioButton)findViewById(R.id.seven_3D);
        RadioButton eight_3D= (RadioButton)findViewById(R.id.eight_3D);
        RadioButton nine_3D= (RadioButton)findViewById(R.id.nine_3D);
        RadioButton fourtyD= (RadioButton)findViewById(R.id.fourtyD);

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
                if(oneC.isChecked()){
                    answer_key[0] = 2;
                }
                if(twoC.isChecked()){
                    answer_key[1] = 2;
                }
                if(threeC.isChecked()){
                    answer_key[2] = 2;
                }
                if(fourC.isChecked()){
                    answer_key[3] = 2;
                }
                if(fiveC.isChecked()){
                    answer_key[4] = 2;
                }
                if(sixC.isChecked()){
                    answer_key[5] = 2;
                }
                if(sevenC.isChecked()){
                    answer_key[6] = 2;
                }
                if(eightC.isChecked()){
                    answer_key[7] = 2;
                }
                if(nineC.isChecked()){
                    answer_key[8] = 2;
                }
                if(tenC.isChecked()){
                    answer_key[9] = 2;
                }
                if(oneD.isChecked()){
                    answer_key[0] = 3;
                }
                if(twoD.isChecked()){
                    answer_key[1] = 3;
                }
                if(threeD.isChecked()){
                    answer_key[2] = 3;
                }
                if(fourD.isChecked()){
                    answer_key[3] = 3;
                }
                if(fiveD.isChecked()){
                    answer_key[4] = 3;
                }
                if(sixD.isChecked()){
                    answer_key[5] = 3;
                }
                if(sevenD.isChecked()){
                    answer_key[6] = 3;
                }
                if(eightD.isChecked()){
                    answer_key[7] = 3;
                }
                if(nineD.isChecked()){
                    answer_key[8] = 3;
                }
                if(tenD.isChecked()){
                    answer_key[9] = 3;
                }
                if(one_1A.isChecked()){
                    ansker_key1[0] = 0;
                }
                if(two_1A.isChecked()){
                    ansker_key1[1] = 0;
                }
                if(three_1A.isChecked()){
                    ansker_key1[2] = 0;
                }
                if(four_1A.isChecked()){
                    ansker_key1[3] = 0;
                }
                if(five_1A.isChecked()){
                    ansker_key1[4] = 0;
                }
                if(six_1A.isChecked()){
                    ansker_key1[5] = 0;
                }
                if(seven_1A.isChecked()){
                    ansker_key1[6] = 0;
                }
                if(eight_1A.isChecked()){
                    ansker_key1[7] = 0;
                }
                if(nine_1A.isChecked()){
                    ansker_key1[8] = 0;
                }
                if(twentyA.isChecked()){
                    ansker_key1[9] = 0;
                }
                if(one_1B.isChecked()){
                    ansker_key1[0] = 1;
                }
                if(two_1B.isChecked()){
                    ansker_key1[1] = 1;
                }
                if(three_1B.isChecked()){
                    ansker_key1[2] = 1;
                }
                if(four_1B.isChecked()){
                    ansker_key1[3] = 1;
                }
                if(five_1B.isChecked()){
                    ansker_key1[4] = 1;
                }
                if(six_1B.isChecked()){
                    ansker_key1[5] = 1;
                }
                if(seven_1B.isChecked()){
                    ansker_key1[6] = 1;
                }
                if(eight_1B.isChecked()){
                    ansker_key1[7] = 1;
                }
                if(nine_1B.isChecked()){
                    ansker_key1[8] = 1;
                }
                if(twentyB.isChecked()){
                    ansker_key1[9] = 1;
                }
                if(one_1C.isChecked()){
                    ansker_key1[0] = 2;
                }
                if(two_1C.isChecked()){
                    ansker_key1[1] = 2;
                }
                if(three_1C.isChecked()){
                    ansker_key1[2] = 2;
                }
                if(four_1C.isChecked()){
                    ansker_key1[3] = 2;
                }
                if(five_1C.isChecked()){
                    ansker_key1[4] = 2;
                }
                if(six_1C.isChecked()){
                    ansker_key1[5] = 2;
                }
                if(seven_1C.isChecked()){
                    ansker_key1[6] = 2;
                }
                if(eight_1C.isChecked()){
                    ansker_key1[7] = 2;
                }
                if(nine_1C.isChecked()){
                    ansker_key1[8] = 2;
                }
                if(twentyC.isChecked()){
                    ansker_key1[9] = 2;
                }
                if(one_1D.isChecked()){
                    ansker_key1[0] = 3;
                }
                if(two_1D.isChecked()){
                    ansker_key1[1] = 3;
                }
                if(three_1D.isChecked()){
                    ansker_key1[2] = 3;
                }
                if(four_1D.isChecked()){
                    ansker_key1[3] = 3;
                }
                if(five_1D.isChecked()){
                    ansker_key1[4] = 3;
                }
                if(six_1D.isChecked()){
                    ansker_key1[5] = 3;
                }
                if(seven_1D.isChecked()){
                    ansker_key1[6] = 3;
                }
                if(eight_1D.isChecked()){
                    ansker_key1[7] = 3;
                }
                if(nine_1D.isChecked()){
                    ansker_key1[8] = 3;
                }
                if(twentyD.isChecked()){
                    ansker_key1[9] = 3;
                }
                ////////
                if(one_2A.isChecked()){
                    ansker_key2[0] = 0;
                }
                if(two_2A.isChecked()){
                    ansker_key2[1] = 0;
                }
                if(three_2A.isChecked()){
                    ansker_key2[2] = 0;
                }
                if(four_2A.isChecked()){
                    ansker_key2[3] = 0;
                }
                if(five_2A.isChecked()){
                    ansker_key2[4] = 0;
                }
                if(six_2A.isChecked()){
                    ansker_key2[5] = 0;
                }
                if(seven_2A.isChecked()){
                    ansker_key2[6] = 0;
                }
                if(eight_2A.isChecked()){
                    ansker_key2[7] = 0;
                }
                if(nine_2A.isChecked()){
                    ansker_key2[8] = 0;
                }
                if(thirtyA.isChecked()){
                    ansker_key2[9] = 0;
                }
                if(one_2B.isChecked()){
                    ansker_key2[0] = 1;
                }
                if(two_2B.isChecked()){
                    ansker_key2[1] = 1;
                }
                if(three_2B.isChecked()){
                    ansker_key2[2] = 1;
                }
                if(four_2B.isChecked()){
                    ansker_key2[3] = 1;
                }
                if(five_2B.isChecked()){
                    ansker_key2[4] = 1;
                }
                if(six_2B.isChecked()){
                    ansker_key2[5] = 1;
                }
                if(seven_2B.isChecked()){
                    ansker_key2[6] = 1;
                }
                if(eight_2B.isChecked()){
                    ansker_key2[7] = 1;
                }
                if(nine_2B.isChecked()){
                    ansker_key2[8] = 1;
                }
                if(thirtyB.isChecked()){
                    ansker_key2[9] = 1;
                }
                if(one_2C.isChecked()){
                    ansker_key2[0] = 2;
                }
                if(two_2C.isChecked()){
                    ansker_key2[1] = 2;
                }
                if(three_2C.isChecked()){
                    ansker_key2[2] = 2;
                }
                if(four_2C.isChecked()){
                    ansker_key2[3] = 2;
                }
                if(five_2C.isChecked()){
                    ansker_key2[4] = 2;
                }
                if(six_2C.isChecked()){
                    ansker_key2[5] = 2;
                }
                if(seven_2C.isChecked()){
                    ansker_key2[6] = 2;
                }
                if(eight_2C.isChecked()){
                    ansker_key2[7] = 2;
                }
                if(nine_2C.isChecked()){
                    ansker_key2[8] = 2;
                }
                if(thirtyC.isChecked()){
                    ansker_key2[9] = 2;
                }
                if(one_2D.isChecked()){
                    ansker_key2[0] = 3;
                }
                if(two_2D.isChecked()){
                    ansker_key2[1] = 3;
                }
                if(three_2D.isChecked()){
                    ansker_key2[2] = 3;
                }
                if(four_2D.isChecked()){
                    ansker_key2[3] = 3;
                }
                if(five_2D.isChecked()){
                    ansker_key2[4] = 3;
                }
                if(six_2D.isChecked()){
                    ansker_key2[5] = 3;
                }
                if(seven_2D.isChecked()){
                    ansker_key2[6] = 3;
                }
                if(eight_2D.isChecked()){
                    ansker_key2[7] = 3;
                }
                if(nine_2D.isChecked()){
                    ansker_key2[8] = 3;
                }
                if(thirtyD.isChecked()){
                    ansker_key2[9] = 3;
                }
                ///////
                if(one_3A.isChecked()){
                    ansker_key3[0] = 0;
                }
                if(two_3A.isChecked()){
                    ansker_key3[1] = 0;
                }
                if(three_3A.isChecked()){
                    ansker_key3[2] = 0;
                }
                if(four_3A.isChecked()){
                    ansker_key3[3] = 0;
                }
                if(five_3A.isChecked()){
                    ansker_key3[4] = 0;
                }
                if(six_3A.isChecked()){
                    ansker_key3[5] = 0;
                }
                if(seven_3A.isChecked()){
                    ansker_key3[6] = 0;
                }
                if(eight_3A.isChecked()){
                    ansker_key3[7] = 0;
                }
                if(nine_3A.isChecked()){
                    ansker_key3[8] = 0;
                }
                if(fourtyA.isChecked()){
                    ansker_key3[9] = 0;
                }
                if(one_3B.isChecked()){
                    ansker_key3[0] = 1;
                }
                if(two_3B.isChecked()){
                    ansker_key3[1] = 1;
                }
                if(three_3B.isChecked()){
                    ansker_key3[2] = 1;
                }
                if(four_3B.isChecked()){
                    ansker_key3[3] = 1;
                }
                if(five_3B.isChecked()){
                    ansker_key3[4] = 1;
                }
                if(six_3B.isChecked()){
                    ansker_key3[5] = 1;
                }
                if(seven_3B.isChecked()){
                    ansker_key3[6] = 1;
                }
                if(eight_3B.isChecked()){
                    ansker_key3[7] = 1;
                }
                if(nine_3B.isChecked()){
                    ansker_key3[8] = 1;
                }
                if(fourtyB.isChecked()){
                    ansker_key3[9] = 1;
                }
                if(one_3C.isChecked()){
                    ansker_key3[0] = 2;
                }
                if(two_3C.isChecked()){
                    ansker_key3[1] = 2;
                }
                if(three_3C.isChecked()){
                    ansker_key3[2] = 2;
                }
                if(four_3C.isChecked()){
                    ansker_key3[3] = 2;
                }
                if(five_3C.isChecked()){
                    ansker_key3[4] = 2;
                }
                if(six_3C.isChecked()){
                    ansker_key3[5] = 2;
                }
                if(seven_3C.isChecked()){
                    ansker_key3[6] = 2;
                }
                if(eight_3C.isChecked()){
                    ansker_key3[7] = 2;
                }
                if(nine_3C.isChecked()){
                    ansker_key3[8] = 2;
                }
                if(fourtyC.isChecked()){
                    ansker_key3[9] = 2;
                }
                if(one_3D.isChecked()){
                    ansker_key3[0] = 3;
                }
                if(two_3D.isChecked()){
                    ansker_key3[1] = 3;
                }
                if(three_3D.isChecked()){
                    ansker_key3[2] = 3;
                }
                if(four_3D.isChecked()){
                    ansker_key3[3] = 3;
                }
                if(five_3D.isChecked()){
                    ansker_key3[4] = 3;
                }
                if(six_3D.isChecked()){
                    ansker_key3[5] = 3;
                }
                if(seven_3D.isChecked()){
                    ansker_key3[6] = 3;
                }
                if(eight_3D.isChecked()){
                    ansker_key3[7] = 3;
                }
                if(nine_3D.isChecked()){
                    ansker_key3[8] = 3;
                }
                if(fourtyD.isChecked()){
                    ansker_key3[9] = 3;
                }


                if(flaganswerkey_add == 1) {

                    Intent intent = new Intent(AnswerKey.this, AddActivity.class);
                    intent.putExtra("int", answer_key);
                    intent.putExtra("int_1", ansker_key1);
                    intent.putExtra("int_2", ansker_key2);
                    intent.putExtra("int_3", ansker_key3);
                    intent.putExtra("fullnamev1", fullnamev1);
                    intent.putExtra("mobilenumberv1", mobilenumberv1);
                    intent.putExtra("idnumberv1", idnumberv1);
                    intent.putExtra("flagreturnadd", 1);
                    startActivity(intent);

                }

                if(flaganswerkey_update == 1) {

                    Intent intent = new Intent(AnswerKey.this, UpdateActivity.class);
                    intent.putExtra("int", answer_key);
                    intent.putExtra("int_1", ansker_key1);
                    intent.putExtra("int_2", ansker_key2);
                    intent.putExtra("int_3", ansker_key3);
                    intent.putExtra("idv1", idv1);
                    intent.putExtra("fullnamev1", fullnamev1);
                    intent.putExtra("mobilenumberv1", mobilenumberv1);
                    intent.putExtra("idnumberv1", idnumberv1);
                    intent.putExtra("flagreturnupdate", 1);
                    startActivity(intent);

                }



            }
        });
    }

}