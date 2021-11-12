package domain;

import org.junit.jupiter.api.Test;
import repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private Product first = new Book(1,"Lion",50,"King");
    private Product second = new Book(2,"Window",33,"Lee");
    private Product third = new Smartphone(3,"Huawei",300,"China");

    @Test
    void shouldSearchBy1() {
        ProductManager productManager = new ProductManager();

        ProductManager.add(first);
        ProductManager.add(second);
        ProductManager.add(third);

        Product[] actual = ProductManager.searchBy("King");
        Product[] expected= new Product[]{first};
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldSearchBy2() {
        ProductManager productManager = new ProductManager();

        ProductManager.add(first);
        ProductManager.add(second);
        ProductManager.add(third);

        Product[] actual = ProductManager.searchBy("Lion");
        Product[] expected= new Product[]{first};
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldSearchBy3() {
        ProductManager productManager = new ProductManager();

        ProductManager.add(first);
        ProductManager.add(second);
        ProductManager.add(third);

        Product[] actual = ProductManager.searchBy("Huawei");
        Product[] expected= new Product[]{third};
        assertArrayEquals(expected,actual);
    }
    @Test
    void shouldSearchBy4() {
        ProductManager productManager = new ProductManager();

        ProductManager.add(first);
        ProductManager.add(second);
        ProductManager.add(third);

        Product[] actual = ProductManager.searchBy("China");
        Product[] expected= new Product[]{third};
        assertArrayEquals(expected,actual);
    }
    @Test
    void shouldSearchBy5() {
        ProductManager productManager = new ProductManager();

        ProductManager.add(first);
        ProductManager.add(second);
        ProductManager.add(third);

        Product[] actual = ProductManager.searchBy("Road");
        Product[] expected= new Product[0];
        assertArrayEquals(expected,actual);
    }
}