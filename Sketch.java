import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(207, 159, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
  // Creating a House

  // Main House Body
  fill(255, 182, 193);
  rect(120, 250, 200, 200);

  // Door
  fill(255, 255, 255);
  rect(195, 350, 50, 100);
  
  // Simple Roof
  fill(176, 215, 230);
  triangle(120, 250, 225, 50, 320, 250);

  // Window
  fill(255, 255, 255);
  ellipse(220, 300, 50, 50);

  // Flashy Moon
  fill(255, 255, 237);
  circle(450, 25, 300);

  }
}