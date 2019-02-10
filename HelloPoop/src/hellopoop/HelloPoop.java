/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellopoop;

import java.util.Scanner;

/**
 *
 * @author gilbert
 */
public class HelloPoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter 1 or 2 : ");
        Scanner userIn = new Scanner(System.in);
        String input = userIn.nextLine();
        if (input.equals("1")) {
            System.out.println("I want tacos");
        } else if (input.equals("2")) {
            System.out.println("I want burritos");

        }
        else {
            System.out.println("I'll have whatever");
        }
    }

}
