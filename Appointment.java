public class Appointment {  
    private String patientName;
    String Phonenumber;
    private String Appointment_time;
    private HealthProfessional doctor;

    // Default constructor  
    public Appointment() {  
        this.patientName = "";  
        this.Phonenumber = "";  
        this.Appointment_time = "";  
        this.doctor = null;  
    }  

    // Initialization information  
    public Appointment(String patientName, String Phonenumber, String Appointment_time, HealthProfessional doctor) {  
        this.patientName = patientName;  
        this.Phonenumber = Phonenumber;  
        this.Appointment_time = Appointment_time;  
        this.doctor = doctor;  
    }  

    // The method to print all instance variables  
    public void printDetails() {  
        System.out.println("Patient Name: " + patientName);  
        System.out.println("Phone Number: " + Phonenumber);  
        System.out.println("Appointment time: " + Appointment_time);  
        System.out.print("Doctor Details: ");  
        doctor.printDetails(); // Print the doctor's details  
    }  
}