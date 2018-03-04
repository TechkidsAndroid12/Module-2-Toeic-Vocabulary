package com.example.qklahpita.toeicvocab12.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.example.qklahpita.toeicvocab12.R;
import com.example.qklahpita.toeicvocab12.adapters.ToeicExpandableListViewAdapter;
import com.example.qklahpita.toeicvocab12.databases.DatabaseManager;
import com.example.qklahpita.toeicvocab12.databases.models.CategoryModel;
import com.example.qklahpita.toeicvocab12.databases.models.TopicModel;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView elvToeic;
    ToeicExpandableListViewAdapter toeicExpandableListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elvToeic = findViewById(R.id.elv_toeic);

        List<TopicModel> topicModelList = DatabaseManager.getInstance(this).getListTopic();
        List<CategoryModel> categoryModelList = DatabaseManager.getInstance(this)
                .getListCategory(topicModelList);
        HashMap<String, List<TopicModel>> hashMap = DatabaseManager.getInstance(this).getHashMapTopic(
                topicModelList, categoryModelList);

        toeicExpandableListViewAdapter = new ToeicExpandableListViewAdapter(categoryModelList, hashMap);

        elvToeic.setAdapter(toeicExpandableListViewAdapter);
    }
}
