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
public class Pawn extends Pieces{

    public static String getImageSource(String color) {
        if (color.equals("black")){
            return "F:\\2\\chess\\chess\\chess\\src\\chess\\images\\black_pawn.png";
            
        }
        else
        {
            return "F:\\2\\chess\\chess\\chess\\src\\chess\\images\\white_pawn.png";
    }
    }
}