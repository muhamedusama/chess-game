/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author a
 */
public class Bishob extends Pieces {
    private String image_source;
    public static String getImageSource(String color) {
        if (color.equals("black"))
            return "F:\\2\\chess\\chess\\chess\\src\\chess\\images\\black_bishop.png";
        else
            return "F:\\2\\chess\\chess\\chess\\src\\chess\\images\\white_bishop.png";
    }
}