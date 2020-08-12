package src;

public abstract class IngenieroBase {
    Integer pisos;
    Integer altura;
    Boolean patio;
    Integer nivelDeSeguridad;

    public Edificio construir() {
        return new Edificio(cantidadPisos(),altura(),tienePatio(),nivelDeSeguridad());
    }

    protected abstract Integer cantidadPisos();
    protected abstract Integer altura();
    protected abstract Integer nivelDeSeguridad();
    protected abstract Boolean tienePatio();
}
