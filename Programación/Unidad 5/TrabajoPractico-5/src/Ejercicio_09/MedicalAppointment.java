package Ejercicio_09;

public class MedicalAppointment {
    private final String date;
    private final String time;
    private final Patient patient;
    private final Professional professional;

    public MedicalAppointment(String date, String time, Patient patient, Professional professional) {
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.professional = professional;
    }

    @Override
    public String toString() {
        return "Appointment{date='" + date + "', patient=" + patient + ", professional=" + professional + "}";
    }
}