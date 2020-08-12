package src;

class IngenieroDeMonoblock implements IngenieroCivil{

    @Override
    public Edificio construir() {
        EdificioBuilder constructor = new EdificioBuilder();
        constructor.indicarNivelDeSeguridad(70);
        constructor.indicarPisos(40);
        constructor.tienePatio(true);
        return constructor.construir();
    }
}
