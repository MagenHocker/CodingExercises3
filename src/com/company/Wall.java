package com.company;

public class Wall {

  private String direction;

  public Wall(String direction) {
    this.direction = direction;
  }

  public String getDirection() {
    return direction;
  }

  //  private double width;
//  private double height;
//
//  public Wall() {
//    this(0, 0);
//  }
//
//  public Wall(double width, double height) {
//    if (width < 0) {
//      this.width = 0;
//    } else {
//      this.width = width;
//    }
//
//    if (height < 0) {
//      this.height = 0;
//    }
//    else {
//      this.height = height;
//    }
//
//  }
//
//  public double getHeight() {
//    return height;
//  }
//
//  public double getWidth() {
//    return width;
//  }
//
//  public void setWidth(double width) {
//    if (width >= 1) {
//      this.width = width;
//    } else {
//      this.width = 0;
//    }
//  }
//
//  public void setHeight(double height) {
//    if (height >= 1) {
//      this.height = height;
//    } else {
//      this.height = 0;
//    }
//  }
//
//  public double getArea() {
//    return this.height * this.width;
//  }
}
