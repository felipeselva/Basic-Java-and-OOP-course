
package AcoesVideo;


public class ExerciciosPOO {

   
    public static void main(String[] args) {
        
        
        Video v [] = new Video [3];
         v[0] = new Video("aula 1 de POO");
         v[1] = new Video ("Aula 2");
         v[2] = new Video ("Aula 3");
         System.out.println(v[0].toString());
         
         internauta i[] = new internauta[2];
        
         i[1] = new internauta ("roger", "guedes", "M", 22,0);
         i[0] = new internauta ("juba", "Jubas", "m", 22, 0);
         
         System.out.println(i[0].toString());
         
         Visualizacao vis [] = new Visualizacao[2];
         vis[0] = new Visualizacao (i[0], v[2]);
         vis[0].avaliacao();
         System.out.println(vis[0].toString());
         vis[1] = new Visualizacao (i[0], v[1]);
         vis[0].avaliacao(10);
         
         System.out.println(i[0].toString());
         
         
         
         
         
         
        
    }
    
}
