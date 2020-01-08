import java.awt.*;

public class Circle implements Shape{

    private int r, x, y;
    private Color color;

    public Circle(int r, int x, int y, Color color){

        this.r = r;
        this.x = x;
        this.y = y;
        this.color = color;

    }

    public void render(Graphics g) {

        g.setColor(color);
        g.fillOval(x, y, 2*r, 2*r);

    }

}
