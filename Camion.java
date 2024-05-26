public class Camion extends VehiculoCarga {
    private int numEjes;

    //constructor
    public Camion(String marca, String modelo, int año, int kilometraje,int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje);
        this.numEjes = numEjes;
        
    }
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("numero de ejes " +numEjes);
    }
    public double CostodeMantenimiento(double CostoPorKM, double KM){
        double CostoTotal = CostoPorKM * KM;
        return CostoTotal;
       }

}
