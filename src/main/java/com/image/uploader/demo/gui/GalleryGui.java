package com.image.uploader.demo.gui;

import com.image.uploader.demo.repo.ImageRepository;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("gallery")
public class GalleryGui extends VerticalLayout {

    private ImageRepository imageRepository;

    @Autowired
    public GalleryGui(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;

        imageRepository.findAll().stream()
                .forEach( element -> {
                    Image image = new Image(element.getImageAddress(), "No image");
                    add(image);
                });
    }

}
