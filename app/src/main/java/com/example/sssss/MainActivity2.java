package com.example.sssss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String s1 = getIntent().getStringExtra("kemuName1");
        String s3 = getIntent().getStringExtra("kemuName2");
        String s4 = getIntent().getStringExtra("kemuName3");
        String s5 = getIntent().getStringExtra("kemuName4");
        String s2 = getIntent().getStringExtra("chengjiName1");
        String s6 = getIntent().getStringExtra("chengjiName2");
        String s7 = getIntent().getStringExtra("chengjiName3");
        String s8 = getIntent().getStringExtra("chengjiName4");
        String s9 = getIntent().getStringExtra("xuefenName1");
        String s10 = getIntent().getStringExtra("xuefenName2");
        String s11 =getIntent().getStringExtra("xuefenName3");
        String s12 = getIntent().getStringExtra("xuefenName4");



        int num1 = Integer.parseInt(s9);
        int num2 = Integer.parseInt(s10);
        int num3 = Integer.parseInt(s11);
        int num4 = Integer.parseInt(s12);
        int cj1 = Integer.parseInt(s2);
        int cj2 = Integer.parseInt(s6);
        int cj3 = Integer.parseInt(s7);
        int cj4 = Integer.parseInt(s8);







        final TextView textView=findViewById(R.id.Kkemu1);
        final TextView textView1=findViewById(R.id.Kchengji1);
        final TextView textView2=findViewById(R.id.Kkemu2);
        final TextView textView3=findViewById(R.id.Kkemu3);
        final TextView textView4=findViewById(R.id.Kkemu4);
        final TextView textView5=findViewById(R.id.Kchengji2);
        final TextView textView6=findViewById(R.id.Kchengji3);
        final TextView textView7=findViewById(R.id.Kchengji4);
        TextView textView8=findViewById(R.id.zongXueFen);
        final TextView textView9=findViewById(R.id.pingjunChengJi);
        TextView textView10=findViewById(R.id.jd1);
        TextView textView11=findViewById(R.id.jd2);
        TextView textView12=findViewById(R.id.jd3);
        TextView textView13=findViewById(R.id.jd4);
        TextView textView14=findViewById(R.id.zongJiDian);
        TextView textView15=findViewById(R.id.zHePingJi);
        final TextView textView16=findViewById(R.id.wenDingXing);
        TextView textView17=findViewById(R.id.kmDengJi1);
        TextView textView18=findViewById(R.id.kmDengJi2);
        TextView textView19=findViewById(R.id.kmDengJi3);
        TextView textView20=findViewById(R.id.kmDengJi4);


        Button buttontow=findViewById(R.id.qqq);



        if (90<=cj1&&100>=cj1){
            textView10.setText("4.0");
            textView17.setText("A");}
        else if(86<=cj1&&89>=cj1){
            textView10.setText("3.7");
            textView17.setText("A-");}
        else if(83<=cj1&&85>=cj1){
            textView10.setText("3.3");
            textView17.setText("B+");}
        else if(80<=cj1&&82>=cj1){
            textView10.setText("3.0");
                textView17.setText("B");}
        else if(76<=cj1&&79>=cj1){
            textView10.setText("2.7");
                textView17.setText("B-");}
        else if(73<=cj1&&75>=cj1){
            textView10.setText("2.3");
                textView17.setText("C+");}
        else if(70<=cj1&&72>=cj1){
            textView10.setText("2.0");
                textView17.setText("C");}
        else if(66<=cj1&&69>=cj1){
            textView10.setText("1.7");
                textView17.setText("C-");}
        else if(63<=cj1&&65>=cj1){
            textView10.setText("1.3");
                textView17.setText("D+");}
        else if(60<=cj1&&62>=cj1){
            textView10.setText("1.0");
                textView17.setText("D");}
        else{
            textView10.setText("0");
                textView17.setText("F");}

        if (90<=cj2&&100>=cj2){
            textView11.setText("4.0");
            textView18.setText("A");}
        else if(86<=cj2&&89>=cj2){
            textView11.setText("3.7");
            textView18.setText("A-");}
        else if(83<=cj2&&85>=cj2){
            textView11.setText("3.3");
            textView18.setText("B+");}
        else if(80<=cj2&&82>=cj2){
            textView11.setText("3.0");
            textView18.setText("B");}
        else if(76<=cj2&&79>=cj2){
            textView11.setText("2.7");
            textView18.setText("B-");}
        else if(73<=cj2&&75>=cj2){
            textView11.setText("2.3");
            textView18.setText("C+");}
        else if(70<=cj2&&72>=cj2){
            textView11.setText("2.0");
            textView18.setText("C");}
        else if(66<=cj2&&69>=cj2){
            textView11.setText("1.7");
            textView18.setText("C-");}
        else if(63<=cj2&&65>=cj2){
            textView11.setText("1.3");
            textView18.setText("D+");}
        else if(60<=cj2&&62>=cj2){
            textView11.setText("1.0");
            textView18.setText("D");}
        else{
            textView11.setText("0");
            textView18.setText("F");}


        if (90<=cj3&&100>=cj3){
            textView12.setText("4.0");
            textView19.setText("A");}
        else if(86<=cj3&&89>=cj3){
            textView12.setText("3.7");
            textView19.setText("A-");}
        else if(83<=cj3&&85>=cj3){
            textView12.setText("3.3");
            textView19.setText("B+");}
        else if(80<=cj3&&82>=cj3){
            textView12.setText("3.0");
            textView19.setText("B");}
        else if(76<=cj3&&79>=cj3){
            textView12.setText("2.7");
            textView19.setText("B-");}
        else if(73<=cj3&&75>=cj3){
            textView12.setText("2.3");
            textView19.setText("C+");}
        else if(70<=cj3&&72>=cj3){
            textView12.setText("2.0");
            textView19.setText("C");}
        else if(66<=cj3&&69>=cj3){
            textView12.setText("1.7");
            textView19.setText("C-");}
        else if(63<=cj3&&65>=cj3){
            textView12.setText("1.3");
            textView19.setText("D+");}
        else if(60<=cj3&&62>=cj3){
            textView12.setText("1.0");
            textView19.setText("D");}
        else{
            textView12.setText("0");
            textView19.setText("F");}





        if (90<=cj4&&100>=cj4){
            textView13.setText("4.0");
            textView20.setText("A");}
        else if(86<=cj4&&89>=cj4){
            textView13.setText("3.7");
            textView20.setText("A-");}
        else if(83<=cj4&&85>=cj4){
            textView13.setText("3.3");
            textView20.setText("B+");}
        else if(80<=cj4&&82>=cj4){
            textView13.setText("3.0");
            textView20.setText("B");}
        else if(76<=cj4&&79>=cj4){
            textView13.setText("2.7");
            textView20.setText("B-");}
        else if(73<=cj4&&75>=cj4){
            textView13.setText("2.3");
            textView20.setText("C+");}
        else if(70<=cj4&&72>=cj4){
            textView13.setText("2.0");
            textView20.setText("C");}
        else if(66<=cj4&&69>=cj4){
            textView13.setText("1.7");
            textView20.setText("C-");}
        else if(63<=cj4&&65>=cj4){
            textView13.setText("1.3");
            textView20.setText("D+");}
        else if(60<=cj4&&62>=cj4){
            textView13.setText("1.0");
            textView20.setText("D");}
        else{
            textView13.setText("0");
            textView20.setText("F");}

        Double JD1=Double.parseDouble(textView10.getText().toString());
        Double JD2=Double.parseDouble(textView11.getText().toString());
        Double JD3=Double.parseDouble(textView12.getText().toString());
        Double JD4=Double.parseDouble(textView13.getText().toString());






        textView.setText(s1);
        textView1.setText(s2);
        textView2.setText(s3);
        textView3.setText(s4);
        textView4.setText(s5);
        textView5.setText(s6);
        textView6.setText(s7);
        textView7.setText(s8);
        textView8.setText((num1+num2+num3+num4)+"");
        int zXueFen=Integer.parseInt(textView8.getText().toString());
        textView9.setText(((cj1*num1+cj2*num2+cj3*num3+cj4*num4)/zXueFen)+"");
        double zJiDian1=((JD1*num1+JD2*num2+JD3*num3+JD4*num4)/zXueFen);
        String zJiDian2=String.format("%.2f",zJiDian1);
        textView14.setText(zJiDian2);




        int PJCJ=Integer.parseInt(textView9.getText().toString());

        if (90<=PJCJ&&100>=PJCJ)
            textView15.setText("A");
        else if(86<=PJCJ&&89>=PJCJ)
            textView15.setText("A-");
        else if(83<=PJCJ&&85>=PJCJ)
            textView15.setText("B+");
        else if(80<=PJCJ&&82>=PJCJ)
            textView15.setText("B");
        else if(76<=PJCJ&&79>=PJCJ)
            textView15.setText("B-");
        else if(73<=PJCJ&&75>=PJCJ)
            textView15.setText("C+");
        else if(70<=PJCJ&&72>=PJCJ)
            textView15.setText("C");
        else if(66<=PJCJ&&69>=PJCJ)
            textView15.setText("C-");
        else if(63<=PJCJ&&65>=PJCJ)
            textView15.setText("D+");
        else if(60<=PJCJ&&62>=PJCJ)
            textView15.setText("D");
        else
            textView15.setText("F");


        double FangCha=((((cj1-PJCJ)*(cj1-PJCJ))+((cj2-PJCJ)*(cj2-PJCJ))+((cj3-PJCJ)*(cj3-PJCJ))+((cj4-PJCJ)*(cj4-PJCJ)))/4);
        if(0<=FangCha&&0.99>=FangCha)
            textView16.setText("优秀");
        else if(1<=FangCha&&3.99>=FangCha)
            textView16.setText("良好");
        else if(4<=FangCha&&9.99>=FangCha)
            textView16.setText("较差");
        else
            textView16.setText("差");







        buttontow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("chengji",textView9.getText().toString());
                intent.putExtra("FCha",textView16.getText().toString());
                intent.putExtra("chengji1",textView1.getText().toString());
                intent.putExtra("kemu1", textView.getText().toString());
                intent.putExtra("kemu2", textView2.getText().toString());
                intent.putExtra("kemu3", textView3.getText().toString());
                intent.putExtra("kemu4",textView4.getText().toString());
                intent.putExtra("chengji2", textView5.getText().toString());
                intent.putExtra("chengji3", textView6.getText().toString());
                intent.putExtra("chengji4", textView7.getText().toString());

                startActivity(intent);
            }



            });

        Button buttonx=findViewById(R.id.backx1);
        buttonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });






    }
}