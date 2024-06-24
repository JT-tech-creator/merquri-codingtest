package org.merquri;

public class GamePlatform {
    public static double getFinalSpeed(double initialSpeed, int[] inclinations) {
        double finalSpeed = initialSpeed;
        for (int incline: inclinations) {
            finalSpeed-=incline;
        }
        return finalSpeed;
    }

    public static void main(String[] args) {
        System.out.println(getFinalSpeed(60.0, new int[]{0, -30, 0, 45, 0})); //should print 45
    }
}