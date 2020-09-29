/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unitat_1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FileMan {
    
    protected File currentPath;
    protected String originalPath;
    
    //Constructor 1
    
    /*
    - System.getProperty("user.dir") --> Retorna el directori actual
    - Per restablir el path original, per poder restaurar-lo després, fem ús del mètode getAbsolutePath de la classe File.  
    */
    
    public FileMan(){
        this.currentPath=new File(System.getProperty("user.dir"));
        this.originalPath=this.currentPath.getAbsolutePath();
    }
    
    //Constructor 2
    
    /*
    - Creem el currentPath a partir de la ruta que ens indiquen
    - Com que no sabem si és una ruta vàlida, farem ús del mètode isDirectory(). En cas que no siga un directori, indicarem l'error i
      iniciarem el gestor en la mateixa ruta de treballde l'usuari.
    */

    public FileMan(String path){
        this.currentPath=new File(path);
        if(!this.currentPath.isDirectory()){
            System.out.println("\u001B[31m El directori "+path+" no existeix. \u001B[0m");
            /*
                El path al que apunta son immutables
                per tant hem de crear un nou File
                (i el garbage collector ja s'encarregarà de la resta)
            */
            
            this.currentPath=new File(System.getProperty("user.dir"));
        }
    }
    
    //Metode Start
    //Serà el que gestionarà el bucle continu d'agafar les ordres de l'usuari i executar el que corresponga en cada moment.
    /*
        - Scanner --> Entrada de teclat
        - Funció split --> Separem l'ordre en un vector.
        - Bucle infinit fins que l'usuari introduïsca quit o exit.   
    */
    
    @SuppressWarnings("empty-statement")
    public void start(){
        try{
            Scanner keyboard = new Scanner(System.in);
            String [] ordre;
        
        
            do{
                System.out.print("# FileMan:"+this.currentPath.getName()+">");
                ordre = keyboard.nextLine().split(" ");
            
                switch(ordre[0]){
                    case "quit":
                    case "exit":
                        System.out.println("Fins l'altra...");
                        System.exit(0);
                    break;
                } 
        
            }while(true);
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    //Canvi de directori: cd i els mètodes restorePath, changeParentDir, changeRootDir
    
    //CD
    /*
        case "cd":
            if(ordre.length==1) this.restorePath();
                else{
                    if(ordre[1].equals("..")) this.changeParentDir();
                    else if (ordre[1].equals("/")) this.changeRootDir();
                    else this.changeDir(ordre[1]);
                }
            break;        
    */
        
    //Mètode restorePath
    
    public void restorePath(){
        //Restaura el path al path original
        this.currentPath=new File(this.originalPath);
    }
    
    //Mètode changeRootDir
    
    public void changeRootDir(){
        this.currentPath=new File("/");
    }
    
    //Mètode changeParentDir
    //Hem d'obtenir la ruta pare desde la ruta actual.
    
    public void changeParentDir(){
        String[] tmpPath=this.currentPath.getAbsolutePath().split("/");
        String newPath="";
        for (int i=0;i<tmpPath.length-1;i++){
            newPath=newPath+"/"+tmpPath[i];
        }
        
        this.currentPath=new File(newPath);
    }
    
    
    
    
    //Metode Main
    // Crearà un objecte de tipus FileMan en funció dels paràmetres, i invocarà el mètode per iniciar el gestor.
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        FileMan fm;
        
        if (args.length>1){
            System.out.println("Sintaxi: \n fileman[path]");
            System.exit(0);
        };
        
        // Inicialitzem fm en funció de si ens passen o no argument.
        if(args.length==1) fm=new FileMan(args[0]);
        else fm=new FileMan();
        
        fm.start();
    }
    
    
}
