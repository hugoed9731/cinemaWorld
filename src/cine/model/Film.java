package cine.model;

import enums.Genre;

import java.util.List;

public class Film {
    private String title;
    private Genre genre;
    private Long duration;
    private List<String> actors;
    private String Synopsis;
    private String Director;
    private Theatre theatre;
    private List<Schedule> schedules;
}
