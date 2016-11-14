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
        gpaTextView = null;
        classListView = null;
        addClassButton = null;
    }
}
