public class Vehiculo {

private String marca;
private String modelo;
private int año;
private int kilometraje;
protected double costoPorKM;
protected double kilometrosRecorridos;

//Constructor
public Vehiculo(String marca, String modelo, int año, int kilometraje, double costoPorKM, double kilometrosRecorridos){
    this.marca=marca;
    this.modelo=modelo;
    this.año=año;
    this.kilometraje=kilometraje;
    this.costoPorKM=costoPorKM;
    this.kilometrosRecorridos=kilometrosRecorridos;
}

//#region getters
public String getmarca(){
    return marca;
}
public String getmodelo(){
    return modelo;
}
public int getaño(){
    return año;
}
public int getkilometraje(){
    return kilometraje;
}
public double getcostoPorKM(){
    return costoPorKM;
}
public double getKilometrosRecorridos(){
    return kilometrosRecorridos;
}
//#endregion

//#region setters
public void setMarca(String marca){
    this.marca=marca;
}
public void setModelo(String modelo){
    this.modelo=modelo;
}
public void setAño(int año){
    this.año=año;
}
public void setKilometraje(int kilometraje){
    this.kilometraje=kilometraje;
}
public void setCostoPorKM(double costoPorKM){
    this.costoPorKM=costoPorKM;
}
public void setKilometrosRecorridos(double kilometrosRecorridos){
    this.kilometrosRecorridos=kilometrosRecorridos;
}
//#endregion

//Metodo MostrarInfo
public void MostrarInfo(){
    System.out.println("Marca: "+marca);
    System.out.println("Modelo: "+modelo);
    System.out.println("Año: "+año);
    System.out.println("Kilometraje: "+kilometraje);
}

public void RealizarMantenimiento(double costoPorKM, double kilometrosRecorridos){
    double costoTotal=0;
    costoTotal=costoPorKM*kilometrosRecorridos;
    System.out.println("El costo total del mantenimiento es: C$"+costoTotal);
}
}
