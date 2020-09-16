package Ball;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1=new Ball("Blue",0.1);
        Ball b2=new Ball("Red");
        b2.setRadius(0.05);
        b1.result();
        b2.result();
    }
}
