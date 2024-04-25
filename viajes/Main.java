package viajes;

import viajes.estelar.Sistema;

public class Main {
    public static void main(String[] args) {

        Sistema sis = new Sistema("Sistema");

        Planeta  planeta1 = new Planeta("Jupiter");

        Nave navecita = new Nave(5);

       int aa =  navecita.getCantidadTripulantes();
       System.out.println("La cantidad de tripulantes es "+ aa);

    
       String nombrePlaneta = planeta1.getNombre();
       System.out.println(nombrePlaneta);

    
       
    



        


    }
}
