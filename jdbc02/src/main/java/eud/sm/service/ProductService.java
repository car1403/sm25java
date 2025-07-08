package eud.sm.service;

import eud.sm.dto.Product;
import eud.sm.frame.SmRepository;
import eud.sm.frame.SmService;

import java.util.List;

public class ProductService implements SmService<Product, Integer> {
    @Override
    public void register(Product product) throws Exception {

    }

    @Override
    public void modify(Product product) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public List<Product> get() throws Exception {
        return List.of();
    }

    @Override
    public Product get(Integer integer) throws Exception {
        return null;
    }
}
