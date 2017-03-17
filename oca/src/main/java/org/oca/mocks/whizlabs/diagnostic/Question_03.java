package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 16/3/2017.
 */
public class Question_03 {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(4, "leche", Item.CATEGORY.BEBIDAS),
                new Item(3, "jaboncillo", Item.CATEGORY.ASEO),
                new Item(10, "detergente", Item.CATEGORY.ASEO),
                new Item(6, "piqueos", Item.CATEGORY.COMIDAS)
        );

        items.stream().filter(item -> item.getPrecio()>5).forEach(item -> item.setCategory(Item.CATEGORY.BEBIDAS));
        items.stream().forEach(item -> System.out.println(item.getCategory().name()));
    }
}

class Item{

    private Integer precio;
    private String descripcion;
    private CATEGORY category;

    public Item(Integer precio, String descripcion, CATEGORY category) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.category = category;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CATEGORY getCategory() {
        return category;
    }

    public void setCategory(CATEGORY category) {
        this.category = category;
    }

    enum CATEGORY{
        BEBIDAS,COMIDAS,ASEO
    }
}
