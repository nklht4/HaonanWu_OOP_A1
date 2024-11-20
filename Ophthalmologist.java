public class Ophthalmologist extends HealthProfessional {  
    private String Education_background;

    // Default constructor  
    public Ophthalmologist() {  
        super(); // Call the default constructor of the parent class  
        this.Education_background = "";  
    }  

    // Initialization information 
    public Ophthalmologist(int id, String name, String Work_experience, String Education_background) {  
        super(id, name, Work_experience); // Calls the parameterized constructor of the parent class  
        this.Education_background = Education_background;  
    }  

    // print
    @Override  
    public void printDetails() {  
        System.out.println("The Ophthalmologist details are as follows:");  
        super.printDetails(); // Prints the instance variable of the parent class  
        System.out.println("Education_background: " + Education_background);  
    }  
}