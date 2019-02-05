/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author UdeG_
 */
public class Burbuja {    
    public static void main(String[] args)  throws IOException
    {      
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        
        System.out.print("Cantidad de datos: ");
        int can = Integer.parseInt(in.readLine());        
        int array[] = new int[can];
        System.out.println("\n");              
        int y = 0;
        for (int x = 0 ; x < array.length;x++)
        {
            y+=1;
            System.out.print("Numero:");
            array[x] = Integer.parseInt(in.readLine());
        }
        burb(array);
    } 
    static void burb(int arr[]){
        for(int x = 0; x < arr.length - 1; x++){
            for(int y = 0; y < arr.length - 1; y++){
                if (arr[ y ] < arr[ y + 1]){
                    int can = arr[ y + 1 ];
                    arr[ y + 1 ] = arr[y];
                    arr[ y ] = can;}
            }
        }
            System.out.println("------Lista Ordenada :)------");
        for(int x = 0; x < arr.length; x++)
        {            
            System.out.print(arr[x] + "\n");}
    }
}
