package eud.sm.repository;

import eud.sm.dto.Product;
import eud.sm.frame.SmRepository;

import java.sql.Connection;
import java.util.List;

public class ProductRepository implements SmRepository<Product, Integer> {
    @Override
    public void insert(Product product, Connection conn) throws Exception {

    }

    @Override
    public void update(Product product, Connection conn) throws Exception {

    }

    @Override
    public void delete(Integer integer, Connection conn) throws Exception {

    }

    @Override
    public List<Product> selectAll(Connection conn) throws Exception {
        return List.of();
    }

    @Override
    public Product select(Integer integer, Connection conn) throws Exception {
        return null;
    }
}
