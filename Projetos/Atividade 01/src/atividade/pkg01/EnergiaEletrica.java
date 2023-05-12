
package atividade.pkg01;

import javax.swing.JOptionPane;


public class EnergiaEletrica {
    
    private double consumo,fornecimento,icms, cofins, pispasesp, icmscofins, icmspispasesp, fatura;
    
    public EnergiaEletrica (double consumo) {
        this.consumo = consumo;
        
        
  
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getFornecimento() {
        return fornecimento;
    }

    public void setFornecimento(double fornecimento) {
        this.fornecimento = fornecimento;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        
            this.icms =icms;
        
    }

    public double getCofins() {
        return cofins;
    }

    public void setCofins(double confins) {
        this.cofins = confins;
    }

    public double getPispasesp() {
        return pispasesp;
    }

    public void setPispasesp(double pispasesp) {
        this.pispasesp = pispasesp;
    }

    public double getIcmscofins() {
        return icmscofins;
    }

    public void setIcmscofins(double icmscofins) {
        this.icmscofins = icmscofins;
    }

    public double getIcmspispasesp() {
        return icmspispasesp;
    }

    public void setIcmspispasesp(double icmspispasesp) {
        this.icmspispasesp = icmspispasesp;
    }

    public double getFatura() {
        return fatura;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
    }
    
    public void CalcularValor (double consumo) {
        
        this.setFornecimento(consumo * 0.28172);
        
        if ( consumo <= 200) {
            this.setCofins(fornecimento * 0.136363);
            this.setIcms(fornecimento * 0.0614722);
            this.setIcmscofins(fornecimento * 0.0614722 * 0.0136363);
            this.setPispasesp(fornecimento * 0.013346);
            this.setIcmspispasesp(fornecimento * 0.013346 * 0.0136363);
            
        } 
        else {
            
            this.setCofins(fornecimento * 0.0730751 );
            this.setIcms(fornecimento * 0.333333);
            this.setIcmscofins(fornecimento * 0.0730751 * 0.333333);
            this.setPispasesp(fornecimento * 0.0158651);
            this.setIcmspispasesp(fornecimento * 0.0158651 * 0.333333);
        }
   
        this.setFatura(fornecimento + icms + cofins +icmscofins + pispasesp + icmspispasesp);
        
     String valores = "Fornecimento " +this.getFornecimento() + "icms " + this.getIcms() +
             "cofins" + this.getCofins() + "Icms COFINS" + this.getIcmscofins() + "Pis pasesp" +
             this.getPispasesp() + "icms pis pasesp" + this.getIcmspispasesp() + "Fatura" +
             this.getFatura();
     JOptionPane.showMessageDialog(null, valores);
     
     
    
    }
    
    
}
