
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Categoria;
import java.util.List;
import javax.persistence.TypedQuery;

public class CategoriaDAO extends AbstractDAO<Categoria>{
    
    public List<Categoria> buscar(){
        TypedQuery<Categoria> query = getEntityManager()
                .createQuery("SELECT c FROM Categoria c", Categoria.class);
        
        return query.getResultList();                
    }   
}
