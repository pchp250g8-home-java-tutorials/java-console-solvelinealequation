/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.solvelinealequation;

/**
 *
 * @author PC
 */
public class SolveLinealEquation 
{

    public static void main(String[] args) throws Exception
    {
        var console = System.console();
        System.out.println("Input coefficients of lineal equation");
        var a = Float.parseFloat(console.readLine());
        var b = Float.parseFloat(console.readLine());
        System.out.printf
        (
            "Try to solve the equation:%f*x+%f=0\r\n", 
            a, b
        );
        if((a == 0) && (b == 0))
            System.out.println("The answer is any number");
        else if ((a == 0) && (b != 0))
            System.out.println("The equation has no solution");
        else
            System.out.printf
            (
                "The equation has the following solution:%f\r\n", 
                -b / a
            );
    }
}
