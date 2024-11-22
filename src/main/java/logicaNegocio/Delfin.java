package logicaNegocio;

public class Delfin {
    // TODO: Aquí va tu código

public static class Delfin extends Animal {
private TipoHabitat habitat;


public Delfin() {
this.habitat = TipoHabitat.ACUATICO;
}

@Override
public String emitirSonido() {
return "Chillido";
}

@Override
public String obtenerDieta() {
return "Pescado";
}

public TipoHabitat getHabitat() {
return habitat;
}
}

public interface Domestico {
String interactuarConHumano();
}


}
