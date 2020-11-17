package studytracker;
import java.util.*;
public class Courses {
    private ArrayList<Course> courses;
    
    public Courses() {
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(String name, double max) {
        courses.add(new Course(name,max));
    }
    
    public void addCourse(String name) {
        addCourse(name,100);
    }
    
    public void addCourse() {
        addCourse("",100);
    }
    
}
