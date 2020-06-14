package com.image.uploader.demo.gui;

import com.image.uploader.demo.ImageUploader;
import com.image.uploader.demo.model.ImageAddress;
import com.image.uploader.demo.repo.ImageRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("upload")
public class UploadGui extends VerticalLayout {

    private ImageUploader imageUploader;
    private ImageRepository imageRepository;

    @Autowired
    public UploadGui(ImageUploader imageUploader, ImageRepository imageRepository) {
        this.imageUploader = imageUploader;
        this.imageRepository = imageRepository;

        Label label = new Label();
        TextField textField = new TextField();
        Button button = new Button("upload");

        buttonClickHandler(imageUploader, imageRepository, label, textField, button);

        add(textField);
        add(button);
    }

    private void buttonClickHandler(ImageUploader imageUploader, ImageRepository imageRepository, Label label, TextField textField, Button button) {
        button.addClickListener(buttonClickEvent -> {
            String imageUrl = imageUploader.uploadFile(textField.getValue());
            persistToDatabase(imageRepository, imageUrl);
            Image image = new Image(imageUrl, "There is no image");
                label.setText("Image has been uploaded");
                add(label);
                add(image);
        });
    }

    private void persistToDatabase(ImageRepository imageRepository, String imageUrl) {
        imageRepository.save(new ImageAddress(imageUrl));
    }

}
