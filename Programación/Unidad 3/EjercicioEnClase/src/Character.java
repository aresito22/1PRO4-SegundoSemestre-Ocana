public class Character {
    private String name;
    private int level;
    private int healthPoints;
    public boolean isBeaten;
    private int id;

    // Atributo estático compartido por toda la clase
    private static int totalPersonajes = 0;
    // Método utilitario interno para auto-incrementar
    private int generarId() {
        totalPersonajes++;
        return totalPersonajes;
    }

    public Character(String name) {
        this.name = name;
        level = 1;
        healthPoints = 100;
        isBeaten = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        else {
            System.out.println("Error: campo vacío.");
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 1) {
            this.level = level;
        }
        else {
            System.out.println("Error: nivel menor a 1.");
        }
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (healthPoints >= 0 && healthPoints <= 100) {
            this.healthPoints = healthPoints;
        }
        else {
            System.out.println("Error: salud menor a 0 o mayor a 100.");
        }
    }

    public void takeDamage(int damagePoints) {
        if (damagePoints < healthPoints) {
            healthPoints -= damagePoints;
            System.out.println(damagePoints + " de daño! Salud actual: " + healthPoints);
        }
        else {
            healthPoints = 0;
            isBeaten = true;
            System.out.println("Salud actual: 0 - " + name + "derrotado.");
        }
    }

    public void heal(int healingPoints) {
        if (isBeaten) {
            if (healthPoints + healingPoints < 100) {
                healthPoints += healingPoints;
                System.out.println("Personaje curado. Salud actual: " + healthPoints);
            }
            else {
                healthPoints = 100;
                System.out.println("Personaje totalmente curado!");
            }
        }
        else {
            System.out.println("Error: no se puede curar a un personaje derrotado.");
        }
    }

    public void showState() {
        System.out.println("Nombre: " + name);
        System.out.println("Nivel: " + level);
        System.out.println("Salud actual: " + healthPoints);
        if (isBeaten) {
            System.out.println("Personaje derrotado.");
        }
        else {
            System.out.println("Personaje vivo.");
        }
    }
}