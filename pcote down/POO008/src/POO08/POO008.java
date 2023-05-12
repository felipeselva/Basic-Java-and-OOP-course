
package POO08;

/**
 *
 * @author Meu Computador
 */
public class POO008 {

    
    public static void main(String[] args) {
        
        Lutador l [] = new Lutador [5];
        
       
        l[0] = new Lutador ();
        l[0].setNome("Pretty Boy");
        l[0].setNacionalidade ("França");
        l[0].setIdade(31);
        l[0].setAltura (1.20f);
        l[0].setPeso ( 68.8f);
        l[0].setVitorias(5);
        l[0].setDerrotas(2);
        l[0].setEmpates(3);
        
       
        l[1] = new Lutador ();
        l[1].setNome("PutsScript");
        l[1].setNacionalidade ("Brasil");
        l[1].setIdade(29);
        l[1].setAltura (1.68f);
        l[1].setPeso ( 57.8f);
        l[1].setVitorias(14);
        l[1].setDerrotas(2);
        l[1].setEmpates(3);
        
        l[2] = new Lutador ();
        l[2].setNome("SnapShadow");
        l[2].setNacionalidade ("EUA");
        l[2].setIdade(35);
        l[2].setAltura (1.65f);
        l[2].setPeso ( 80.9f);
        l[2].setVitorias(12);
        l[2].setDerrotas(2);
        l[2].setEmpates(1);
        
        l[3] = new Lutador ();
        l[3].setNome("DeadCode");
        l[3].setNacionalidade ("Australia");
        l[3].setIdade(28);
        l[3].setAltura (1.93f);
        l[3].setPeso ( 81.6f);
        l[3].setVitorias(13);
        l[3].setDerrotas(0);
        l[3].setEmpates(2);
        
        
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.Lutar();
        
        
    }
    
}
