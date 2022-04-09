package org.example.section6;

import java.util.Locale;

public class Car {
    private int doors;
    private int wheela;
    private String model;
    private String engine;
    private String colur;


    public void setModel(String model) {
        String validModel = model.toLowerCase();

        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

}
