public class PercentageRule extends EligibilityRule{
    //this is the override method by the EligibilityRule
    // this display the rule name
    @Override
    public String getRuleName() {
        return "Percentage";
    }
    //this is the override method by the EligibilityRule
    //this is to check the candiate percentage is greater than to jobMinimumPercentage
    @Override
    public boolean check(Candidate candidate, Job job) {
        
        return candidate.getPercentage() >= job.getMinimumPercentage();

    }
    
}
