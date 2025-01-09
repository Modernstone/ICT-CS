public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        int x = 20;
        int y = 40;
        int temp;

        // Display initial values
        System.out.println("Before swapping: x = " + x + ", y = " + y);

        // Swap using a third variable
        temp = x;
        x = y;
        y = temp;

        // Display swapped values
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}

public class SwapValues {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping without using a third variable
        a = a + b; // a now becomes 30
        b = a - b; // b now becomes 10
        a = a - b; // a now becomes 20

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class InvestmentComparison {

    public static void main(String[] args) {

        double charlieinvest = 2000;
        double charlieRate = 4;
        int charlieTime = 3;

        double jamesinvest = 1500;
        double jamesRate = 5;
        int jamesTime = 4;

        // Calculate and display results
        double charlieTotal = charlieinvest + (charlieinvest * charlieRate * charlieTime) / 100;
        double jamesTotal = jamesinvest * Math.pow((1 + jamesRate / 100), jamesTime);

        System.out.println("Charlie's Total Amount after " + charlieTime + " years: $" + charlieTotal);
        System.out.println("James's Total Amount after " + jamesTime + " years: $" + jamesTotal);
    }
}

public class PreInitializedBioData {
    public static void main(String[] args) {

        String name = "Vishva Patel";
        String mobileNo = "1234567890";
        String emailID = "gmail12@gmail.com";
        String gender = "Male";
        String dob = "11-01-2006";
        String nationality = "Indian";
        String religion = "Hindu";
        String fatherName = "Rakeshkumar A. Patel";
        String motherName = "Deepa R. Patel";
        String languagesKnown = "Gujarati, Hindi, English ";
        String hobbies = "Coding, Traveling, Gaming";
        String address = "11, society Name ";
        String elementarySchool = "ABC School";
        String highSchool = "XYZ High School";
        String college = "Ganpat University";
        String otherCourses = "Cybersecurity";
        String companyName1 = "IBM";
        String position1 = "Developer";
        String workPeriod1 = "2024-2025";
        String companyName2 = "Google";
        String position2 = "Software Developer";
        String workPeriod2 = "2018-Present";

        System.out.println("\n            Bio Data:\n");
        System.out.println("Name              : " + name);
        System.out.println("Mobile No         : " + mobileNo);
        System.out.println("Email ID          : " + emailID);
        System.out.println("Gender            : " + gender);
        System.out.println("Date of Birth     : " + dob);
        System.out.println("Nationality       : " + nationality);
        System.out.println("Religion          : " + religion);
        System.out.println("Father's Name     : " + fatherName);
        System.out.println("Mother's Name     : " + motherName);
        System.out.println("Languages Known   : " + languagesKnown);
        System.out.println("Hobbies           : " + hobbies);
        System.out.println("Address           : " + address);

        System.out.println("\n       Educational Background:\n");
        System.out.println("Elementary School : " + elementarySchool);
        System.out.println("High School       : " + highSchool);
        System.out.println("College           : " + college);
        System.out.println("Other Courses     : " + otherCourses);

        System.out.println("\n          Work Experience:\n");
        System.out.println("Company Name 1    : " + companyName1);
        System.out.println("Position 1        : " + position1);
        System.out.println("Work Period 1     : " + workPeriod1);

        System.out.println("Company Name 2    : " + companyName2);
        System.out.println("Position 2        : " + position2);
        System.out.println("Work Period 2     : " + workPeriod2);
    }
}