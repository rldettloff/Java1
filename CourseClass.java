class Course {
    private String courseNumber;
    private String courseTitle;
    
    void setCourseNumber(String inputCourseNumber) {
        courseNumber = inputCourseNumber;

    }
    String getCourseNumber() {
        return courseNumber;
    }
    void printCourseInfo(){
        System.out.println("course number:" + courseNumber);
        System.out.println("course number" + courseTitle );
    }
    void setCourseTitle(String inputCourseTitle) {
        courseTitle = inputCourseTitle;

    }
}
class OfferedCourse extends Course {
    private String instructorName;
    private String location;
    private String classTime;

    public void setInstructorName(String name) {
        instructorName = name;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public String getLocation() {
        return location;
    }

    public void setClassTime(String time) {
        classTime = time;
    }

    public String getClassTime() {
        return classTime;
    }

    public void printCourseInfo() {
        super.printCourseInfo();
        System.out.println("course number:" + courseNumber);
        System.out.println("course number" + courseTitle );
        System.out.println("Instructor's Name: " + instructorName);
        System.out.println("Location: " + location);
        System.out.println("Class Time: " + classTime);
    }
}

