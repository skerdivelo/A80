public class Veicoli {
    private String targa;
    private String marca;
    private String modello;
    private int cilindrata;
    private String annoAcquisto;
    private int numeroPosti;

    public Veicoli(String targa,String marca, String modello, int cilindrata, String annoAcquisto, int numeroPosti){
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.annoAcquisto = annoAcquisto;
        this.numeroPosti = numeroPosti;
    }
    public String getTarga(){
        return targa;
    }
    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public int getCilindrata(){
        return cilindrata;
    }
    public String getAnnoAcquisto(){
        return annoAcquisto;
    }
    public int getNumeroPosti(){
        return numeroPosti;
    }
    public void setTarga(String targa){
        this.targa = targa;
    }
    private void setMarca(String marca){
        this.marca = marca;
    }
    private void setModello(String modello){
        this.modello = modello;
    }
    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }
    public void setAnnoAcquisto(String annoAcquisto){
        this.annoAcquisto = annoAcquisto;
    }
    private void setNumeroPosti(int numeroPosti){
        this.numeroPosti = numeroPosti;
    }
    public String toString(){
        return "Targa: " + targa + " Marca: " + marca + " Modello: " + modello + " Cilindrata: " + cilindrata + " Anno di acquisto: " + annoAcquisto + " Numero di posti: " + numeroPosti;
    }
    
}