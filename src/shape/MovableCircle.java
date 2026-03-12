package shape;


public class MovableCircle implements Movable, Shape{ 
  private MovablePoint center;
  private int radius;
  
  // TASK: Add the constructor here
  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
    center = new MovablePoint(x,y,xSpeed,ySpeed);
    this.radius = radius;
  }

  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();// move the center up
  }

  @Override
  public void moveDown() {
	 center.moveDown();// move the center up
  }

  @Override
  public void moveRight() {
	 center.moveRight();// move the center up
  }

  @Override
  public void moveLeft() {
	 center.moveLeft();// move the center up
  }

  @Override
  public double area(){
    return((radius * radius) * Math.PI);
  }

  @Override
  public double perimeter(){
    return((radius * 2) * Math.PI);
  }

  public String toString(){
		return String.format("MovableCircle[center=MovablePoint[%s], radius= %d]", center, radius);
	}

}
