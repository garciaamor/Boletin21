package boletin21;

public class Boletin21 {

    public static void main(String[] args) {
    LerFich obx= new LerFich();
     
        obx.crearArray();
        obx.escribir("registro.txt");
        obx.lerFich("registro.txt");
       
    }
    
}