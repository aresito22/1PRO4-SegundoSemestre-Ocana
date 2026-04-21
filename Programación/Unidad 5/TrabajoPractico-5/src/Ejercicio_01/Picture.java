package Ejercicio_01;

public class Picture {
    private String image;
    private String format;

    public Picture(String image, String format) {
        this.image = image;
        this.format = format;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        if (!image.isEmpty()) {
            this.image = image;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (!format.isEmpty()) {
            this.format = format;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    @Override
    public String toString() {
        return "Picture{" +
                "image='" + image + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
