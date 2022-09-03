package de.f0rce.cropper.events;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import de.f0rce.cropper.Cropper;

import java.io.IOException;

@DomEvent("cropper-move")

public class CropperMoveEvent extends ComponentEvent<Cropper> {

    private final String data;
    private JsonNode dataNode;
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public CropperMoveEvent(final Cropper source, boolean fromClient,     @EventData("event.detail.data") String data) throws IOException {
        super(source, fromClient);
        this.data = data;
        this.dataNode = MAPPER.readTree(data);
    }

    public String getData() {
        return data;
    }
    public JsonNode getDataNode() {
        return this.dataNode;
    }
}
