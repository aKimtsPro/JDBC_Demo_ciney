package be.bstorm.akimts.data;

import be.bstorm.akimts.model.Produit;
import be.bstorm.akimts.utils.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// DAO - Data Access Object
public class ProduitDAO implements ProductRepository{

    public List<Produit> getAll(){ // getOne

        String sql = "SELECT * FROM products";

        List<Produit> produits = new ArrayList<>();

        try(
                Connection connection = ConnectionFactory.createConnection();
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery( sql );
        ) {

            while(rs.next()){
                Produit produit = new Produit();

                produit.setId( rs.getLong( "product_id" ) );
                produit.setNom( rs.getString( "product_name" ) );
                produit.setPrix( rs.getDouble( "unit_price" ) );
                produit.setQttInStock( rs.getLong( "units_in_stock" ) );

                produits.add( produit );
            }

        }
        catch (SQLException ex){
            throw new RuntimeException("data access failed", ex );
        }
        return produits;
    }

    @Override
    public Produit getOne(long id) { // TODO this
        return null;
    }

    public boolean delete(long id){ // update, insert
        String sql = "DELETE FROM products WHERE product_id = " + id;

        try(
                Connection co = ConnectionFactory.createConnection();
                Statement statement = co.createStatement();
        ){
            return statement.executeUpdate(sql) == 1;
        }
        catch (SQLException ex){
            throw new RuntimeException("data access failed", ex );
        }
    }

    @Override
    public boolean insert(long id) {
        return false;
    }

    @Override
    public boolean update(long id, Produit produit) {
        return false;
    }

}
