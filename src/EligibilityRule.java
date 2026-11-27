public abstract class EligibilityRule {
    //this abstract method contains rule name
    public abstract String getRuleName();
    //thid abstract method contains rule
    public abstract boolean check(Candidate candidate, Job job);
}