package com.example.gpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView gpaTextView;
    ListView classListView;
    Button addClassButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: point to the correct views
        gpaTextView = (TextView) findViewById(R.id.gpa_text);
        classListView = (ListView) findViewById(R.id.class_list);
        addClassButton = (Button) findViewById(R.id.create_button);
    }
}
