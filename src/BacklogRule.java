public class BacklogRule extends EligibilityRule {
    //this is the override method by the EligibilityRule
    // this display the rule name
    @Override
    public String getRuleName() {
       return "Backlog";
    }
    //this is the override method by the EligibilityRule
    //this is to check the candiate Backlog is less than to job Backlog
    @Override
    public boolean check(Candidate candidate, Job job) {
        
        return candidate.getBacklogs() <= job.getMaximumBacklogs();
    }
    
}
