package gr.newbies.qrwedding.models.dtos;

public class EventUpdateDTO {
    private int Seats;
    private String uuid;
    private String name;
    private String comment;

    public String getUuid() {
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
