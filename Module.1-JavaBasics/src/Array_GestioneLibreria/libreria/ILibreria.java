package Array_GestioneLibreria.libreria;

import Array_GestioneLibreria.models.Libro;

public interface ILibreria {
    void aggiungiLibro(Libro libro);
    void rimuoviLibro(Libro libro);
    void visualizzaLibri();
}
