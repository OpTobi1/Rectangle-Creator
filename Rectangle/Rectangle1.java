package Rectangle;

import java.util.Scanner;

// --- Rectangle1.java ---
public class Rectangle1 {
    private double width;
    private double height;

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() { return width * height; }
    public double getPerimeter() { return 2 * height + 2 * width; }
    public double getDiagonal() { return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2)); }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public String toString() {
        return "width=" + width + ", height=" + height + ", area=" + getArea() +
                " perimeter=" + getPerimeter() + " diagonal=" + getDiagonal();
    }
}