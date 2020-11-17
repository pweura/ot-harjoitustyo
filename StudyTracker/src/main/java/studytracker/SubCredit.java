
package studytracker;
import java.util.*;
public class SubCredit {
    private double maxPoints;
    private double pointsSoFar;
    
    public SubCredit(double maxPoints, double pointsSoFar) {
        this.maxPoints = maxPoints;
        this.pointsSoFar = pointsSoFar;
    }
    
    public SubCredit(double maxPoints) {
        this(maxPoints,0.0);
    }

    public void setMaxPoints(double maxPoints) {
        this.maxPoints = maxPoints;
    }

    public void setPointsSoFar(double pointsSoFar) {
        this.pointsSoFar = pointsSoFar;
    }

    public double getMaxPoints() {
        return maxPoints;
    }

    public double getPointsSoFar() {
        return pointsSoFar;
    }
    
    @Override
    public String toString() {
        return pointsSoFar + "/" + maxPoints;
    }
    
}
