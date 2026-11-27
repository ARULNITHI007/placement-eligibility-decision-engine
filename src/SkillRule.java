public class SkillRule extends EligibilityRule {
    //this is the override method by the EligibilityRule
    // this display the rule Skills
    @Override
    public String getRuleName() {
        return "Skills";
    }
    //this is the override method by the EligibilityRule
    //this is to check the candiate percentage is greater than to jobMinimumPercentage
    @Override
    public boolean check(Candidate candidate, Job job) {
        String[] requiredSkills = job.getRequiredSkills();

        for (int i = 0; i < requiredSkills.length; i++) {
            if (!candidate.hasSkill(requiredSkills[i])) {
                return false;
            }
        }

        return true;
    }
}
