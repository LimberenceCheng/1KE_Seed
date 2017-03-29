package com.anthlu.a1keseed;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by anthl on 3/28/2017.
 */

public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.ViewHolder> {
    private List<Course> mCourseCard;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public CardView mCardView;
        public TextView mTextViewCourseName;
        public TextView mTextViewViewCount;
        public TextView mTextViewFavoriteCount;
        public TextView mTextViewCourseTag;
        public TextView mTextViewCourseTeacherName;
        public TextView mTextViewCourseTeacherTag;

        public ViewHolder(View v) {
            super(v);

            mCardView = (CardView) v.findViewById(R.id.course_card_view);
            mTextViewCourseName = (TextView) v.findViewById(R.id.course_name);
            mTextViewViewCount = (TextView) v.findViewById(R.id.course_view_count);
            mTextViewFavoriteCount = (TextView) v.findViewById(R.id.course_favorite_count);
            mTextViewCourseTag = (TextView) v.findViewById(R.id.course_tag);
            mTextViewCourseTeacherName = (TextView) v.findViewById(R.id.course_teacher_name);
            mTextViewCourseTeacherTag = (TextView) v.findViewById(R.id.course_teacher_tag);
        }
    }

    public RecommendAdapter(List<Course> courseCard) {
        mCourseCard = courseCard;
    }

    public RecommendAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_card_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Course course = mCourseCard.get(position);
        holder.mTextViewCourseName.setText(course.getCourseName());
        holder.mTextViewViewCount.setText(Integer.toString(course.getViewCount()));
        holder.mTextViewFavoriteCount.setText(Integer.toString(course.getFavotiteCount()));
        holder.mTextViewCourseTag.setText(course.getCourseTag());
        holder.mTextViewCourseTeacherName.setText(course.getTeacherName());
        holder.mTextViewCourseTeacherTag.setText(course.getTeacherTag());

    }

    @Override
    public int getItemCount() {
        return mCourseCard.size();
    }
}
