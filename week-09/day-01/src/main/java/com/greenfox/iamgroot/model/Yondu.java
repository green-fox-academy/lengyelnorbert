package com.greenfox.iamgroot.model;


public class Yondu implements ResponseMessage {
  int distance;
  int time;
  int speed;



  public Yondu(int distance, int time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
