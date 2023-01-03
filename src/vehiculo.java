public class vehiculo {
    private String marca, modelo;
    private double precioAlquiler;
    public vehiculo(String marca, String modelo, double precioAlquiler){
        this.marca = marca;
        this.modelo = modelo;
        this.precioAlquiler = precioAlquiler;
    }
    public void imprimirAtributos(){
        System.out.print("Modelo: "+ marca + " "+ modelo + "\n"+"Precio: "+precioAlquiler);
    }
}
