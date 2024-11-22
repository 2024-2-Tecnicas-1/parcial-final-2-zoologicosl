package logicaNegocio;

public class Perro {
    // TODO: Aquí va tu código
    public static class Perro extends Animal implements Domestico {
private TipoHabitat habitat;

public Perro() {
this.habitat = TipoHabitat.TERRESTRE;
}

@Override
public String emitirSonido() {
return "Ladrido";
}

@Override
public String obtenerDieta() {
return "Omnívoro, proteinas de las carnes ";
}

@Override
public String interactuarConHumano() {
return "El perro mueve la cola y ladra de felicidad";
}

public TipoHabitat getHabitat() {
return habitat;
}
    }

    }
