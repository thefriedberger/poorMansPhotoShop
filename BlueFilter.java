import java.awt.Color;
/**
 * Write a description of class BlueFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueFilter extends Filter
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class BlueFilter
     */
    public BlueFilter(String name)
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
                int green = col.getGreen()/4;
                int blue = col.getBlue();
                image.setPixel(x, y, new Color(red, green, blue));
            }
        }
    }
}
