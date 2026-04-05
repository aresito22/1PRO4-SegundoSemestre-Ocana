public class Personaje {
    private String nombre;
    private int nivel;
    private int puntoVida;
    private boolean isDerrotado;
    private int id;
    private static int totalPersonajes = 0;

    //Constructor

    public Personaje(String nombre, int nivel, int puntosVida){
        this.setNombre(nombre);
        this.setNivel(nivel);
        this.setPuntoVida(puntosVida);
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntoVida() {
        return puntoVida;
    }

    public boolean getiIsDerrotado(){
        return isDerrotado;
    }

    public int getId() {
        return id;
    }

    public static int getTotalPersonajes() {
        return totalPersonajes;
    }

    //Setters


    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Nombre invalido.");
        }
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 100) {
            this.nivel = nivel;
        } else {
            System.out.println("nivel invalido");
        }
    }

    public void setPuntoVida(int puntoVida) {
        if (nivel >= 0 && nivel <= 100) {
            this.puntoVida = puntoVida;
        } else {
            System.out.println("nivel invalido");
        }
    }

    //Metodos

    private int generarId() {
        totalPersonajes++;
        return  totalPersonajes;
    }

}

