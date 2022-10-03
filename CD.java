public class CD {
    private String titolo;
    private String autore;
    private int brani;
    private int durata;
    
    public CD(String titolo,String autore,int brani,int durata){
        setTitolo(titolo);
        setAutore(autore);
        setBrani(brani);
        setDurata(durata);
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getBrani() {
        return brani;
    }

    public void setBrani(int brani) {
        this.brani = brani;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    
    public String toString() {
        return "Titolo: "+titolo+" Autore: "+autore+" N_Brani: "+brani+" Durata: "+durata +" (m)";
    }
        
}