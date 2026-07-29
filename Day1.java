class Day1 {
    public static void main(String args[]) {
        String msg = "Hello world";
        String firstName = "Kirubhakaran";
        char lastName = 'R';
        String email = "kirubhak047@gmail.com";
        int age = 25;
        String degree = "Msc Mathematics";
        String[] skills = { "HTML", "CSS", "Javascript", "Bootstrap", "React" };
        String number = "+91 1234567890";
        byte experience = 2;
        short passoutYear = 2023;
        long salary = 500000L;
        boolean workingStatus = false;

        System.out.println(msg);
        System.out.println("PERSONAL DETAILS");
        System.out.println("NAME: " + lastName + "." + firstName);
        System.out.println("AGE: " + age);
        System.out.println("EMAIL: " + email);
        System.out.println("MOBILE NUMBER: " + number);
        System.out.println("DEGREE: " + degree);
        System.out.println("SKILLS: " + java.util.Arrays.toString(skills));
        System.out.println("EXPERIENCE: " + experience + " Years");
        System.out.println("PASSOUT YEAR: " + passoutYear);
        System.out.println("EXPECTED SALARY: " + salary);
        System.out.println("WORKING STATUS: " + (workingStatus ? "Currently Working" : "Looking for Opportunities"));
       
        System.out.println("------------ FLOAT vs DOUBLE ------------");
        float fcheck = 1.123456789f;
        double dcheck = 1.123456789d;
        System.out.println("Float Value  : " + fcheck);
        System.out.println("Double Value : " + dcheck);

        System.out.println("--------------- OPERATORS ----------------");
        System.out.println("---------- 1. ARITHMETIC OPERATOR ---------");

        int maths = 195;
        int csc = 191;
        System.out.println("MATHS MARK: " + maths);
        System.out.println("CSC MARK: " + csc);

        System.out.println("Total Marks      : " + (maths + csc));
        System.out.println("Difference       : " + (maths - csc));
        System.out.println("Product          : " + (maths * csc));
        System.out.println("Quotient         : " + (maths / csc));
        System.out.println("Remainder        : " + (maths % csc));
        System.out.println("Average Marks    : " + ((maths + csc) / 2));

        System.out.println("---------- 2. ASSIGNMENT OPERATOR ---------");

        int balance = 500;

        System.out.println("Initial Balance : " + balance);

        balance += 11000;
        System.out.println("After Salary Credit : " + balance);

        balance -= 7000;
        System.out.println("After Paying PG Rent : " + balance);
        balance -= 1000;
        System.out.println("After Paying Gym Fees : " + balance);

        balance *= 1.1;
        System.out.println("Friend returned borrowed money : " + balance);

        balance /= 4;
        System.out.println("Weekly Budget : " + balance);

        balance %= 1000;
        System.out.println("Remaining Balance : " + balance);

        System.out.println("------ RELATIONAL OPERATOR ------");

        int aptitude = 82;
        int reasoning = 76;

        System.out.println("Aptitude Marks  : " + aptitude);
        System.out.println("Reasoning Marks : " + reasoning);

        System.out.println("Aptitude > Reasoning  : " + (aptitude > reasoning));
        System.out.println("Aptitude < Reasoning  : " + (aptitude < reasoning));
        System.out.println("Aptitude >= Reasoning : " + (aptitude >= reasoning));
        System.out.println("Aptitude <= Reasoning : " + (aptitude <= reasoning));
        System.out.println("Aptitude == Reasoning : " + (aptitude == reasoning));
        System.out.println("Aptitude != Reasoning : " + (aptitude != reasoning));
        System.out.println("checking!(Aptitude != Reasoning) : " + !(aptitude != reasoning));
        System.out.println("------ LOGICAL OPERATOR ------");

        boolean reactCompleted = true;
        boolean javaCompleted = false;

        System.out.println("React Completed : " + reactCompleted);
        System.out.println("Java Completed  : " + javaCompleted);

        System.out.println("Both Completed (&&) : " + (reactCompleted && javaCompleted));
        System.out.println("Any One Completed (||) : " + (reactCompleted || javaCompleted));
        System.out.println("Java Not Completed (!) : " + (!javaCompleted));

        System.out.println("------ INCREMENT & DECREMENT OPERATORS ------");
        System.out.println("------ PRE INCREMENT ------");
        int x = 5;
        int y = ++x;
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        System.out.println("------ POST INCREMENT ------");
        int m = 5;
        int n = m++;
        System.out.println("m : " + m);
        System.out.println("n : " + n);

        System.out.println("------ PRE DECREMENT ------");
        int p = 5;
        int q = --p;
        System.out.println("p : " + p);
        System.out.println("q : " + q);

        System.out.println("------ POST DECREMENT ------");
        int r = 5;
        int s = r--;
        System.out.println("r : " + r);
        System.out.println("s : " + s);

    }

}