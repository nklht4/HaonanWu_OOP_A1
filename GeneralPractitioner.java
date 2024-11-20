public class GeneralPractitioner extends HealthProfessional {  
    private String position; 

    // Default constructor  
    public GeneralPractitioner() {  
        super(); // Call the default constructor of the parent class  
        this.position = "";  
    }  

    // Initialization information
    public GeneralPractitioner(int id, String name, String Work_experience, String position) {  
        super(id, name, Work_experience); // Calls the parameterized constructor of the parent class  
        this.position = position;  
    }  

    // print 
    @Override  
    public void printDetails() {  
        System.out.println("The health professional details are as follows:");  
        super.printDetails(); // Prints the instance variable of the parent class  
        System.out.println("The Position: " + position);  
    }  
}