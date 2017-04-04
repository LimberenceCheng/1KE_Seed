package com.anthlu.a1keseed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anthl on 3/28/2017.
 */

public class ClassifiedFragment extends Fragment {

    private List<CourseItem> courseItemList = new ArrayList<>();

    public ClassifiedFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_classified, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.course_type_recycler_view);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        CourseItemAdapter adapter = new CourseItemAdapter(courseItemList);
        rv.setAdapter(adapter);

        Button frontendBtn=(Button) view.findViewById(R.id.course_frontend);
        frontendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initCourse();
            }
        });




        return view;
    }

    private void initCourse() {
        CourseItem htmlcss = new CourseItem("HTML/CSS", R.drawable.ic_htmlcss);
        courseItemList.add(htmlcss);
        CourseItem javascript = new CourseItem("JavaScript", R.drawable.ic_javascript);
        courseItemList.add(javascript);
        CourseItem css3 = new CourseItem("CSS3", R.drawable.ic_css3);
        courseItemList.add(css3);
        CourseItem html5 = new CourseItem("HTML5", R.drawable.ic_html5);
        courseItemList.add(html5);

    }
}
