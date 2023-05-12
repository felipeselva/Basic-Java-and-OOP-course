





package Controlador;





public class ControleRemoto implements Control {
    
    private boolean ligado;
    private int volume;
    private boolean tocando;

    public ControleRemoto (boolean ligado, int volume) {
        this.setLigado(false);
        this.setVolume (50);
        this.setTocando (false);
    }

    ControleRemoto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public void ligar(){ 
        if (this.getLigado() == false) {
            this.setLigado(true);
        }
    
}
    public void desligar(){
    if (this.getLigado()) {
        this.setLigado(false);
    }
}
    public void abrirMenu(){
    if (this.getLigado()) {
        System.out.println("O volume é " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+= 10) {
        
        System.out.println("|");
    }
    }
}
    public void fecharMenu(){
        System.out.println("Fechando Menu");
}
    public void maisVolume(){
        if ( this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    
}
    public void menosVolume(){
        if (this.getLigado()) {
            this.setVolume (this.getVolume() - 5 );
        }
    
}
    public void ligarMudo(){ 
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume (0);
            
        }
        
    }
    public void desligarMudo(){
        if (this.getVolume () == 0) {
            this.setVolume(this.getVolume() +1);
        }
        
    }
    public void play(){
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        }
        
    }
    public void pause(){
        if ( this.getLigado() && this.getTocando()) {
            this.setLigado(false);
        }
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
}
