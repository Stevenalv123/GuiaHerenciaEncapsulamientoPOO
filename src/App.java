public class App {
    public static void main(String[] args) throws Exception {
        Auto auto=new Auto("Toyota", "Corolla", 2019, 30000, 4, 3, 5000, "Gasolina");
        Camion camion=new Camion("Volvo", "FH", 2015, 50000, 5, 15000, 7000, 5);

        System.out.println("<---Informacion del auto--->");
        auto.MostrarInfo();
        System.out.println("Realizando mantenimiento específico del vehículo de pasajeros...");
        auto.RealizarMantenimiento();

        System.out.println("\n<---Informacion del camion--->");
        camion.MostrarInfo();
        System.out.println("Realizando mantenimiento específico del camión...");
        camion.RealizarMantenimiento();
    }
}
