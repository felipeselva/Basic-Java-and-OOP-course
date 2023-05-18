
package polimorfismopoo2;


public class Cachorro extends Lobo{

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    public void EmitirSom() {
        System.out.println("au au au ");
    }
        
       public void reagir(String Frase) {
            
           if ( Frase == "positiva") {
           System.out.println(" au au au");
       }
           else {
           System.out.println("ignorado");
       }
       }
       public void reagir(boolean dono) {
           
           if ( dono == true) {
           System.out.println(" au au au");
       }
           else {
           System.out.println("ignorado");
       }
       }
       public void reagir (int idade, float peso) {
            
          if ( idade <= 5 || peso <= 10.0) {
           System.out.println(" au au au");
       }
           else {
           System.out.println("ignorado");
       }
       }
    }

