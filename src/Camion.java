public class Camion extends VehiculoCarga {

    private int numEjes;

    public Camion(String marca, String modelo, int año, int kilometraje, double costoPorKM, double kilometrosRecorridos, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga, costoPorKM, kilometrosRecorridos);
        this.numEjes=numEjes;
    }

    public int getnumejes(){
        return numEjes;
    }
    public void setNumejes(int numEjes){
        this.numEjes=numEjes;
    }

    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Numero de ejes: "+numEjes);
    }

    @Override
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
