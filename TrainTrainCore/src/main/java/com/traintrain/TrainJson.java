package com.traintrain;

import java.util.ArrayList;
import java.util.List;

public class TrainJson {
    public List<SeatJson> seats;

    public TrainJson() {
        this.seats = new ArrayList<SeatJson>();
    }
}
