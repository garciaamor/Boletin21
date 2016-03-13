package boletin21;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LerFich {
    
ArrayList <String> lista=new ArrayList(); 
    
    public void crearArray(){
             
        lista.add("Tigre"); 
        lista.add("Catapulta");
        lista.add("Libreta");
        lista.add("Fallo");
}
   
           
    public void escribir(String nomeFich){
       File f=new File(nomeFich);
       PrintWriter escribir=null;
        
        try {
            escribir=new PrintWriter(f);
            
                ordenar();   
                for(int i=0;i<lista.size();i++){ 
                escribir.println((i+1)+" "+lista.get(i));
               }            
        }        
        catch (FileNotFoundException ex) {
            System.out.println("error de escritura"+ex.getMessage());
        }
        finally{
            escribir.close();
        }
    }
    public void ordenar(){
        Collections.sort(lista);
    }
    
    public void lerFich(String nomeFich){
        Scanner ler=null;
  
        try {
            ler=new Scanner(new File(nomeFich));
            while(ler.hasNextLine()){
                
                String res=ler.nextLine();
                System.out.println(res);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error de lectura"+ex.getMessage());
        }
    finally{
        ler.close();}
            }
    
}