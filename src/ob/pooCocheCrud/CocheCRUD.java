package ob.pooCocheCrud;

import java.util.List;

public interface CocheCRUD {

    void save(CocheCRUDImpl cocheCRUDImpl);

    List<CocheCRUDImpl> findAll();

    void delete(CocheCRUDImpl cocheCRUDImpl);


}
