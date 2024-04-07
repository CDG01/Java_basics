package checkpoint1.soluzione;

class Combattimento {
    private Modalita modalita;
    private Personaggio[] partecipanti;
    private int numPartecipanti;

    // Costruttore con modalità
    public Combattimento(Modalita modalita) {
        this.modalita = modalita;
        this.partecipanti = new Personaggio[4];
        this.numPartecipanti = 0;
    }


    // Metodo per aggiungere un personaggio ai partecipanti del combattimento
    public void aggiungiPartecipante(Personaggio personaggio) {
        if (numPartecipanti < 4) {
            partecipanti[numPartecipanti++] = personaggio;
        } else {
            System.out.println("Numero massimo di partecipanti raggiunto.");
        }
    }

    // Metodo per rimuovere un personaggio dai partecipanti al combattimento
    public void rimuoviPartecipante(Personaggio personaggio) {
        for (int i = 0; i < numPartecipanti; i++) {
            if (partecipanti[i] == personaggio) {
                for (int j = i; j < numPartecipanti - 1; j++) {
                    partecipanti[j] = partecipanti[j + 1];
                }
                partecipanti[numPartecipanti - 1] = null;
                numPartecipanti--;
                return;
            }
        }
    }

    // Metodo per attaccare un personaggio avversario
    public void attacco(Personaggio attaccante, Personaggio target) {
        attaccante.colpisci(target);
    }

    public Modalita getModalita() {
        return modalita;
    }

    public void setModalita(Modalita modalita) {
        this.modalita = modalita;
    }

    public Personaggio[] getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(Personaggio[] partecipanti) {
        this.partecipanti = partecipanti;
    }

    public int getNumPartecipanti() {
        return numPartecipanti;
    }

    public void setNumPartecipanti(int numPartecipanti) {
        this.numPartecipanti = numPartecipanti;
    }

    public void stampaStatusPartecipanti(){
        for (int i = 0; i < numPartecipanti; i++) {
            partecipanti[i].stampaStatus();
        }
    }

    // Metodo toString per stampare tutte le informazioni relative al combattimento
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Modalità: ").append(modalita).append("\n");
        sb.append("Partecipanti: \n");
        for (int i = 0; i < numPartecipanti; i++) {
            sb.append("- ").append(partecipanti[i].getNome()).append("\n");
        }

        return sb.toString();
    }
}