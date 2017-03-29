package com.anthlu.a1keseed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anthl on 3/28/2017.
 */

public class RecommendFragment extends Fragment {

    private List<Course> courseList = new ArrayList<>();


    public RecommendFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initCourses();
    }

    private void initCourses() {
        Course hello = new Course("Hello world", 10, "HTML", 30, 20, "Anthony", 26, "CTO");
        courseList.add(hello);
        Course hello2=new Course("Hello world 2", 10, "HTML 2", 30, 20, "Anthony2", 26, "CTO2");
        courseList.add(hello2);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        //rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        RecommendAdapter adapter = new RecommendAdapter(courseList);
        rv.setAdapter(adapter);

        return rootView;
    }
}
