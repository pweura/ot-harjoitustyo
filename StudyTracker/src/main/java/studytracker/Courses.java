package studytracker;
import java.util.*;
public class Courses {
    private ArrayList<Course> courses;
    
    public Courses() {
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    
}
