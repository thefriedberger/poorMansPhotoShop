import java.awt.Color;
/**
 * Write a description of class ColorFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenFilter extends Filter
{
    /**
     * Constructor for objects of class ColorFilter
     */
    public GreenFilter(String name)
    {
        super(name);
    }
    
    public void apply(OFImage image){
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color col = image.getPixel(x, y);
                int red = col.getRed()/7;
                int green = col.getGreen();
                int blue = col.getBlue()/8;
                image.setPixel(x, y, new Color(red, green, blue));
            }
        }
    }
}
