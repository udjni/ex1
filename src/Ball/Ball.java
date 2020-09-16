package Ball;
import java.lang.*;
public class Ball {
    private String color;
    private double radius;
    public Ball(String c,double r){
      color=c;
        radius=r;
    }
    public Ball(String c){
        color=c;
        radius=0;
    }
    public Ball(){
       color="blue";
       radius=0;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(double radius){
        return radius;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        return this.color+",radius is "+this.radius;
    }
    public void result(){
        System.out.println(color+",radius is "+radius);
    }
}
