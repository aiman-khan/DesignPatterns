/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.refactoring_guru;

import java.awt.Color;
import java.awt.*;

/**
 *
 * @author FA18-BSE-057
 */
public class Triangle extends BaseShape {
    public int radius;
    int[] x;
    int[] y;

    public Triangle(int[] x, int[] y, Color color) {
        super(x[0], y[0], color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawPolygon(x, y, 3);
        
       
    }
}