public class Road {

    private String from;
    private String to;
    private float distance;

    private boolean arrived = false;

    public Road(String from, String to, float distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public Road() {
        this.from = "";
        this.to = "";
        this.distance = 0;
    }

    @Override
    public String toString() {
        return "Road { " + "\n" +
                " from: " + from + "\n" +
                " to: " + to + "\n" +
                " distance: " + distance + "\n" +
                " arrived: " + arrived + "\n" +
                " }";

    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean getArrived() {
        return arrived;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }
}
