public class autoBus extends vehiculo{
    private int numPlazas;
    public autoBus(String mar, String mode, double p, int numPlazas){
        super(mar,mode,p);
        setPlazas(numPlazas);
    }
    public void setPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.print("\t" + "Plazas: "+ numPlazas);
    }
}
