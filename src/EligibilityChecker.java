public class EligibilityChecker {
        //this array contain all rules
            EligibilityRule rule[] = {
            new PercentageRule(),
            new BacklogRule(),
            new GraduationYearRule(),
            new SkillRule()
            };
        //method for to check all placement criteria
        boolean evaluate(Candidate candidate,Job job){
            
            //to check the candiate is eligible or not
            //to create a eligible variable for holding the status
            boolean eligible =true;
            for(int i=0;i<rule.length;i++) {
                boolean pass=rule[i].check(candidate, job);
                if(pass)
                    System.out.println(rule[i].getRuleName()+": PASS");
                else {
                    System.out.println(rule[i].getRuleName()+": FAIL");
                    eligible=false;
                }
            }
            return eligible;
        }
}
