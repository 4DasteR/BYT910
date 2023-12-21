package org.example;

public class MoveEvent extends Event {

    private int endX;
    private int endY;
    private double velocity;

    public MoveEvent(String name, int endX, int endY, double velocity) {
        super(name);
        this.endX = endX;
        this.endY = endY;
        this.velocity = velocity;
    }


    private void move(int startX, int startY) {
        //TODO
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
}
