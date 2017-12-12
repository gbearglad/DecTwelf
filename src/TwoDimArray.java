
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 0504gicarlson
 */
public class TwoDimArray {

    public static void main(String[] args) {
        int[][] twoDim = new int[3][10];
        fill2DimArray(twoDim, 5);
        print2DimArray(twoDim);
    }

    private static void print2DimArray(int[][] twoDim) {
        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                System.out.printf("%4d", twoDim[i][j]);
            }
            System.out.println("");
        }
    }

    private static void fill2DimArray(int[][] twoDim, int fillValue) {
        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                twoDim[i][j] = fillValue;
            }
        }
    }
}
