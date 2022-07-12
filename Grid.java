package com.company;

import java.util.Random;

public class Grid {
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int[] createGrid(int[][] choices){
        String[][] space = new String[getWidth()][getWidth()]; //creating multidimensional array
        int [] random = chooseDot();
        System.out.print("   ");
        for (int k = 0; k < getWidth(); k++) {
            System.out.print(k+1);
            if (k<9) {
                System.out.print("  "); //printing x values of the array
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();
            for (int i = 0; i < getWidth(); i++) {  //filling the array with "+" signs
                for (int j = 0; j < getWidth(); j++) {
                        space[j][i] = "+";
                }
            }
        for (int k = 0; k < 3; k++) {   //replacing "+" with "0" if it was your guess
            for (int i = 0; i < getWidth(); i++) {
                for (int j = 0; j < getWidth(); j++) {
                    if (choices[0][k]>=0 && j == choices[0][k] && choices[1][k]>=0 && i == choices[1][k]){
                        space[j][i] = "0";
                    }
                }
            }
        }
        for (int i = 0; i < getWidth(); i++) {
            System.out.print(i+1);
            if (i<9) {
                System.out.print("  "); //printing y values of the array
            }else {
                System.out.print(" ");
            }
            for (int j = 0; j < getWidth(); j++) {
                System.out.print(space[j][i]);
                System.out.print("  ");
            }
            System.out.println();
        }
        return random;  //array with secret dot's location so distance can be calculated
    }

    private int[] chooseDot(){ //creates the secret dot/"+"/spot
        Random rand = new Random();
        return new int[]{rand.nextInt(getWidth()),rand.nextInt(getWidth())};
    }
}