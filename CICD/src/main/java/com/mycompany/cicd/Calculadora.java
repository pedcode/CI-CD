package com.mycompany.cicd;

import javax.swing.JOptionPane;
/**
 *
 * @author 82326479
 */
public class Calculadora {
    public static double soma(double a, double b){
        return a + b; 
    }
    public static double sub(double a, double b){
        return a - b;
    }
    public static double div(double a, double b){
        return a / b;
    }            
    public static double mult(double a, double b){
        return a * b;
    } 
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para Soma / Digite 2 para Subtração\n"
                + "Digite 3 para Divisão / Digite 4 para Multiplicação"));
        
        switch(num){
            case 1:
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
                
                JOptionPane.showMessageDialog(null, soma(num1, num2));
                break;
            case 2:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
                
                JOptionPane.showMessageDialog(null, sub(num1, num2));
                break;
            case 3:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
                
                JOptionPane.showMessageDialog(null, div(num1, num2));
                break;
            case 4:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
                
                JOptionPane.showMessageDialog(null, mult(num1, num2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha um número entre 1 e 4");
                break;
                
            
        }
    }
}