package Objetos;

public abstract class Cantante{
    static Integer nPresentacion= 0;
    public void cantar(){
        System.out.println("Me Presento... soy la presentacion numero " + ++nPresentacion + " " + presentacion());
    }

    protected abstract String presentacion();
}
