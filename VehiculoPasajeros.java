public class VehiculoPasajeros extends Vehiculo {
    
    private static int kilometraje;
    private int numPasajeros;

    //constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int numPasajeros){
        super(marca,modelo,año,kilometraje);
        this.numPasajeros = numPasajeros;
 }

//get y setters
public int getNumPasajeros(){
    return numPasajeros;
}
public void setNumPasajeros(){
    this.numPasajeros = numPasajeros;
}
//sobreescribir sobre el metodo mostrarinfo
@Override
public void MostrarInfo(){
    super.MostrarInfo();
    System.out.println("Numero de pasajeros: " + numPasajeros);
}


}
