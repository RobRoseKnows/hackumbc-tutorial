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
        gpaTextView = (TextView) findViewById(R.id.gpa_text);
        lectureListView = (ListView) findViewById(R.id.lecture_list);
        addClassButton = (Button) findViewById(R.id.create_button);

        ArrayList<String> exampleLecturesList  = (ArrayList<String>) Arrays.asList(exampleLecturesArray);
    }
}
