package com.anthlu.a1keseed;

/**
 * Created by anthl on 3/26/2017.
 */

public class Course {

    private String courseName;

    private int courseId;

    private String courseTag;

    private int viewCount;

    private int favotiteCount;

    private String teacherName;

    private int teacherId;

    private String teacherTag;

    public Course(String courseName, int courseId, String courseTag, int viewCount,
                  int favotiteCount, String teacherName, int teacherId, String teacherTag) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseTag = courseTag;
        this.viewCount = viewCount;
        this.favotiteCount = favotiteCount;
        this.teacherName = teacherName;
        this.teacherId = teacherId;
        this.teacherTag = teacherTag;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseTag() {
        return courseTag;
    }

    public int getViewCount() {
        return viewCount;
    }

    public int getFavotiteCount() {
        return favotiteCount;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherTag() {
        return teacherTag;
    }
}
