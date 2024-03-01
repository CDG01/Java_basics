package Object_Auto;

/* CONSEGNA
Scrivere un programma che contenga una classe che definisce un Auto
che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili
solo attraverso i metodi.
*/

public class Auto {
    private String targa;
    private String cilindrata;
    private String marca;
    private String Modello;

    public Auto(String targa, String cilindrata, String marca, String modello) {
        this.targa = targa;
        this.cilindrata = cilindrata;
        this.marca = marca;
        Modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return Modello;
    }

    public void setModello(String modello) {
        Modello = modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "targa='" + targa + '\'' +
                ", cilindrata='" + cilindrata + '\'' +
                ", marca='" + marca + '\'' +
                ", Modello='" + Modello + '\'' +
                '}';
    }
}
