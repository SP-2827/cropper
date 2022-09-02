package de.f0rce.cropper.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import de.f0rce.cropper.Cropper;

@DomEvent("cropper-move")

public class CropperMoveEvent extends ComponentEvent<Cropper> {

    public CropperMoveEvent(final Cropper source, boolean fromClient) {
        super(source, fromClient);
    }
}
