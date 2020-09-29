
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumne
 */
class FileMan {
    protected File currentPath;//Ens apuntará en tot moment el path actual.
    protected String originalPath;//Ens indicarà la ruta original amb què vam iniciar l’aplicació.
    
    public FileMan(){
        this.currentPath=new File(System.getProperty("user.dir")); //Ens retorna el directori actual de treball de l’usuari.
        this.originalPath=this.currentPath.getAbsolutePath(); //Per establir el path original, per poder restaurar-lo després.
    }
    
    public FileMan(String path){
        this.currentPath=new File(path); //creem el currentPath a partir de la ruta que ens indiquen.
        if(!this.currentPath.isDirectory()){ //Com que no sabem si és una ruta vàlida, farem ús del mètode isDirectory().
            System.out.println("\u001B[31m El directori "+path+" no existeix.\u001B[0m");//En cas que no siga un directori, indicarem l’error i iniciarem el gestor en la mateixa ruta de treball de l’usuari (com si no s’hagués indicat cap paràmetre
            this.currentPath=new File(System.getProperty("user.dir"));
        }
    }
    
    //El mètode start serà el que gestionarà el bucle continu d’agafar les ordres de l’usuari i executar el que corresponga en cada moment. L’esquelet d’aquest mètode serà:
    
    public void start(){
        try{
            Scanner keyboard = new Scanner (System.in); //Fem ús de la classe Scanner per agafar l’entrada de teclat.
            String[] ordre;
            do{
                //Mitjançant la funció split de la classe String, separem l’ordre en un vector, i fem un switch
                //segons el primer element d’aquesta separació, que contindrà l’ordre.
                System.out.print("# Fileman: "+this.currentPath.getName()+">");
                ordre = keyboard.nextLine().split(" ");
                
                //Entrarem en un bucle infinit, mostrant sempre el prompt, fins que l’usuari introduïsca quit o exit.
                switch(ordre[0]){
                    case "quit":
                    case "exit":
                        System.out.println("Fins l'altra...");
                        System.exit(0);
                    break;
                    case "cd":
                        if(ordre.length==1)this.restorePath();
                        else{
                            if(ordre[1].equals(".."))this.changeParentDir();
                            else if(ordre[1].equals("/"))this.changeRootDir();
                            else this.changeDir(ordre[1]);
                        }
                        break;
                }
            }while (true); 
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    
    public void restorePath(){
        this.currentPath=new File(this.originalPath);
    }
    
    public void changeRootDir(){
        this.currentPath=new File("/");
    }
    
    public void changeDir(String path){
        File tmpFile=new File(this.currentPath.getAbsolutePath(), path);
        if (tmpFile.isDirectory()){
            this.currentPath=tmpFile;
        } else System.out.println("\u001B[31m "+path+" no és un directori. \u001B[0m");
    }
    
    /**
     * Per tal d’accedir al directori pare en la jerarquia, el que fem és partir del directori actual, i obtenir
       a partir de la ruta actual quina és la ruta pare. Per a això, farem ús del mètode split de la classe
       String per separar les diferents parts del path, i després les ajuntem, eliminant l’última. Finalment,
       establirem el currentPath al nou valor:
     */
    public void changeParentDir(){
        String[] tmpPath=this.currentPath.getAbsolutePath().split("/");
        String newPath="";
        for(int i=0;i<tmpPath.length-1;i++){
            newPath=newPath+"/"+tmpPath[i];
        }
        this.currentPath=new File(newPath);
    }

    
    //El mètode Main de la classe, simplement crearà un objecte de tipus FileMan en funció dels paràmetres, i invocarà el mètode per iniciar el gestor.
    
    public static void main(String[] args){
        FileMan fm;
        if(args.length>1){
            System.out.println("Sintaxi: \n fileman [path]");
        };
        
        if(args.length==1) fm=new FileMan(args[0]);
        else fm=new FileMan();
        fm.start();
    }
    
}
