package com.example.sqliteapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        DB = new DBHelper(this);
        TextView textView = findViewById(R.id.viewD);
        Cursor res = DB.getdata();
        StringBuffer buffer = new StringBuffer();
        while(res.moveToNext()){
            buffer.append("Name: "+res.getString(0)+"\n");
            buffer.append("Content: "+res.getString(1)+"\n");
            buffer.append("Date of Birth: "+res.getString(2)+"\n\n\n");
        }
        textView.setText(buffer);



    }
}