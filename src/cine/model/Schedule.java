package cine.model;

import java.util.Date;

public class Schedule {
    private String startHour;
    private String endHour;
    private int duration;
    private Date date;

    public Schedule(String startHour, String endHour, int duration) {
        this.startHour = startHour;
        this.endHour = endHour;
        this.duration = duration;
    }
}
