
package poo05;


public class POO05 {

    
    public static void main(String[] args) {
        
        
        Pessoa [] p = new Pessoa [2];
        Livro [] l = new Livro [3];
        
         p[0] = new Pessoa ("João",15,"M");
         p[1] = new Pessoa ("Maria", 17, "F");
         l[0] = new Livro ("NeuroMancer", "Willian Gibson", 500 , p[0]);
         l[1] = new Livro (" A politica Sexual da carne", "Carol Adans", 500, p[1]);
         
         System.out.println(l[0].detalhes());
         
         
         
        
    }
    
}
