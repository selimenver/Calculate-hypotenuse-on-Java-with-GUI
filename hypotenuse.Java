package com.example;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the a side of the triangle"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the b side of the triangle"));
        double result = Math.sqrt((a*a + (b*b)));
        JOptionPane.showMessageDialog(null,"The hypotenuse is: " + result);

        //a square = 25 b square = 25 hypothenuse = c square (hypotenuse)
       }
    }
