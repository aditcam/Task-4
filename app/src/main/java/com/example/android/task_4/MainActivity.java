package com.example.android.task_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText et1,et2;
    public final static String e_name="com.example.android.task_4.Main2Activity.e_name";
    public final static String e_age="com.example.android.task_4.Main2Activity.e_age";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button)findViewById(R.id.b1);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),Main2Activity.class);
                final String str =et1.getText().toString();
                final int age=Integer.parseInt(et2.getText().toString());
                intent.putExtra("e_name",str);
                intent.putExtra("e_age",age);
                startActivity(intent);

            }
        });

    }
}
