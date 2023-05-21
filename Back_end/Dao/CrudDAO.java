
package Dao;

import java.util.ArrayList;
import java.util.List;

public interface CrudDAO<T, ID> extends SuperDAO{
    
    public boolean save(T entity) throws Exception;
    
    public boolean update(T entity) throws Exception;
    
            public boolean delete(ID key)throws Exception;
    
    public T find(ID key) throws Exception;

    public List<T> findAll() throws Exception;        
    
}
    