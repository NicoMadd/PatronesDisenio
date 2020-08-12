package src;

public class CondicionAND implements Condicion{
    Condicion condicionA;
    Condicion condicionB;

    @Override
    public void cumpleCondicion() {
        return false;
    }
}
