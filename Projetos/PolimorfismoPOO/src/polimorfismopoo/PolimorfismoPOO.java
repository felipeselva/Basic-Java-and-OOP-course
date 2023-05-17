
package polimorfismopoo;


public class PolimorfismoPOO {

   
    public static void main(String[] args) {
       
        Mamifero m = new Mamifero ();
        Reptil r = new Reptil ();
        Peixe p = new Peixe ();
        Canguru c = new Canguru();
        GoldFish p1 = new GoldFish();
        
        
    m.setPeso(35.3f);
    m.setCorPelo("Marrom");
    
    m.locomover();
    r.locomover();
    p.locomover();
    c.locomover();
    p1.locomover();
    
    
    
}
}
