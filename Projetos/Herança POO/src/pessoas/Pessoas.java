
package pessoas;


public class Pessoas {


    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("maria");
        p2.setNome("charles");
        p3.setNome("Vinicius");
        p4.setNome("Rosangela");
        
        p1.setIdade(30);
        
        
        System.out.println(p1.toString());
        System.out.println(p3.toString());
        
        
    }
    
}
