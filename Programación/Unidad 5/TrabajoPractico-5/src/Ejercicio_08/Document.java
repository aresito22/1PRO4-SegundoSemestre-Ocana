package Ejercicio_08;

public class Document {
    private String title;
    private String content;
    private DigitalSignature signature;
    private User user;

    public Document(String title, String content, User user, String hash, String date) {
        this.title = title;
        this.content = content;
        this.user = user;
        this.signature = new DigitalSignature(hash, date);
    }

    public String getTitle() {
        return title;
    }

    public DigitalSignature getSignature() {
        return signature;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Document{title='" + title + "', user=" + user + ", signature=" + signature + "}";
    }
}