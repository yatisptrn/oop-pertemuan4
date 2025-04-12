/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author LAB F
 * TGL: 12 April 2025
 */
public class Array1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] NMA = new String[5];
        
        NMA [0]="Baskara";
        NMA [1]="Meidiana";
        NMA [2]="Adnan";
        NMA [3]="Nathasa";
        NMA [4]="Galih";
       
        System.out.print("Yati");
        Scanner inp = new Scanner(System.in);
        for(int idx=0; idx<5; idx++ ){
            System.out.printf("Data Nama Pengunjung ke-%d: ", idx);
            NMA[idx]= inp.nextLine();
        }
    }
    
}
