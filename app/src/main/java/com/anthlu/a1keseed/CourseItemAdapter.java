package com.anthlu.a1keseed;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by anthl on 3/30/2017.
 */

public class CourseItemAdapter extends RecyclerView.Adapter<CourseItemAdapter.ViewHolder> {

    private List<CourseItem> mCourseItem;

    static class ViewHolder extends RecyclerView.ViewHolder {
        View courseItemView;
        ImageView courseItemImage;
        TextView courseItemName;

        public ViewHolder(View view) {
            super(view);
            courseItemView = view;
            courseItemImage = (ImageView) view.findViewById(R.id.course_item_image);
            courseItemName = (TextView) view.findViewById(R.id.course_item_name);
        }
    }

    public CourseItemAdapter(List<CourseItem> courseItemList) {
        mCourseItem = courseItemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.courseItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                CourseItem courseItem = mCourseItem.get(position);
                Toast.makeText(v.getContext(), "you clicked view" + courseItem.getCourseItemName(), Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CourseItem courseItem = mCourseItem.get(position);
        holder.courseItemImage.setImageResource(courseItem.getCourseItemImageId());
        holder.courseItemName.setText(courseItem.getCourseItemName());
    }

    @Override
    public int getItemCount() {
        return mCourseItem.size();
    }
}
