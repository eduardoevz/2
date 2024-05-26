public class App {
    public static void main(String[] args) throws Exception{
         //crear instancias
    Auto auto = new Auto("toyota", "corolla", 2020, 150000, 5, "gasolina");

    Camion camion = new Camion("volvo", "fh", 2019, 75000, 20000, 4);

    //mostrar la informacion de cada vehiculo
    System.out.println("mostrar informacion del auto");
auto.MostrarInfo();
System.out.println("mostrar informacion del camion");
camion.MostrarInfo();
    }
   }
       
   
   
