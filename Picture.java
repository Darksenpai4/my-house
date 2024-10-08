/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square floor1;

	/**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void amanecer()
    {
        moon.makeInvisible();
        sun.slowMoveVertical(-250);
        
        peep1 = new Person();
        peep1.makeVisible();
        peep1.moveHorizontal(-300);
        peep1.moveVertical(50);
                
        peep2 = new Person();
        peep2.makeVisible();
        peep2.moveHorizontal(300);
        peep2.moveVertical(50);
        
        peep1.slowMoveHorizontal(200);
        peep2.slowMoveHorizontal(-300);
    }

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();

	moon = new Circle();
        moon.makeVisible();
        moon.changeColor("magenta");
        moon.moveHorizontal(-200);
        moon.moveVertical(250);
        moon.changeSize(40);
        
        floor1 = new Square();
        floor1.makeVisible();
        floor1.changeColor("green");
        floor1.moveVertical(140);
        floor1.moveHorizontal(-500);
        floor1.changeSize(1000);
        
        sun.slowMoveVertical(250);
        moon.slowMoveVertical(-250);
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
