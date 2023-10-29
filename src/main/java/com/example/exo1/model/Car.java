package com.example.exo1.model;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private int _id;
    @Column(name = "_marque")
    private String _marque;

    @Column(name = "_model")
    private String _model;

    @Column(name = "_puissance")
    private String _puissance;

    public Car(int id, String marque, String model, String puissance) {
        this._id = id;
        this._marque = marque;
        this._model = model;
        this._puissance = puissance;
    }

    public Car(){

    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String get_marque() {
        return _marque;
    }

    public void set_marque(String _marque) {
        this._marque = _marque;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    public String get_puissance() {
        return _puissance;
    }

    public void set_puissance(String _puissance) {
        this._puissance = _puissance;
    }
}
