package com.example.sssss;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String BQ=getIntent().getStringExtra("chengji");
        int Bq;
        Bq=Integer.parseInt(BQ);
        String fcha=getIntent().getStringExtra("FCha");


        String s1=(getResources().getString(R.string.优秀));
        String s2=(getResources().getString(R.string.良好));
        String s3=(getResources().getString(R.string.一般));
        String s4=(getResources().getString(R.string.较差));
        String s5=(getResources().getString(R.string.差));
        String s6=(getResources().getString(R.string.稳定性yx));
        String s7=(getResources().getString(R.string.稳定性良好));
        String s8=(getResources().getString(R.string.稳定性较差));
        String s9=(getResources().getString(R.string.稳定性差));
        String s10 = getIntent().getStringExtra("kemu1");
        String s11 = getIntent().getStringExtra("kemu2");
        String s12 = getIntent().getStringExtra("kemu3");
        String s13 = getIntent().getStringExtra("kemu4");
        String s14=(getResources().getString(R.string.成绩优异));
        String s15=(getResources().getString(R.string.成绩一般));
        String s16=(getResources().getString(R.string.成绩较差));
        String s17=(getResources().getString(R.string.挂科));
        String s18=(getResources().getString(R.string.还不错));
        String s21 = getIntent().getStringExtra("chengji1");
        String s22= getIntent().getStringExtra("chengji2");
        String s23= getIntent().getStringExtra("chengji3");
        String s24= getIntent().getStringExtra("chengji4");

        int cj11 = Integer.parseInt(s21);
        int cj22 = Integer.parseInt(s22);
        int cj33 = Integer.parseInt(s23);
        int cj44 = Integer.parseInt(s24);

        Button button8=findViewById(R.id.backx3);
        ImageView imageView1=findViewById(R.id.BiaoQing);
        TextView textView1=findViewById(R.id.zPingYu);
        TextView textView2=findViewById(R.id.wdxFenXi);
        TextView textView3=findViewById(R.id.two2);
        TextView textView4=findViewById(R.id.three1);
        TextView textView5=findViewById(R.id.three2);
        TextView textView6=findViewById(R.id.four1);
        TextView textView7=findViewById(R.id.four2);
        TextView textView8=findViewById(R.id.two1);
        TextView textView9=findViewById(R.id.five1);
        TextView textView10=findViewById(R.id.five2);


        textView8.setText(s10);
        textView4.setText(s11);
        textView6.setText(s12);
        textView9.setText(s13);


        if(cj11>=90)
            textView3.setText(s14);
        else if(cj11>=80&&cj11<90)
            textView3.setText(s18);
        else if(cj11>=67&&cj11<80)
            textView3.setText(s15);
        else if(cj11>=60&&cj11<67)
            textView3.setText(s16);
        else
            textView3.setText(s17);


        if(cj22>=90)
            textView5.setText(s14);
        else if(cj22>=80&&cj22<90)
            textView5.setText(s18);
        else if(cj22>=67&&cj22<80)
            textView5.setText(s15);
        else if(cj22>=60&&cj22<67)
            textView5.setText(s16);
        else
            textView5.setText(s17);




        if(cj33>=90)
            textView7.setText(s14);
        else if(cj33>=80&&cj33<90)
            textView7.setText(s18);
        else if(cj33>=67&&cj33<80)
            textView7.setText(s15);
        else if(cj33>=60&&cj33<67)
            textView7.setText(s16);
        else
            textView7.setText(s17);



        if(cj44>=90)
            textView10.setText(s14);
        else if(cj44>=80&&cj44<90)
            textView10.setText(s18);
        else if(cj44>=67&&cj44<80)
            textView10.setText(s15);
        else if(cj44>=60&&cj44<67)
            textView10.setText(s16);
        else
            textView10.setText(s17);





        if (Bq>=90){
        imageView1.getDrawable().setLevel(1);
            textView1.setText(s1);
        }
        else if(Bq>=85&&Bq<90){
        imageView1.getDrawable().setLevel(1) ;
        textView1.setText(s2);
        }
        else if(Bq>=75&&Bq<85){
            imageView1.getDrawable().setLevel(2);
            textView1.setText(s3);
        }
        else if(Bq>=60&&Bq<75){
            imageView1.getDrawable().setLevel(0);
            textView1.setText(s4);
        }
        else if(Bq<60){
            imageView1.getDrawable().setLevel(0);
            textView1.setText(s5);
        }



        if (fcha=="优秀")
            textView2.setText(s6);
        else if(fcha=="良好")
            textView2.setText(s7);
        else if(fcha=="较差")
            textView2.setText(s8);
        else
            textView2.setText(s9);








        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        }
    }
