package student;

    public class StudentApllication {
        public static void studentDetails() {

        }

        public static void tenthCGPA(double cgpa) {
            System.out.println("tenth cgpa is" + cgpa);

        }

        public void interPercentange(double percentage) {
            System.out.println("intermediate percentage is =" + percentage);
        }

        public void eamcetRank(String rank) {
            System.out.println("EAMCET RANK IS " + rank);
        }

        public static void main(String[] args) {
            studentDetails();
            StudentApllication inter = new StudentApllication();
            StudentApllication emt = new StudentApllication();
            tenthCGPA(8.8);
            inter.interPercentange(93.8);
            emt.eamcetRank("48,305");

        }
    }
