package com.company;

public class Point {

  private int x;
  private int y;

  public Point() {
    this(0, 0);
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double distance() {
    return Math.sqrt((this.x * this.x) + (this.y * this.y));
  }

  public double distance(int otherX, int otherY) {
    return Math.sqrt(Math.pow(otherX - this.x, 2) + Math.pow(otherY - this.y, 2));
  }

  public double distance(Point point) {
    return Math.sqrt(Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2));
  }

}
