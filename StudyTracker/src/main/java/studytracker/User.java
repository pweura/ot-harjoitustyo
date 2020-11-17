
package studytracker;

public class User {
    private String name;
    private Courses courses;
    
    public User(String name, String password) {
        this.name = name;
        this.courses = new Courses();
    }

    public String getName() {
        return name;
    }

    public Courses getCourses() {
        return courses;
    }
    
    
}
