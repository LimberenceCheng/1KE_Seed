package com.anthlu.a1keseed;

/**
 * Created by anthl on 3/29/2017.
 */

public class CourseItem {

    private String courseItemName;

    private int courseItemImageId;

    public CourseItem(String courseItemName, int courseItemImageId) {
        this.courseItemName = courseItemName;
        this.courseItemImageId = courseItemImageId;
    }

    public String getCourseItemName() {
        return courseItemName;
    }

    public int getCourseItemImageId() {
        return courseItemImageId;
    }
}
