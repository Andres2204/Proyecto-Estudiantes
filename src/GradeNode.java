public class GradeNode {
    private float gradesRating;
    private GradeNode nextGradeNode;


    // constructor
    public GradeNode(float gradesRating) {
        this.gradesRating = gradesRating;
        this.nextGradeNode = null;
    }
    // getters and setters
    public float getGradesRating() {
        return gradesRating;
    }
    public void setGradesRating(float gradesRating) {
        this.gradesRating = gradesRating;
    }
    public GradeNode getNextGradeNode() {
        return nextGradeNode;
    }
    public void setNextGradeNode(GradeNode nextGradeNode) {
        this.nextGradeNode = nextGradeNode;
    }
}
