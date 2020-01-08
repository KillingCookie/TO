import java.awt.*;

public class Square implements Shape{

    private int size, x, y;
    private Color color;

    public Square(int size, int x, int y, Color color){

        this.size = size;
        this.x = x;
        this.y = y;
        this.color = color;

    }

    public void render(Graphics g) {

        g.setColor(color);
        g.fillRect(x, y,size, size);

    }

}
