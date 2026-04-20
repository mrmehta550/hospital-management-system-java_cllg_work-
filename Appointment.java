public class Appointment {
    private Patient patient;
    private Doctor doctor;

    public Appointment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public void display() {
        System.out.println("Patient: " + patient.getName() +
                " -> Doctor ID: " + doctor.getId());
    }
}