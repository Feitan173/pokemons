package com.company;

public class Pokemon {

    private String nombre;
    private int vida;


    public Pokemon(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int atacar(){
        int damage = (int) Math.random()*10+10;
        if (critico()){
            damage = (int) (damage*1.5);
            System.out.println("Daño critico:"+ damage);
            return damage;
        }
        System.out.println("Daño critico:"+ damage);
        return damage;
    }
    private boolean critico(){
        boolean critic;
        int random =((int)  Math.random()*100);
        return random %10==0;

    }

public void perderVida(int damage){
        vida -=damage;


}
public void imprimir(){

    System.out.println("nombre:"+nombre);
    System.out.println("vida:"+vida);
}


}
