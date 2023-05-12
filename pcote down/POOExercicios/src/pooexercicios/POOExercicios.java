
package pooexercicios;

public class POOExercicios {

    public static void main(String[] args) {
       
        
        ContaBanco c1 = new ContaBanco ();
        
        c1.abrirConta("CC");
        c1.setnumConta(1111);
        c1.setdono("jubila");
        c1.depositar(300f);
        
        
        
        
        ContaBanco c2 = new ContaBanco ();
        c2.setnumConta(00);
        c2.setdono("Creuza");
        c2.abrirConta("CP");
        c2.depositar(500f);
        
        
        
        
        
        
        c1.estadoAtual();
        c2.estadoAtual();
    }
    
}
