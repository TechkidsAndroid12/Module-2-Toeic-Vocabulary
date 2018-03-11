package com.example.qklahpita.toeicvocab12.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.qklahpita.toeicvocab12.R;
import com.example.qklahpita.toeicvocab12.databases.models.TopicModel;

public class StudyActivity extends AppCompatActivity {
    private static final String TAG = "StudyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        TopicModel topicModel = (TopicModel) getIntent().getSerializableExtra("topic");
        Log.d(TAG, "onCreate: " + topicModel);
    }
}
