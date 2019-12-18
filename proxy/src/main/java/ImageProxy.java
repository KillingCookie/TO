import java.awt.*;

public class ImageProxy implements Image{

    private RealImage realimg;
    private String path;


    public void render(Graphics g) {

        if(realimg == null) {

            realimg = new RealImage(path);

        }realimg.render(g);

    }

    public ImageProxy(String path){

        this.path = path;

    }

    public RealImage getRealImage(){

        return realimg;

    }

}
