/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 * Laboratorio #1
 * @author Matias
 */
public class MainClass {
    
    
    public static void main(String[] args) {
        Cuenta cliente1 = new Cuenta("Matias Mollo", "23432434", 0.03, 10000);
        Cuenta cliente2 = new Cuenta("Nicolas Schnatz", "4335345", 0.03, 10000);
        
        System.out.println(cliente1.getSaldo());
        System.out.println(cliente2.getSaldo());
        
        cliente1.transferencia(cliente2, 5000);
        cliente1.ingreso(200);
        cliente2.reintegro(200);
        
        System.out.println(cliente1.getNombre() + " saldo -> " + cliente1.getSaldo());
        System.out.println(cliente2.getNombre() + " saldo -> " + cliente2.getSaldo());
        
        
        
    }


    
}
