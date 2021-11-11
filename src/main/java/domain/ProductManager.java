package domain;

public class ProductManager {
    private Product[] products= new Product[0];
    public void add(Product product) {
        int length = products.length + 1;
        Product[] tmp = new Product[length];

        System.arraycopy(products, 0, tmp, 0, products.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = product;
        products = tmp;
    }


}
