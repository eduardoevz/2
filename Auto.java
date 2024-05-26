public class Auto extends VehiculoPasajeros{
    private String tipoCombustible;

    //constructor
    public <string> Auto(string marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible ){
        super(tipoCombustible, modelo, año, numPasajeros);
        this.tipoCombustible = tipoCombustible;

    }
    //getter y setter
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(){
        this.tipoCombustible = tipoCombustible;
    }
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Tipo de combustible "+tipoCombustible);
    }
    
    public double CostodeMantenimiento(double CostoPorKM, double KM){
        double CostoTotal = CostoPorKM * KM;
        return CostoTotal;
    }

}
