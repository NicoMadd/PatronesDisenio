package src;

public class CondicionOR implements Condicion{
    Condicion condicionA;
    Condicion condicionB;

    @Override
    public void cumpleCondicion() {
        return false;
    }
}
