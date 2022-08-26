package wargame;

public class Tropa {
    private String nombre;
    private int daño;
    private float vida;

    public Tropa(String nombre, int daño, Float vida) {
        this.setNombre(nombre);
        this.setDaño(daño);
        this.setVida(vida);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDaño() {
        return daño;
    }
    public void setDaño(int daño) {
        this.daño = daño;
    }
    public float getVida() {
        return vida;
    }
    public void setVida(Float vida) {
        this.vida = vida;
    }
    
    public void atacar(Tropa enemigo, Escudo escudo) {
        if(this.verificarVida() == true && enemigo.verificarVida() == true){
            if (escudo != null) {
                enemigo.setVida(enemigo.getVida() - escudo.defensaXdano(this.getDaño()));
            }
            else {
                enemigo.setVida(enemigo.getVida() - this.getDaño());
            }
            
            System.out.println(this.getNombre() + " ataco a " + enemigo.getNombre() + " y le quito " + this.getDaño() + " de vida. \nLa vida de " + enemigo.getNombre() + " es " + enemigo.getVida());
        }
        else{
            System.out.println(this.getNombre() + " no puede atacar a "+ enemigo.getNombre() + " porque esta muerto");
        }
        
}
    
    public boolean verificarVida(){
        if(this.getVida() <= 0){
            System.out.println("La tropa " + this.getNombre() + " ha muerto");
            return false;
        }
        else{
            return true;
        }
    }
    
}
