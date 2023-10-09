package domain.model;

public class Circle extends Shape {

 public int getWidth() {
        return radius * 2;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws IllegalArgumentException {
        if (radius < 0)
            throw new IllegalArgumentException("Radius cannot be negative");
        this.radius = radius;
    }

    private int radius;

    @Override
    public int getArea() {
        return (int) (Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * getRadius());
    }

    public Circle(int newX, int newY, int newRadius) {
        super(newX, newY);
        setRadius(newRadius);
    }

    public Circle(int newRadius) {
        this(0, 0, newRadius);
    }

    public Circle(int newX, int newY) {
        super(newX, newY);
    }
}






  