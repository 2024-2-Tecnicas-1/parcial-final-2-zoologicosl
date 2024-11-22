package logicaNegocio;

public enum TipoHabitat {
    // TODO: Aquí va tu código

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
