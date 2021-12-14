/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package refactoring_guru;

/**
 *
 * @author FA18-BSE-057
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}