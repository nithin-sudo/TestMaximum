package com.generic.maxtest;
public class MaximumTest<T extends Comparable<T>> {
    T x,y,z;

    /**
     * defining constructor
     * @param x
     * @param y
     * @param z
     */
    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
   public T maximum(){
        return MaximumTest.maximum(x,y,z,a);
    }
    /**
     * using generic method to find the maximum values
     * @param x
     * @param y
     * @param z
     * @param <T>
     * @return
     */
    public static <T extends Comparable>T maximum(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if (z.compareTo(max)>0){
            max=z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static <E>void printMax(E x,E y,E z,E max) {
        System.out.println("Maximum of "+x+" ,"+y+" ,"+z+" is "+max);
    }

    /**
     * calling testMaximum and floatMaximum and stringMaximum method to print the maximum value
     * @param args
     */
    public static void main(String[] args) {
        Integer aI=3,bI=4,cI=6;
        Float eD=1.2222f,fD=2.3123f,gD=1.1234f;
        String pS="dell",qS="asus",rS="linux";
        new MaximumTest(aI,bI,cI).maximum();
        new MaximumTest(eD,fD,gD).maximum();
        new MaximumTest(pS,qS,rS).maximum();
    }
}
