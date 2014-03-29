package info.gridworld.actor;

import java.awt.Color;

/*
 * A <code>Flower</code> is an actor that darkens over time. Some actors drop
 * flowers as they move. <br />
 * The API of this class is testable on the AP CS A and AB exams.
 */

public class Flower extends Actor
{
    private static final Color DEFAULT_COLOR = Color.PINK;
    private static final double DARKENING_FACTOR = 0.05;

    // lose 5% of color value in each step

    /**
     * Constructs a pink flower.
     */
    public Flower()
    {
        setColor(DEFAULT_COLOR);
    }

    /**
     * Constructs a flower of a given color.
     * @param initialColor the initial color of this flower
     */
    public Flower(Color initialColor)
    {
        setColor(initialColor);
    }

    /**
     * Causes the color of this flower to darken.
     */
    public void act()
    {
        Color c = getColor();
        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

        setColor(new Color(red, green, blue));
    }
}
