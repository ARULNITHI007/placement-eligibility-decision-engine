public class GraduationYearRule extends EligibilityRule {
    //this is the override method by the EligibilityRule
    // this display the rule name
    @Override
    public String getRuleName() {
        return "GraduationYear";
    }
    //this is the override method by the EligibilityRule
    //this is to check the candiate GraduationYear is  equal to job GraduationYear
    @Override
    public boolean check(Candidate candidate, Job job) {
        
        return candidate.getGraduationYear() == job.getRequiredGraduationYear();
    }
    
}
