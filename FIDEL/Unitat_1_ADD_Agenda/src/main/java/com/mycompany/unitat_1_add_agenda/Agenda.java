/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unitat_1_add_agenda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Agenda {
    Scanner teclado= new Scanner (System.in);
    ArrayList<String> contactos = new ArrayList();
    ArrayList<String> nombres_contactos = new ArrayList();
    String contacto;
    String leer;
    File archivo = new File("agenda.txt");
    //Comprobamos si existe fichero, si no existe lo creamos.
    public void ComprobarFichero() throws IOException{
        

        if(archivo.exists()){
            System.out.println("---------------------------------------------------------");
            System.out.println("----------------¡AQUEST ARXIU EXISTEIX!------------------");
        }
        
        else{
            System.out.println("---------------------------------------------------------");
            System.out.println("--------¡EL ARXIU NO EXISTEIX!. VAIG A CREAR-LO----------");
            System.out.println("---------------------------------------------------------");
            archivo.createNewFile();
            
        }
        
    }
    
    //Le decimos al usuario que introduzca contactos.
    public void IntroducirContactos() throws IOException{
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            String num_contactos;
            int numero_contactos;
            String leer_linea;
            
            //Si el archivo no contiene líneas, añadimos las que quiera el usuario.
            if((leer_linea=br.readLine())==null){
                
                //Abrimos archivo para escritura.
                FileWriter fw = new FileWriter(archivo.getAbsoluteFile(), true);
                System.out.println("¿Cuants contactes vols introduïr?");
                num_contactos= teclado.nextLine();
                numero_contactos= Integer.parseInt(num_contactos);
            
                while(numero_contactos<=0){
                    System.out.println("!ERROR¡, no pot ser menor o igual a cero.");
                    System.out.println("¿Cuants contactes vols introduïr?");
                    num_contactos= teclado.nextLine();
                    numero_contactos= Integer.parseInt(num_contactos);
                }
            
                //Escritura de los contactos.
                System.out.println("Introdueix els contactes d'aquesta forma(nom,telèfon).\n");
                for(int i=0;i<numero_contactos;i++){
                    System.out.println("Contacte "+(i+1)+": ");
                    contacto=teclado.nextLine();
                    while(!contacto.contains(",")){
                        System.out.println("Per favor, introdueix el contacte correctament. Format: nom,telefon");
                        contacto=teclado.nextLine();
                    }
                    contactos.add(contacto);
                    fw.write(contactos.get(i)+"\n");
                }
                fw.close();
                System.out.println("\n");
            }
            
            else{
                System.out.println("------------------PERO JA TE CONTACTES-------------------");
                System.out.println("---------------------------------------------------------");
                System.out.println();
            }
    }
    
    public void Menu() throws FileNotFoundException, IOException{
        Scanner teclado1= new Scanner (System.in);
        boolean salir = false;
        String opcio;
        int opcion;
        
        
        
        while(!salir){
            System.out.println("---------------------------------------------------------");
            System.out.println("------------------1. Llistar Agenda----------------------");
            System.out.println("------------------2. Afegir contacte---------------------");
            System.out.println("------------------3. Buscar Contacte Per Nom-------------");
            System.out.println("------------------4. Eixir-------------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("Opció: ");
            opcio=teclado1.next();
            opcion = Integer.parseInt(opcio);
            
            
            
            switch(opcion){
                //opcion 1
                case 1:
                    BufferedReader br1 = new BufferedReader(new FileReader(archivo));
                    FileWriter fw1 = new FileWriter(archivo.getAbsoluteFile(), true);
                    //Abrimos archivo para lectura.
                    System.out.println("---------------------------------------------------------");
                    System.out.println("--------------------------AGENDA-------------------------");
                    System.out.println("---------------------------------------------------------");
                    while(br1.ready()){
                    leer=br1.readLine();
                    String[] separado=leer.split(",");
                    for(int i=0;i<separado.length-1;i++){
                        System.out.println("Nom: "+separado[i]+" Telèfon: "+separado[i+1]);
                    }
                    
                    }
                    System.out.println("---------------------------------------------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    br1.close();
                    break;
                
                //opcion 2
                case 2:
                    
                    BufferedReader br2 = new BufferedReader(new FileReader(archivo));
                    FileWriter fw2 = new FileWriter(archivo.getAbsoluteFile(), true);
                    Scanner teclado2 = new Scanner (System.in);
                    String respuesta;
                    System.out.println("---------------------------------------------------------");
                    System.out.println("---------------------AFEGIR CONTACTE---------------------");
                    System.out.println("---------------------------------------------------------");
                    System.out.println();
                    System.out.println("Introdueix el contacte d'aquesta forma(nom,telèfon).\n");
                    respuesta = teclado2.nextLine();
                    while(!respuesta.contains(",")){
                        System.out.println("Per favor, introdueix el contacte correctament. Format: nom,telefon");
                        respuesta=teclado.nextLine();
                    }
                    contactos.add(respuesta);
                    fw2.write(respuesta);
                    fw2.close();
                    System.out.println("---------------------------------------------------------");
                    while(br2.ready()){
                        leer=br2.readLine();
                        String[] separado=leer.split(",");
                        
                    for(int i=0;i<separado.length-1;i++){
                        System.out.println("       Nom: "+separado[i]+" Telèfon: "+separado[i+1]);
                    }
                    }
                    System.out.println("---------------------------------------------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    br2.close();   
                    break;
                
                //opcion 3
                case 3:
                    
                    BufferedReader br3 = new BufferedReader(new FileReader(archivo));
                    FileWriter fw3 = new FileWriter(archivo.getAbsoluteFile(), true);
                    Scanner teclado3 = new Scanner (System.in);
                    String linea="";
                    String buscar="";
                    System.out.println("---------------------------------------------------------");
                    System.out.println("---------------BUSCAR CONTACTE PER NOM-------------------");
                    System.out.println("---------------------------------------------------------");
                    System.out.println("Quin nom vols buscar?");
                    System.out.println("Persona: "+(buscar=teclado3.nextLine()));
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    boolean encontrado= false;
                    
                    int n=1;
                    System.out.println("---------------------------------------------------------");
                    System.out.println("------------------CONTACTES TROBATS----------------------");
                    System.out.println("---------------------------------------------------------");
                    while((linea=br3.readLine())!=null){
                        if(linea.contains(buscar)){
                            System.out.println("Contacte "+n);
                            System.out.println(linea);
                            n++;
                            encontrado=true;
                        }
                        
                    }
                    System.out.println("---------------------------------------------------------");
                    
                    if(!encontrado){
                        System.out.println("---------------------------------------------------------");
                        System.out.println("-------------- Aquest nom no està a l'agenda-------------");
                        System.out.println("---------------------------------------------------------");
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                    }
                    
                    
                    break;
                    
                case 4:
                    FileInputStream fin=null;
                    FileOutputStream fout=null;
                    String respuesta2;
                    String respuesta3;
                    Scanner teclado4 = new Scanner (System.in);
                    Scanner teclado5 = new Scanner (System.in);
                    System.out.println("Vols copiar el fitxer a la carpeta Escritori?");
                    respuesta2=teclado4.nextLine();
                    try{
                    if("SI".equals(respuesta2) || "Si".equals(respuesta2) || "si".equals(respuesta2) ||"sI".equals(respuesta2)){
                        
                            String usuario;
                            int bytes;
                            long bytesCopied=0;
                            System.out.println("Disme el nom de l'usuari al que vols que se li copie l'agenda-copia.txt");
                            usuario=teclado4.next();
                            File archivo2 = new File("/home/"+usuario+"/Escritorio/"+archivo.getName());
                            
                        
                            fin= new FileInputStream(archivo);
                            fout=new FileOutputStream(archivo2);
                        
                            System.out.println("Total: "+archivo.length()+" bytes");
                        do{
                            bytes=fin.read();
                            if (bytes!=-1)fout.write(bytes);
                            bytesCopied++;
                            System.out.println("\rCopiats "+(bytesCopied-1)+"bytes");
                            
                        }while(bytes!=-1);
                        System.out.println("Fet");
                       
                        }
                        
                        else{
                        System.out.println("Perfecte");
                        }
                    
                        }catch(IOException e){
                            System.out.println("Error d'entrada i eixida "+e);
                            
                        }finally{
                            try{
                                if(fin!=null)fin.close();
                            }catch(IOException e){
                                System.out.println("Error al tancar el fitxer d'origen.");
                        }
                        try{
                            if(fout!=null)fout.close();
                            
                        }catch(IOException e){
                            System.out.println("Error al tancar el fitxer de destí.");
                        }
                    }
                    
                    System.out.println("Vols eliminar l'arxiu agenda.txt");
                    respuesta3=teclado5.nextLine();
                    if("SI".equals(respuesta3) || "Si".equals(respuesta3) || "si".equals(respuesta3) ||"sI".equals(respuesta3)){
                        archivo.delete();
                        System.out.println("¡ARXIU BORRAT!");
                    }
                    
                    
                    System.out.println("¡Fins l'altra!");
                    System.exit(0);
                    
                    
                default:
                    System.out.println("Sols nombres entre 1 i 4");
                    
            }
        }
    }
    
    
    
    public static void main(String[] args) throws IOException{
       Agenda a = new Agenda();
       a.ComprobarFichero();
       a.IntroducirContactos();
       a.Menu();
    }
    
    
    
}
