package JavaRashTwoLesson;

public class Circle {
    int centerX;
    int centerY;
    int radius;
    int width;
    String color;

    public void initialize(int centerX,int centerY,int radius){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }
    public void initialize(int centerX,int centerY,int radius,int width){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
    }
    public void initialize(int centerX,int centerY,int radius,int width,String color){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=color;
    }
}
