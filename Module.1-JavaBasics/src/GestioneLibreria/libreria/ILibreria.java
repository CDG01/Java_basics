package GestioneLibreria.libreria;

import GestioneLibreria.models.Libro;

public interface ILibreria {
    void aggiungiLibro(Libro libro);
    void rimuoviLibro(Libro libro);
    void visualizzaLibri();
}
