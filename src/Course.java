public class Course {
    private String courseName;
    private int credit;
    private String courseCode;

    public Course(String courseName, int credit, String courseCode) {
        this.courseName = courseName;
        this.credit = credit;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}

