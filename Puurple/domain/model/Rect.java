package domain.model;

public class Rect extends Square{
    private int Height=0;
   @Override 
    public int getHeight() {
        return Height;
    }
    public void setHeight(int newHeight) {
        if (newHeight >=0) {
            Height=newHeight;
        }
    }
    public Rect (int newX, int newY, int newWidth, int newHeight) {
        super(newX, newY, newWidth);
        setHeight(newHeight);
    }
    public Rect (int newWidth, int newHeight) {
        this (0, 0, newWidth, newHeight);
    } 

}
