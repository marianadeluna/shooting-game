

import processing.core.PApplet;


class Creature {
  float width = 50;
  float height = 50;
  
  float red;
  float green;
  float blue;
  
  float xPos;
  float yPos;
  
  
  Creature(float x, float y, float w, float h, float r, float g, float b) {
    xPos = x;
    yPos = y;
    width = w;
    height = h;
    red = r;
    green = g;
    blue = b;
  } // end constuctor
  
  void display(PApplet mainProcessing) {
    mainProcessing.fill(red, green, blue);
    mainProcessing.ellipse(xPos, yPos, width, height);
    mainProcessing.ellipse(xPos - 10, yPos, width/4, height/4);
    mainProcessing.ellipse(xPos + 10, yPos, width/4, height/4);
    mainProcessing.line(xPos -5, yPos + 15, xPos + 5, yPos + 15);

  } // end display

  
  void setXPos(float newValue) {
    xPos = newValue;
  } //end setXPos
  
  void setYPos(float newValue) {
    yPos = newValue;
  } //end setYPos
  
  void setWidth(float newValue) {
    width = newValue;
  } //end setWidth  
  
  void setHeight(float newValue) {
    height = newValue;
  } //end setHeight  
  
  void setRed(float newValue) {
    red = newValue;
  } //end setRed
  
  void setGreen(float newValue) {
    green = newValue;
  } //end setGreen
  
  void setBlue(float newValue) {
    blue = newValue;
  } //end setBlue












} // end class