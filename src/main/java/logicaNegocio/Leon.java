package logicaNegocio;

public class Leon {
    // TODO: Aquí va tu código
    public static class Leon extends Animal {
private TipoHabitat habitat;


public Leon() {
this.habitat = TipoHabitat.TERRESTRE;
}

@Override
public String emitirSonido() {
return "Rugido";
}

@Override
public String obtenerDieta() {
return "Carnivoro";
}

public TipoHabitat getHabitat() {
return habitat;
}
}

}
