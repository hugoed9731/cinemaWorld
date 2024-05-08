package cine;

import cine.model.Film;

import java.util.HashMap;
import java.util.Map;

// aqui toda la logica
public class CinemaApp {
    private Map<Integer, Film> films;
    private int nextId;

    public CinemaApp() {
        this.films = new HashMap<>(); // java 7 type inference
        this.nextId = 1;
    }
}
