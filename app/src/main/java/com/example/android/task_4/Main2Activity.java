package com.example.android.task_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView_age,textView_name;
    public final static String e_name="com.example.android.task_4.Main2Activity.e_name";
    public final static String e_age="com.example.android.task_4.Main2Activity.e_age";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView_age=(TextView)findViewById(R.id.tv_age);
        textView_name=(TextView)findViewById(R.id.tv_name);
        Intent intent=getIntent();
        int age_1=intent.getIntExtra("e_age",-1);
        String name=intent.getStringExtra("e_name");
        textView_name.setText("The user's name is "+name+"");
        textView_age.setText(Integer.toString(age_1));

    }
}
