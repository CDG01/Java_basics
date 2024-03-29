package Exceptions_ProdottiSupermercatoi.models;


public class ScadenzaProdottoException extends Exception{
    public ScadenzaProdottoException(){
        super("Prodotto scaduto");
    }

}