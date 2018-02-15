/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta_bancaria;

/**
 *
 * @author Estudiante
 */
public class Cuenta_Bancaria {
    //Atributos
    int numero_cuenta;
    int clave;
    String dueño;
    int saldo;
    //Métodos
    public void retirar(int monto){
        this.saldo=saldo-monto;
    }
    public void consignar(int monto){
        this.saldo=saldo+monto;
    }
    public void cambiar_contraseña(int new_password){
        this.clave=new_password;
    }
    public void consultar(){
        System.out.println("Su saldo actual es de "+this.saldo);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
