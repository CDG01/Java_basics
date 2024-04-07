package DesignPattern.FactoryPattern_Shapes;

// spesso, la Factory contiene metodi statici

public class ShapeFactory {
    // metodo principe della factory: metodo che restituisce un istanza di una delle classi che implemntano l'interfaccia Shape (l'alternativa era: istanza di una delle sottoclassi della superclasse Shape)
    // in base a un input, che in questo caso è un enum (ma poteva essere anche una String)
    // un metodo unico per creare istanze di tipi "simili ma diversi"

    public Shape istanziazoreDiForme (ShapeTypes shapeType) {
        return switch (shapeType){
            case TRIANGLE ->  new Triangle();
            case RECTANGLE ->  new Rectangle();
        };
    }
}
