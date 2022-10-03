public class Catalogo{
   private String codice;
   private String marca;
   private String modello;
   private String velocitaCpu;
   private String velocitaRam;
   private String memoria;
   private String dimensioneSchermo;
   private String annoAcquisto;
   
    public Catalogo(String codice, String marca, String modello, String velocitaCpu, String velocitaRam, String memoria, String dimensioneSchermo, String annoAcquisto){
        this.codice = codice;
        this.marca = marca;
        this.modello = modello;
        this.velocitaCpu = velocitaCpu;
        this.velocitaRam = velocitaRam;
        this.memoria = memoria;
        this.dimensioneSchermo = dimensioneSchermo;
        this.annoAcquisto = annoAcquisto;
    }

    public String getCodice() {
        return codice;
    }

    private void setCodice(String codice) {
        this.codice = codice;
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    private void setModello(String modello) {
        this.modello = modello;
    }

    public String getVelocitaCpu() {
        return velocitaCpu;
    }

    private void setVelocitaCpu(String velocitaCpu) {
        this.velocitaCpu = velocitaCpu;
    }

    public String getVelocitaRam() {
        return velocitaRam;
    }

    private void setVelocitaRam(String velocitaRam) {
        this.velocitaRam = velocitaRam;
    }

    public String getMemoria() {
        return memoria;
    }

    private void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getDimensioneSchermo() {
        return dimensioneSchermo;
    }

    private void setDimensioneSchermo(String dimensioneSchermo) {
        this.dimensioneSchermo = dimensioneSchermo;
    }

    public String getAnnoAcquisto() {
        return annoAcquisto;
    }

    private void setAnnoAcquisto(String annoAcquisto) {
        this.annoAcquisto = annoAcquisto;
    }

}