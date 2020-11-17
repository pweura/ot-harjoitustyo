
package studytracker;
import java.util.*;
public class Course {
    private String name;
    private double maxPoints;
    private double pointsSoFar;
    ArrayList<SubCredit> subs;
    
    public Course(String name, double maxPoints) {
        this.name = name;
        this.maxPoints = maxPoints;
        this.pointsSoFar = 0;
        this.subs = new ArrayList<>();
    }
    
    public Course(String name) {
        this(name,100);
    }

    public String getName() {
        return name;
    }

    public double getMaxPoints() {
        return maxPoints;
    }

    public double getPointsSoFar() {
        return pointsSoFar;
    }

    public void setPointsSoFar(double pointsSoFar) {
        this.pointsSoFar = pointsSoFar;
    }
    
    public void addSubCredit(SubCredit sub) {
        subs.add(sub);
    }
    
    @Override
    public String toString() {
        return subs.toString() + "/" + pointsSoFar + "/" + maxPoints;
    }
    
}
