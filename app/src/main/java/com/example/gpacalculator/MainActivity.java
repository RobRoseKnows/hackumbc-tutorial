package com.example.gpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView gpaTextView;
    ListView lectureListView;
    Button addClassButton;

    ArrayAdapter<String> lectureListAdapter;

    String[] exampleLecturesArray = {"Fencing", "Sailing", "Swiming", "Juggling"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: point to the correct views
        gpaTextView = null;
        lectureListView = null;
        addClassButton = null;

        ArrayList<String> exampleLecturesList  = (ArrayList<String>) Arrays.asList(exampleLecturesArray);

    }
}
