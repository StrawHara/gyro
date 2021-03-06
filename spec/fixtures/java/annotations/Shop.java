package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmList;
import io.realm.RealmObject;

public class Shop extends RealmObject {

    public static final class Attributes {
        public static final String NAME = "name";

        private Attributes() {
            // Hide constructor
        }
    }

    public static final class Relationships {
        public static final String PRODUCTS = "products";

        private Relationships() {
            // Hide constructor
        }
    }

    private String name;
    private RealmList<Product> products;

    @android.support.annotation.NonNull
    public String getName() {
        return name;
    }

    public void setName(@android.support.annotation.NonNull final String name) {
        this.name = name;
    }

    @android.support.annotation.NonNull
    public RealmList<Product> getProducts() {
        return products;
    }

    public void setProducts(@android.support.annotation.NonNull final RealmList<Product> products) {
        this.products = products;
    }
}
