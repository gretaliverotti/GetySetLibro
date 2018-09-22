/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author Greta
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Libro mc = new Libro();
    
        mc.setnombre("El perfume");
        mc.setaño(1985);
        mc.setautor("Patrick Suskind");
        mc.setgenero("Horror, misterio, realismo mágico");
        
        System.out.println(mc.getnombre());
        System.out.println(mc.getaño());
        System.out.println(mc.getautor());
        System.out.println(mc.getgenero());
        
    
    }
    
    
    
}
