public class turismo extends vehiculo {
    private int numPuertas;
    public turismo(String marca, String modelo, double precioAlquiler, int numPuertas){
        super(marca,modelo,precioAlquiler);
        this.numPuertas = numPuertas;
    }
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.print("\t" + "Puertas: "+ numPuertas);
    }
}
