
package AcoesVideo;


public class Video implements AcoesVideo {
   private String titulo;
   private int curtidas, views, avaliaçao ;
   private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliaçao = 1;
        this.views = 0;
        this.curtidas=0;
        this.reproduzindo= false;
        
        
    }

   
   
   
   
   
   @Override
   public void play() {
       this.reproduzindo = true;
       
   }
   @Override
   public void pause() {
       this.reproduzindo = false;
   }
   @Override
   public void like() {
       this.curtidas ++;
   }
   
   
   
   
   
   
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliaçao() {
        return avaliaçao;
    }

    public void setAvaliação(int avaliacao) {
        int novaava;
        novaava = (int) ((this.avaliaçao + avaliacao)/this.views);
        
        this.avaliaçao = novaava;
        
        
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", curtidas=" + curtidas + ", views=" + views + ", avalia\u00e7ao=" + avaliaçao + ", reproduzindo=" + reproduzindo + '}';
    }
   
}
