public class Node {
    private float rating;
    private Node nextRating;


    public Node(float rating) {
        this.rating = rating;
        this.nextRating = null;
    }

    // getters and setters
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    public Node getNextRating() {
        return nextRating;
    }
    public void setNextRating(Node nextRating) {
        this.nextRating = nextRating;
    }
}
