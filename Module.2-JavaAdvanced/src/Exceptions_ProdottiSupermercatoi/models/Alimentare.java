package Exceptions_ProdottiSupermercatoi.models;

import java.util.Date;

public class Alimentare extends Prodotto {

    Date dataDiScadenza;

    public Alimentare(String nome, double prezzo, Date dataDiScadenza) throws ScadenzaProdottoException {
        super(nome, prezzo);
        this.dataDiScadenza = dataDiScadenza;
    }

    public Date getDataDiScadenza() {
        return dataDiScadenza;
    }


}
