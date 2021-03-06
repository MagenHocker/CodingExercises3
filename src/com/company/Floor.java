package com.company;

/**
 * represents a floor with dimensions length and width
 */
public class Floor {

  private double width;
  private double length;

  public Floor(double w, double l) {
    if (w < 0) {
      this.width = 0;
    } else {
      this.width = w;
    }

    if (l < 0) {
      this.length = 0;
    } else {
      this.length = l;
    }

  }

  public double getArea() {
    return length * width;
  }

}
