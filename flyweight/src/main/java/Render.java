import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class Render {

    private Frame frame;

    private BufferStrategy BufStr;
    private Graphics g;

    private int frame_width, frame_height;
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public Render(String frame_title, int frame_width, int frame_height){

        this.frame_width = frame_width;
        this.frame_height = frame_height;

        frame = new Frame(frame_title, frame_width, frame_height);

        ShapeFactory sf = new ShapeFactory();


        shapes.add(sf.createShape(25, 100, 200, Color.RED, "circle"));
        shapes.add(sf.createShape(100, 50, 100, Color.BLUE, "circle"));
        shapes.add(sf.createShape(30, 500, 150, Color.YELLOW, "square"));
        shapes.add(sf.createShape(11, 100, 500, Color.RED, "circle"));
        shapes.add(sf.createShape(37, 440, 380, Color.CYAN, "square"));

    }

    public void run(){

        while(true){

            render();

            try{

                Thread.sleep(99);

            } catch(InterruptedException ex) {

                Thread.currentThread().interrupt();

            }

        }

    }

    public void render(){

        BufStr = frame.getCanvas().getBufferStrategy();
        if(BufStr == null){
            frame.getCanvas().createBufferStrategy(3);
            return;
        }

        g = BufStr.getDrawGraphics();

        g.clearRect(0, 0, frame_width, frame_height); //clear screen
        //

        for(Shape s : shapes)
            s.render(g);

        //
        BufStr.show();
        g.dispose();

    }

}
