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
public class Libro {
    private String nombre;
    private int año;
    private String autor;
    private String genero;
    
     public void setnombre(String nombrerecibido){
         
         this.nombre = nombrerecibido;
         
    }
     
         public void setaño(int añopublicacion){
         
         this.año = añopublicacion;
         
    }
         
         public void setautor(String autorlibro){
         
         this.autor = autorlibro;
         
    }
         public void setgenero(String generolibro){
         
         this.genero = generolibro;
         
    }
    
    public String getnombre(){
        
        return this.nombre;

}


    
    public int getaño(){
        
        return año;
    }
    
       public String getautor(){
        
        return this.autor;
       }
       
          public String getgenero(){
        
        return this.genero;
        }
}

       
