package com.example.sssss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText=findViewById(R.id.kkm1);
        final EditText editText1=findViewById(R.id.kchengji1);
        final EditText editText2=findViewById(R.id.kchengji2);
        final EditText editText3=findViewById(R.id.kchengji3);
        final EditText editText4=findViewById(R.id.kchengji4);
        final EditText editText5=findViewById(R.id.kkemu2);
        final EditText editText6=findViewById(R.id.kkemu3);
        final EditText editText7=findViewById(R.id.kkemu4);
        final EditText editText8=findViewById(R.id.kxuefen1);
        final EditText editText9=findViewById(R.id.kxuefen2);
        final EditText editText10=findViewById(R.id.kxuefen3);
        final EditText editText11=findViewById(R.id.kxuefen4);



        Button button1=findViewById(R.id.qqq);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if (editText1.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if (editText2.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if(editText3.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if(editText4.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if (editText5.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if(editText6.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if (editText7.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if (editText8.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if (editText9.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if (editText10.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else if(editText11.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "有空输入！\n请重新输入！", Toast.LENGTH_SHORT).show();}
                else {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("chengjiName1", editText1.getText().toString());
                    intent.putExtra("kemuName1", editText.getText().toString());
                    intent.putExtra("kemuName2", editText5.getText().toString());
                    intent.putExtra("kemuName3", editText6.getText().toString());
                    intent.putExtra("kemuName4", editText7.getText().toString());
                    intent.putExtra("chengjiName2", editText2.getText().toString());
                    intent.putExtra("chengjiName3", editText3.getText().toString());
                    intent.putExtra("chengjiName4", editText4.getText().toString());
                    intent.putExtra("xuefenName1", editText8.getText().toString());
                    intent.putExtra("xuefenName2", editText9.getText().toString());
                    intent.putExtra("xuefenName3", editText10.getText().toString());
                    intent.putExtra("xuefenName4", editText11.getText().toString());
                    startActivity(intent);

                }








            }
        });


    }

}

