public class VehiculoCarga extends Vehiculo {
    private int capacidadCarga;
    
    //constructor
    public VehiculoCarga(String marca, String modelo, int año, int capacidadCarga){
        super(marca, modelo, año, capacidadCarga);
        this.capacidadCarga = capacidadCarga;
    }
    //getter y setter para capacidaddcarga
    public int getCapacidaddCarga(){
        return capacidadCarga;

    }
    public void setCapacidaddCarga(){
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("capacidad de carga: "+ capacidadCarga + " kg");
    }

}
