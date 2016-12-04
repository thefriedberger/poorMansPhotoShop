import java.awt.Color;
/**
 * Write a description of class RedFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedFilter extends Filter
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class RedFilter
     */
    public RedFilter(String name)
    {
        super(name);
    }
    
    public void apply(OFImage image){
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color col = image.getPixel(x, y);
                int red = col.getRed();
                int green = col.getGreen()/5;
                int blue = col.getBlue()/8;
                image.setPixel(x, y, new Color(red, green, blue));
            }
        }
    }
}
