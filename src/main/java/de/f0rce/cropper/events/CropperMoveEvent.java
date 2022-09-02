package de.f0rce.cropper.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import de.f0rce.cropper.Cropper;

@DomEvent("cropper-move")

public class CropperMoveEvent extends ComponentEvent<Cropper> {

    private final String data;

    public CropperMoveEvent(final Cropper source, boolean fromClient,     @EventData("event.detail.data") String data) {
        super(source, fromClient);
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
