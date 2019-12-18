import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame {

    private JFrame frame;
    private Canvas canvas;

    private String frame_title;
    private int frame_width, frame_height;

    public Frame(String frame_title, int frame_width, int frame_height){

        this.frame_title = frame_title;
        this.frame_width = frame_width;
        this.frame_height = frame_height;

        createFrame();

    }

    private void createFrame(){

        frame = new JFrame(frame_title);
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(frame_width, frame_height));
        canvas.setMaximumSize(new Dimension(frame_width, frame_height));
        canvas.setMinimumSize(new Dimension(frame_width, frame_height));
        canvas.setFocusable(false);

        frame.add(canvas);
        frame.pack();

    }

    public Canvas getCanvas(){

        return canvas;

    }

    public JFrame getFrame(){

        return frame;

    }

}