package logicaNegocio;

public abstract class Animal {
    // TODO: Aquí va tu código
public class Zoologico {

public static abstract class Animal {
public abstract String emitirSonido();
public abstract String obtenerDieta();
}

public enum TipoHabitat {
ACUATICO,
TERRESTRE,
AEREO
}




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



public static void main(String[] args) {
Leon leon = new Leon();
Delfin delfin = new Delfin();
Perro perro = new Perro();

System.out.println("León:");
System.out.println("El Sonido del León es: " + leon.emitirSonido());
System.out.println("La Dieta del Leon es: " + leon.obtenerDieta());
System.out.println("El Hábitat del leon es: " + leon.getHabitat());
System.out.println();

System.out.println("Delfín:");
System.out.println("El Sonido del delfin: " + delfin.emitirSonido());
System.out.println("La Dieta del delfin: " + delfin.obtenerDieta());
System.out.println("El Hábitat del delfin es: " + delfin.getHabitat());
System.out.println();

System.out.println("Perro:");
System.out.println("El Sonido del perro es: " + perro.emitirSonido());
System.out.println("La Dieta del pérro es: " + perro.obtenerDieta());
System.out.println("El Hábitat del perro: " + perro.getHabitat());
System.out.println("Interacción con humanos: " + perro.interactuarConHumano());
}
}
}



