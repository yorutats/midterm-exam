/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author s2000
 */
public class Point {
    
    private int x;
    private int y;

    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "("+x+","+y+")";
    }

    
}
