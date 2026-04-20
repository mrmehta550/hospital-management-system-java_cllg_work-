import java.util.*;

public class HospitalService {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void viewPatients() {
        for (Patient p : patients) p.display();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void viewDoctors() {
        for (Doctor d : doctors) d.display();
    }

    public void bookAppointment(int patientId, int doctorId) {
        Patient p = null;
        Doctor d = null;

        for (Patient patient : patients)
            if (patient.getId() == patientId) p = patient;

        for (Doctor doctor : doctors)
            if (doctor.getId() == doctorId) d = doctor;

        if (p != null && d != null) {
            appointments.add(new Appointment(p, d));
            System.out.println("Appointment booked!");
        } else {
            System.out.println("Invalid IDs");
        }
    }

    public void viewAppointments() {
        for (Appointment a : appointments) a.display();
    }
}