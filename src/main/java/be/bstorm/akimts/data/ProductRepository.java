package be.bstorm.akimts.data;

import be.bstorm.akimts.model.Produit;

import java.util.List;

public interface ProductRepository {

    List<Produit> getAll();

    Produit getOne(long id);

    boolean delete( long id );

    boolean insert( long id );

    boolean update( long id, Produit produit );

}
