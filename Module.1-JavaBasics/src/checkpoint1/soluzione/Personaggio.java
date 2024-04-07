package checkpoint1.soluzione;

class Personaggio {
    private String nome;
    private Razza razza;
    private int posizioneX;
    private int posizioneY;
    private int salute;
    private int puntiAttacco;
    private int puntiDifesa;
    private String[] inventario;
    private int inventarioSize;

    public Personaggio(String nome, Razza razza, int posizioneX, int posizioneY, int salute, int puntiAttacco, int puntiDifesa) {
        this.nome = nome;
        this.razza = razza;
        this.posizioneX = posizioneX;
        this.posizioneY = posizioneY;
        this.salute = salute;
        this.puntiAttacco = puntiAttacco;
        this.puntiDifesa = puntiDifesa;
        this.inventario = new String[10];
        this.inventarioSize = 0;
    }


    public void muovi(int x, int y) {
        this.posizioneX = x;
        this.posizioneY = y;
    }

    public void muoviOffset(int xOffset, int yOffset) {
        this.posizioneX += xOffset;
        this.posizioneY += yOffset;
    }

    public void colpisci(Personaggio target) {
        int danno = this.puntiAttacco - target.puntiDifesa;
        if (danno > 0){
            target.setSalute(target.getSalute() - danno);
        } else {
            System.out.println("L'attacco è nullo poichè il difensore si è difeso bene!");
        }
    }

    public void stampaStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Posizione: (" + posizioneX + ", " + posizioneY + ")");
        System.out.println("Salute: " + salute);
        System.out.println("Punti Attacco: " + puntiAttacco);
        System.out.println("Punti Difesa: " + puntiDifesa);
        System.out.print("Inventario: ");
        for (int i = 0; i < inventarioSize; i++) {
            System.out.print(inventario[i] + " ");
        }
        System.out.println("\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Razza getRazza() {
        return razza;
    }

    public void setRazza(Razza razza) {
        this.razza = razza;
    }

    public int getPosizioneX() {
        return posizioneX;
    }

    public void setPosizioneX(int posizioneX) {
        this.posizioneX = posizioneX;
    }

    public int getPosizioneY() {
        return posizioneY;
    }

    public void setPosizioneY(int posizioneY) {
        this.posizioneY = posizioneY;
    }

    public int getSalute() {
        return salute;
    }

    public void setSalute(int salute) {
        this.salute = salute;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;
    }

    public void setPuntiAttacco(int puntiAttacco) {
        this.puntiAttacco = puntiAttacco;
    }

    public int getPuntiDifesa() {
        return puntiDifesa;
    }

    public void setPuntiDifesa(int puntiDifesa) {
        this.puntiDifesa = puntiDifesa;
    }

    public String[] getInventario() {
        return inventario;
    }

    public void setInventario(String[] inventario) {
        this.inventario = inventario;
    }

    public int getInventarioSize() {
        return inventarioSize;
    }

    public void setInventarioSize(int inventarioSize) {
        this.inventarioSize = inventarioSize;
    }
}
