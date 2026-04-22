public class Course {
    private final int ID;
    private String name;
    private int courseDuration; // En horas
    private double price;
    private static int totalCourses = 0;

    // Mensajes de error para validaciones
    private final static String ERROR_1 = "Error: campo vacío.";
    private final static String ERROR_2 = "Error: valor igual o menor a 0.";
    private final static String ERROR_3 = "Error: precio menor a 0.";

    public Course(String name, int courseDuration) {
        this(totalCourses + 1, name, courseDuration, 100);
    }

    public Course(int ID, String name, int courseDuration, double price) {
        this.ID = ID;
        setName(name);
        setCourseDuration(courseDuration);
        setPrice(price);
        totalCourses += 1;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println(ERROR_1);
        }
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        if (courseDuration > 0) {
            this.courseDuration = courseDuration;
        } else {
            System.out.println(ERROR_2);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println(ERROR_3);
        }
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    public void updatePrice(double percentageIncrease) {
        if (percentageIncrease > 0) {
            double increase = (percentageIncrease / 100) + 1;
            price *= increase;
        } else {
            System.out.println(ERROR_2);
        }
    }

    public void updatePrice(int amountIncrease) {
        if (amountIncrease > 0) {
            price += amountIncrease;
        } else {
            System.out.println(ERROR_2);
        }
    }

    public static void showTotalCourses() {
        System.out.println("Cursos totales: " + totalCourses);
    }

    @Override
    public String toString() {
        return "ID: " + ID + " | Curso: " + name + " | Duración (hs.): " + courseDuration+  " | Precio: " + price;
    }
}
