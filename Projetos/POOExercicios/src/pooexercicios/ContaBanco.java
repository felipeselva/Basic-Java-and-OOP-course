
package pooexercicios;

import javax.swing.JOptionPane;


public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    
    public ContaBanco () {
        this.saldo = 0;
        this.status = false;

}
//
    public void estadoAtual () {
        
        System.out.println("Conta " + this.getnumConta());
        System.out.println("Tipo " + this.gettipo());
        System.out.println("Dono " + this.getdono());
        System.out.println(" Saldo " +this.getsaldo());
        System.out.println(" Status " + this.getstatus());
    }
   public void abrirConta (String t) {
       this.settipo (t);
       if (t.equals("CC")) {
           this.setsaldo (50.00f);
           this.setstatus (true);
       } else if (t.equals("CP")) {
              this.setsaldo (150.00f);
       this.setstatus (true);
       }
   }
 //public void abrirConta (boolean CC) {
        //JOptionPane.showInputDialog(null, "Qual tipo de conta quer criar ? CC ou CP");
        
        //if (CC == true) {
           //saldo =+ 50.00f;
           //this.tipo = "Conta Corrente";
       //} else {
            //saldo =+ 150.00f;
            //this.tipo = "Conta Poupança";
   
    public void fecharConta () {
        if ( saldo > 0) {
            System.out.println("Você precisa sacar o valor em conta antes de encerrar ");
        } else if (saldo < 0) {
            System.out.println("Você possui pendencias");
        } else {
            System.out.println("Conta encerrada");
        }
     
 }   
 
 
 public void depositar (float d) { 
   if (this.getstatus ()) {
       
   
     this.setsaldo (this.getsaldo () +d);
       System.out.println("Deposito realizado na conta de " +this.getdono());
   } else {
       System.out.println("Não foi possivel realizar o deposito na conta de " + this.getdono());
   }
 }
 
 
 
 public void sacar (float sq) {
     if (this.getstatus () && this.getsaldo () >= sq) {
         this.setsaldo(this.getsaldo() - sq);
         System.out.println("Saque realziado com sucesso");
     } else { System.out.println("Não foi possivel realizar o saque");
     
 }
 
 }
 public void pagarMensal () {
    int p;
     if (this.getstatus() && this.gettipo().equals("CC")) { 
        p = 12;
      if (this.getsaldo() > p) {
    this.setsaldo(this.getsaldo() - p);
    } 
     else if (this.getstatus () && this.gettipo().equals("CP")) {
            p = 20;
            if (this.getsaldo() > p) {
    this.setsaldo(this.getsaldo() - p);
        }
    }  }
    
     
 }


public int getnumConta () {
    
    return numConta;
}

public void setnumConta (int n) {
    this.numConta = n;
}

public String gettipo () {
    
    return tipo;
}

public void settipo ( String t) {
    this.tipo = t;
}

public String getdono () {
    
    return dono;
}

public void setdono (String d) {
    this.dono = d;
}

public float getsaldo () {
    
    return saldo;
}

public void setsaldo (float s) {
    this.saldo = s;
}

public boolean getstatus () {
    
    return status;
}
public void setstatus (boolean st) {
    this.status = st;
    
}




}

