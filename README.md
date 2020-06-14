# Cloud_Image_Gallery_Host

This is Spring Boot application implementing Spring Security.

Main purpose is to let admin upload image and let user to see what was uploaded.
Uploaded image links are persisted in mysql database.
Threshold of uploaded images is dependent of Cloudinary limitations.

There are two roles available user and admin (hardcoded in WebSecurityConfig.java class).
If you want to add users you have to implement custom sign in form.

Application uses Vaadin for simple Gui implementation.

## Requirements:
1. Accout on: https://cloudinary.com/
2. Set up local or remote DB
(if remote i would recommend https://remotemysql.com/)

Check application.properties fill the gaps basing on your profiles on above pages.
