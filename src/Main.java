import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // to create a scanner object
        Scanner scanner = new Scanner(System.in);
        // to get a user name from user
        String name = scanner.next();
        // to get a user percentage from user
        double percentage = scanner.nextDouble();
        // to get backlogs details from user
        int backlogs = scanner.nextInt();
        // to get graduation year from user
        int graduationYear = scanner.nextInt();
        int skillsCount = scanner.nextInt();
        String skills[] = new String[skillsCount];
        for (int i = 0; i < skillsCount; skills[i++] = scanner.next());
            

        // create candiate object for candiate class
        // name,percentage,backlogs,graduationYear
        Candidate candidate = new Candidate(
                name,
                percentage,
                backlogs,
                graduationYear,
                skills);
        int jobCount = scanner.nextInt();
        Job[] jobs = new Job[jobCount];
        for (int i = 0; i < jobCount; i++) {
            String company = scanner.next();
            String role = scanner.next();
            double minimumPercentage = scanner.nextDouble();
            int maximumBacklogs = scanner.nextInt();
            int requiredGraduationYear = scanner.nextInt();

            int requiredSkillCount = scanner.nextInt();
            String[] requiredSkills = new String[requiredSkillCount];

            for (int j = 0; j < requiredSkillCount; j++) {
                requiredSkills[j] = scanner.next();
            }

            jobs[i] = new Job(
                    company,
                    role,
                    minimumPercentage,
                    maximumBacklogs,
                    requiredGraduationYear,
                    requiredSkills);
        }

        // create object for EligibilityChecker
        EligibilityChecker checker = new EligibilityChecker();
        System.out.println();
        System.out.println("AVAILABLE JOBS");

        for (int i = 0; i < jobs.length; i++) {
            System.out.println(
                    (i + 1) + ". " +
                            jobs[i].getCompany() +
                            " - " +
                            jobs[i].getRole());
        }
        System.out.println("which job you have to apply:");
        int selectedJobs=scanner.nextInt();
        // print placement report
        System.out.println("================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("================================");

        System.out.println();
        // print candiate name
        System.out.println("Candidate : " + candidate.getName());
        // print company name
        System.out.println("Company   : " + jobs[selectedJobs-1].getCompany());
        // print role
        System.out.println("Role      : " + jobs[selectedJobs-1].getRole());
        System.out.println();
        // check the eligiblity and store result
        boolean eligible = checker.evaluate(candidate, jobs[selectedJobs-1]);

        System.out.println();
        // check the candiate pass all criteria
        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("================================");

        scanner.close();
    }
}