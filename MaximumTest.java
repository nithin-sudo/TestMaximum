package com.generic.maxtest;
public class MaximumTest {
    /**
     * Finding maximum integer among three integers using compareTo method
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static int testMaximum(Integer x,Integer y,Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    /**
     * printing the maximum number using printMax generic method
     * @param x
     * @param y
     * @param z
     * @param max
     * @param <E>
     */
    public static <E>void printMax(E x,E y,E z, E max) {
        System.out.println("Maximum of "+x+" ,"+y+" ,"+z+"  is "+max);
    }

    /**
     * calling testMaximum method to print the maximum value
     * @param args
     */
    public static void main(String[] args) {
        Integer aI=3,bI=4,cI=6;
        testMaximum(aI,bI,cI);
    }
}
