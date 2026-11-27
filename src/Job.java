public class Job {
    private String company;
    private String role;
    private double minimumPercentage;
    private int maximumBacklogs;
    private int requiredGraduationYear;
    private String[] requiredSkills;
    //this is the constructor for job to get company name,role,minimumPercentage,graduationYear,maximumBacklogs
    //assign the value for company name,role,minimumPercentage,graduationYear,maximumBacklogs
    public Job(
        String company,
        String role,
        double minimumPercentage,
        int maximumBacklogs,
        int requiredGraduationYear,
        String[] requiredSkills
    ) {
        this.company = company;
        this.role = role;
        this.minimumPercentage = minimumPercentage;
        this.maximumBacklogs = maximumBacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
        this.requiredSkills = requiredSkills;
    }
    //getter method for return company name
    public String getCompany() {
        return company;
    }
    //getter method for return role
    public String getRole() {
        return role;
    }
    //getter method for return minimumPercentage
    public double getMinimumPercentage() {
        return minimumPercentage;
    }
    //getter method for return maximumBacklogs
    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }
    //getter method for return requiredGraduationYear
    public int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }
    //getter method for return requiredSkills
    public String[] getRequiredSkills() {
    return requiredSkills;
    }
}