/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ieseljust.psp.apac1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MyShell {
    protected Runtime r= Runtime.getRuntime();
    String[] ordenes;
    String orden;
    
    public void lanzarcomando(){
        
        Scanner entrada_usuario = new Scanner(System.in);
                
            try{
                while(!"quit".equals(orden)){
                    System.out.println("#MyShell> \u001B[0m");
                    orden = entrada_usuario.next();
                    ordenes=orden.split(" ");    
                
                        ProcessBuilder pb = new ProcessBuilder(ordenes);
                        Process p=pb.start();
        
        
                        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
                        String line;
                        while((line=br.readLine())!=null){
                            System.out.println("\u001b[32m " +line+" \u001B[0m");
                        }
                }

            }catch(IOException e){
                System.out.println("");
                e.printStackTrace();
            }
            
        
        
        
    }
    public static void main(String[] args) throws IOException{
        
        MyShell ms = new MyShell();
        ms.lanzarcomando();
        
    }
}
