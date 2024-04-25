package viajes;

public class Nave {

    private int cantidadTripulantes;

    private Planeta origen;

    
    public Nave(int tripulantes){
        this.cantidadTripulantes = tripulantes;
    }
   

    public int getCantidadTripulantes() {
        return cantidadTripulantes;
    }


    public void setOrigen(Planeta origen) {
        this.origen = origen;
    }

    
    
}
