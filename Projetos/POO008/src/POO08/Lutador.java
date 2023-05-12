
package POO08;


public class Lutador {
    private String nome,nacionalidade,categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura,peso;
    

    public void construtor (String no,String na, int id, float alt,float pe, int vi, int de, int em) 
   
    { 
           this.nome = no;
           this.nacionalidade =na;
           this.idade = id;
           this.altura = alt;
           this.peso=pe;
           this.vitorias=vi;
           this.derrotas=de;
           this.empates=em;
    }
    
    
    public void apresentarLutador () {
        
        System.out.println("Lutador " + this.getNome());
        System.out.println("Altura " + this.getAltura());
        System.out.println(" Vindo do " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " de idade ");
        System.out.println("Pesando " + this.getPeso() + " Kg");
        System.out.println(" Conquistou " + this.getVitorias() + " Vitorias");
        System.out.println(" Amargou " + this.getDerrotas() + " Derrotas");
        System.out.println(" E teve " + this.getEmpates() + " Empates " );

}
    

public void status () {
    System.out.println("Lutador " + this.getNome());
    System.out.println(" Conquistou " + this.getVitorias() + " Vitorias");
        System.out.println(" Amargou " + this.getDerrotas() + " Derrotas");
        System.out.println(" E teve" + this.getEmpates() + "Empates" );
}

public void ganharLuta() {
   this.setVitorias(this.getVitorias() + 1);
    
                                                                                            
}

public void perderLuta() {
    
        
        this.setDerrotas( this.getDerrotas() + 1);
    

}

public void empatarLuta () {
    
    this.setEmpates(this.getEmpates() + 1);
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
       if (peso < 52.2) {
           this.categoria = " Categoria Invalida" ;
    }
           
       else if (peso <= 70.3) {
           this.categoria = "Categoria leve" ;
                   }
       else if ( peso < 83.9) {
           this.categoria = "Categoria medio " ; }
           
           else if ( peso <=120.2) {
               this.categoria = "Categoria Pesado" ; }
           
           else {
               this.categoria = "Invalido";
               
           }
       
       
           }
    

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
        
    }}






