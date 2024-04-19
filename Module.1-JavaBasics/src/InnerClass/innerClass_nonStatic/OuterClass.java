package InnerClass.innerClass_nonStatic;

// Esempio di accesso di attributi e funzioni della classe interna, dalla classe esterna,
// e di uso degli attributi della classe esterna, nella classe interna

public class OuterClass {

    private int attributoOuter;

    private void methodOuter(){
        InnerClass innerClass = new InnerClass();
        innerClass.methodInner();
        innerClass.attributoInner = 0;
    }

    private class InnerClass {
        private int attributoInner;

        public void methodInner(){ attributoOuter = 5; }
    }
}