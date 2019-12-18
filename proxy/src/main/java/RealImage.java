import java.awt.*;
import java.awt.image.BufferedImage;

public class RealImage implements Image{

    private BufferedImage img;

    public RealImage(String path){

        img = TextureLoader.LoadImg(path);

    }

    public void render(Graphics g) {

        g.drawImage(img, 0, 0, null);

    }

}
