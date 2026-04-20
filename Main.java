import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HospitalService service = new HospitalService();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n1.Add Patient\n2.View Patients\n3.Add Doctor\n4.View Doctors\n5.Book Appointment\n6.View Appointments\n7.Exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("ID: ");
                        int pid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String pname = sc.nextLine();
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Disease: ");
                        String dis = sc.nextLine();
                        service.addPatient(new Patient(pid, pname, age, dis));
                        break;

                    case 2:
                        service.viewPatients();
                        break;

                    case 3:
                        System.out.print("Doctor ID: ");
                        int did = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String dname = sc.nextLine();
                        System.out.print("Specialization: ");
                        String spec = sc.nextLine();
                        service.addDoctor(new Doctor(did, dname, spec));
                        break;

                    case 4:
                        service.viewDoctors();
                        break;

                    case 5:
                        System.out.print("Patient ID: ");
                        int p = sc.nextInt();
                        System.out.print("Doctor ID: ");
                        int d = sc.nextInt();
                        service.bookAppointment(p, d);
                        break;

                    case 6:
                        service.viewAppointments();
                        break;

                    case 7:
                        System.exit(0);
                }
            }
        }
    }
}