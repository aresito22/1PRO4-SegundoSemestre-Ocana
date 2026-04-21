package Ejercicio_01;

public class Passport {
    private String number;
    private String issueDate;
    private Picture picture; // Required for getPicture()
    private Person holder;   // Required for getHolder()

    // Using composition for Picture and aggregation for Person
    public Passport(String number, String issueDate, Person holder, String imagePath, String imageFormat) {
        this.number = number;
        this.issueDate = issueDate;
        this.holder = holder;
        this.picture = new Picture(imagePath, imageFormat);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (!number.isEmpty()) {
            this.number = number;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        if (!issueDate.isEmpty()) {
            this.issueDate = issueDate;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public Picture getPicture() {
        return picture;
    }

    public Person getHolder() {
        return holder;
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "number='" + number + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", holder=" + (holder != null ? holder.getName() : "N/A") +
                ", picture=" + picture +
                '}';
    }
}