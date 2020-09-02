/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico3;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Zoologico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FachadaZoologico zoo = new FachadaZoologico();
        int op = 0;
        Scanner sop;
        while (op != 8) {
            System.out.println("*******Menu *********");
            System.out.println("1.- ");
            System.out.println("2.-");
            System.out.println("3.-");
            System.out.println("4.-");
            System.out.println("5.-");
            System.out.println("6.-");
            System.out.println("7.-");
            System.out.println("8.- Salir");
            System.out.println("***********************");
            //sop = new Scanner();

            switch (op) {
                case 1:
                    zoo.AnadirMamifero();
                    break;
                case 2:
                    zoo.MostrarAve();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;

            }

        }

    }
}