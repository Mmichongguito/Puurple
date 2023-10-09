package domain.model;

    public abstract class Elipse extends Circle{
        private int secondRadius;

    public int getsecondRadius(){
        return secondRadius;
    }

    public void setsecondRadius(int newRadius2){
        if(newRadius2>=0){
            secondRadius=newRadius2;
        }
    }
    
    @Override
    public int getArea(){
        return (int)(Math.PI*getRadius() *getsecondRadius());
    }

    @Override
    public int getPerimeter(){
        return (int)(2*Math.PI*Math.sqrt((Math.pow(getRadius(), 2) + Math.pow(getsecondRadius(), 2))/2)) ;
    }

    public Elipse(int newX, int newY, int newRadius, int newRadius2){
        super(newX, newY, newRadius); //El super sirve para llamar a la clase padre
        setsecondRadius(newRadius2);
    }

    public Elipse(int newRadius2){
        this (0,0,0, newRadius2);
    }

    public Elipse(int newX, int newY) {
        super(newX, newY);
     
    }
    
}