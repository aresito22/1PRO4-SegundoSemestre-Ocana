package Ejercicio_09;

public class Main {
    static void main(String[] args) {
        Patient p = new Patient("Jose", "PAMI");
        Professional pr = new Professional("Dr. House", "Diagnosis");
        MedicalAppointment appt = new MedicalAppointment("2026-05-01", "10:00", p, pr);
        System.out.println(appt);
    }
}