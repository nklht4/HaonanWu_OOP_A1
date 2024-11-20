
import java.util.ArrayList;  

public class AssignmentOne {  
    private static ArrayList<Appointment> appointments = new ArrayList<>();  

    public static void main(String[] args) {   
        GeneralPractitioner example1 = new GeneralPractitioner(1, "Dr. Wang", "Six years", "People's hospital");  
        GeneralPractitioner example2 = new GeneralPractitioner(2, "Dr. Lee", "Four years", "Health Center");  
        GeneralPractitioner example3 = new GeneralPractitioner(3, "Dr. Charlie", "Five years", "Health Center");  

        Ophthalmologist example4 = new Ophthalmologist(4, "Dr. Johnson", "Four years", "Doctor of Medicine");  
        Ophthalmologist example5 = new Ophthalmologist(5, "Dr. Eve", "Five years", "Undergraduate course");  

        example1.printDetails();  
        example2.printDetails();  
        example3.printDetails();  
        example4.printDetails();  
        example5.printDetails();  

        System.out.println("------------------------------");  

        createAppointment("John Doe", "532725794", "10:00", example1);  
        createAppointment("Daniel Miller", "748356739", "14:00", example4);  
        createAppointment("Robert Brown", "673848242", "09:00", example2);  
        createAppointment("Emily Wang", "461683063", "11:00", example5);  
        printExistingAppointments();  

        cancelBooking("123456789"); // Cancel an appointment  
        printExistingAppointments(); // Print the updated appointment  
    }  

    // The way to create an appointment  
    public static void createAppointment(String patientName, String Phonenumber, String Appointment_time, HealthProfessional doctor) {  
        if (patientName.isEmpty() || Phonenumber.isEmpty() || Appointment_time.isEmpty() || doctor == null) {  
            System.out.println("Unable to create an appointment, lack of information.");  
            return;  
        }  
        Appointment newAppointment = new Appointment(patientName, Phonenumber, Appointment_time, doctor);  
        appointments.add(newAppointment);  
        System.out.println("An appointment has been created: " + patientName + " with " + doctor.getClass().getSimpleName());  
    }  

    // The way to print an existing appointment  
    public static void printExistingAppointments() {  
        if (appointments.isEmpty()) {  
            System.out.println("No existing appointments.");  
        } else {  
            for (Appointment appointment : appointments) {  
                appointment.printDetails();  
                System.out.println("------------------------------");  
            }  
        }  
    }  

    // The way to cancel an appointment  
    public static void cancelBooking(String Phonenumber) {  
        for (int i = 0; i < appointments.size(); i++) {  
            if (appointments.get(i).Phonenumber.equals(Phonenumber)) {  
                appointments.remove(i);  
                System.out.println("The reservation has been cancelled: " + Phonenumber);  
                return;  
            }  
        }  
        System.out.println("Mobile number not found: " + Phonenumber);  
    }  
}