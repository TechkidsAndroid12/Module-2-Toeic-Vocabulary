package com.example.qklahpita.toeicvocab12.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import com.example.qklahpita.toeicvocab12.databases.models.CategoryModel;
import com.example.qklahpita.toeicvocab12.databases.models.TopicModel;

import java.util.HashMap;
import java.util.List;

/**
 * Created by qklahpita on 3/4/18.
 */

public class ToeicExpandableListViewAdapter extends BaseExpandableListAdapter {

    List<CategoryModel> categoryModelList;
    HashMap<String, List<TopicModel>> topicModelHashMap;

    public ToeicExpandableListViewAdapter(List<CategoryModel> categoryModelList, HashMap<String, List<TopicModel>> topicModelHashMap) {
        this.categoryModelList = categoryModelList;
        this.topicModelHashMap = topicModelHashMap;
    }

    @Override
    public int getGroupCount() {
        return 0;
    }

    @Override
    public int getChildrenCount(int i) {
        return 0;
    }

    @Override
    public Object getGroup(int i) {
        return null;
    }

    @Override
    public Object getChild(int i, int i1) {
        return null;
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
