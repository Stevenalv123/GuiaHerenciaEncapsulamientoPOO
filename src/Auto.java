public class Auto extends VehiculoPasajeros{

    private String tipoCombustible;

    public Auto(String marca, String modelo, int año, int kilometraje, int cantidadPasajeros, double costoPorKM, double kilometrosRecorridos, String tipoCombustible) {
        super(marca, modelo, año, kilometraje, cantidadPasajeros, costoPorKM,kilometrosRecorridos);
        this.tipoCombustible=tipoCombustible;
    }

    public String gettipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
    }

    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Tipo de combustible: "+tipoCombustible);
    }

    @Override
    public void RealizarMantenimiento(){
        super.RealizarMantenimiento(costoPorKM, kilometrosRecorridos);
        System.out.println("Se realizó: ");
        System.out.println("1. Cambio de aceite y filtro.");
        System.out.println("2. Revisión y ajuste de frenos.");
        System.out.println("3. Inspección y rotación de neumáticos.");
        System.out.println("4. Verificación y llenado de fluidos (refrigerante, líquido de frenos, etc.).");
        System.out.println("5. Comprobación de las luces y señalizaciones.");
        System.out.println("6. Revisión del sistema de aire acondicionado.");
        System.out.println("7. Limpieza y revisión de cinturones de seguridad.");
    }
    


}
