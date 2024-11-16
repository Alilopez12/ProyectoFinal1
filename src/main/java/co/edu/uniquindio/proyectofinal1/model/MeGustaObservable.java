package co.edu.uniquindio.proyectofinal1.model;

import co.edu.uniquindio.proyectofinal1.service.MeGustaObserver;

import java.util.ArrayList;
import java.util.List;

public class MeGustaObservable {
    private int cantidadMeGusta = 0;
    private final List<MeGustaObserver> observers = new ArrayList<>();

    public void agregarObserver(MeGustaObserver observer) {
        observers.add(observer);
    }

    public void eliminarObserver(MeGustaObserver observer) {
        observers.remove(observer);
    }

    public void notificarObservers() {
        for (MeGustaObserver observer : observers) {
            observer.update(cantidadMeGusta);
        }
    }

    public void incrementarMeGusta() {
        cantidadMeGusta++;
        notificarObservers();
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }
}

