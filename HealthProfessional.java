public class HealthProfessional {    
    private int id;            
    private String name;      
    private String Work_experience;      // Describe work experience 

    // Default constructor  
    public HealthProfessional() {  
        this.id = 0;          
        this.name = "";       
        this.Work_experience = "";       
    }  

    // Initialization information 
    public HealthProfessional(int id, String name, String Work_experience) {  
        this.id = id;           
        this.name = name;      
        this.Work_experience = Work_experience;     
    }  

    // The method for printing instance variables  
    public void printDetails() {  
        System.out.println("ID: " + id);  
        System.out.println("Name: " + name);  
        System.out.println("WORK EXPERIENCE: " + Work_experience);  
    }  
}