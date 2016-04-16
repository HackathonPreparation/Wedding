package gr.newbies.qrwedding.models.dtos;

import java.util.UUID;

public class EventUpdateDTO {
    private int Seats;
    private UUID uuid;
    private String name;
    private String comment;

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public int getSeats() {
        return Seats;
    }
}
