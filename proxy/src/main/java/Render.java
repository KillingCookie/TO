import java.awt.*;
import java.awt.image.BufferStrategy;

public class Render {

    private Frame frame;

    private BufferStrategy BufStr;
    private Graphics g;

    private int frame_width, frame_height;

    public Render(String frame_title, int frame_width, int frame_height){

        this.frame_width = frame_width;
        this.frame_height = frame_height;

        frame = new Frame(frame_title, frame_width, frame_height);

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

    public void render(Image img){

        BufStr = frame.getCanvas().getBufferStrategy();
        if(BufStr == null){
            frame.getCanvas().createBufferStrategy(3);
            return;
        }

        g = BufStr.getDrawGraphics();

        g.clearRect(0, 0, frame_width, frame_height); //clear screen
        //

            img.render(g);

        //
        BufStr.show();
        g.dispose();

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

        ImageProxy img = new ImageProxy("to.png");
        img.render(g);

        //
        BufStr.show();
        g.dispose();

    }

}
