package prog2.model;

public class CarreteraTerra extends AccesTerra {
    private int amplada;
    public CarreteraTerra(String nom, boolean accessibilitat,boolean estat,
                          LlistaAllotjaments llista, int longitud, int amplada) {
        super(nom, accessibilitat, estat, llista,longitud);
        this.amplada=amplada;
    }

    public int getAmplada() {return this.amplada;}

    public void setAmplada(int amplada){ this.amplada=amplada;}

    @Override
    public boolean isAccessibilitat() {return true;}

    @Override
    public String toString() {
        return super.toString()+", longitud:"+getLongitud()+", amplada: "+getAmplada();
    }
}
