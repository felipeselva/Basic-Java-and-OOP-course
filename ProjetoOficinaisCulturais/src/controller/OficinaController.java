
package controller;

import java.util.ArrayList;
import model.Oficina;
public class OficinaController {
    
    
    public ArrayList<Oficina> buscarOficinas() {
        Persistencia persistencia = new Persistencia();
        return persistencia.importarOficinas("oficinas.txt");
    }
    
    public void salvarAlteracoes(ArrayList<Oficina> listaOficinas) {
    Persistencia persistencia = new Persistencia();
   
    persistencia.salvarAlteracoesOficinas(listaOficinas, "oficinas.txt");
}
}
