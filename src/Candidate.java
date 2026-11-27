public class Candidate {
    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;
    private String[] skills;
    //this is the constructor for candiate to get name,percentage,backlogs,graduationYear
    //assign the value for name,percentage,backlogs,graduationYear
    public Candidate(
            String name,
            double percentage,
            int backlogs,
            int graduationYear,
            String skills[]
    ) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
        this.skills=skills;
    }
    //getter method for return name
    public String getName() {
        return name;
    }
    //getter method for return percentage
    public double getPercentage() {
        return percentage;
    }
    //getter method for return backlogs
    public int getBacklogs() {
        return backlogs;
    }
    //getter method for return graduationYear
    public int getGraduationYear() {
        return graduationYear;
    }
    //to check the weather the skill is present in the candiate skills or not
    public boolean hasSkill(String requiredSkill) {
        for (int i = 0; i < skills.length; i++) {
            if (skills[i].equalsIgnoreCase(requiredSkill)) {
                return true;
            }
        }

        return false;
    }
}