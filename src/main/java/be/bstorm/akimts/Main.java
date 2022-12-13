package be.bstorm.akimts;

import be.bstorm.akimts.data.ProduitDAO;
import be.bstorm.akimts.utils.ConnectionFactory;

import java.sql.*;

public class Main {
    public static void main(String[] args) {


        ProduitDAO dao = new ProduitDAO();

        dao.getAll();

        dao.delete(40);

        dao.getAll();

    }
}