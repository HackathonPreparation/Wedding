package gr.newbies.qrwedding.models.dtos;

import java.util.UUID;

public class VisitorCreationDTO {
    private String name;
    private UUID eventUUID;

    public String getName() {
        return name;
    }

    public UUID getEventUUID() {
        return eventUUID;
    }
}
