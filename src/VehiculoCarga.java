public class VehiculoCarga extends Vehiculo{

    private int capacidadCarga;

    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga, double costoPorKM, double kilometrosRecorridos) {
        super(marca, modelo, año, kilometraje, costoPorKM, kilometrosRecorridos);
        this.capacidadCarga=capacidadCarga;
    }

    public int getcapacidadCarga(){
        return capacidadCarga;
    }
    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga=capacidadCarga;
    }
    
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Capacidad de Carga: "+capacidadCarga);
    }
    
    
    public void RealizarMantenimiento(){
        super.RealizarMantenimiento(costoPorKM,kilometrosRecorridos);
        System.out.println("Se realizó: ");
        System.out.println("1. Cambio de aceite y filtro.");
        System.out.println("2. Revisión y ajuste de frenos.");
        System.out.println("3. Inspección de neumáticos y presión de aire.");
        System.out.println("4. Verificación y llenado de fluidos (refrigerante, líquido de frenos, etc.).");
        System.out.println("5. Revisión del sistema de suspensión.");
        System.out.println("6. Comprobación de las luces y señalizaciones.");
        System.out.println("7. Limpieza y lubricación de la cadena de transmisión.");
    }
    
}
