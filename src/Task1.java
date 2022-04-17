import java.util.Scanner;
import java.io.IOException;

class Task1 {
    public static void main(String[] args)throws IOException{

        Staff newStaff = new Staff();
        //newStaff.Ehiabhi56481initialize1();
       // newStaff.Ehiabhi56481print1();
       // newStaff.yearsOfExperienceEhiabhi56481 = 5;
       // newStaff.salaryToPay(8,25);
       System.out.println(newStaff.salaryForOvertime(10,20));
       Salary.bonusEligible(5);

    }
}

   abstract class Person {
        protected String Ehiabhi56481surname, Ehiabhi56481firstName, Ehiabhi56481street, Ehiabhi56481zipCode, Ehiabhi56481city;
        //enter Person data
        public void Ehiabhi56481initialize() throws IOException{
            //enter data
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter Surname");
            this.Ehiabhi56481surname = sc.next();
            System.out.println("Enter Firstname");
            this.Ehiabhi56481firstName = sc.next();
            System.out.println("Enter Street");
            this.Ehiabhi56481street = sc.next();
            System.out.println("Enter zipcode");
            this.Ehiabhi56481zipCode = sc.next();
            System.out.println("Enter city");
            this.Ehiabhi56481city = sc.next();
        }

        //print person
       public void Ehiabhi56481print(){//show data
             System.out.println("Surname: " + Ehiabhi56481surname + "\nName: " + Ehiabhi56481firstName + "\nStreet: " + Ehiabhi56481street + "\nCity: " + Ehiabhi56481city + "\nZip-code: " + Ehiabhi56481zipCode) ;
        }




    }

    class Staff extends Person implements Salary {
        protected String Ehiabhi56481education, Ehiabhi56481position;
        int yearsOfExperienceEhiabhi56481;

        //Enter Staff data
       public void Ehiabhi56481initialize1()throws IOException{
           System.out.println("Retrieving the Data.");
           System.out.println( "==============================================");

           //call the person class and fetch data
           Ehiabhi56481initialize();
           Scanner sc= new Scanner(System.in);

           //get input
           System.out.println("Enter Education") ;
           this.Ehiabhi56481education = sc.next();
           System.out.println("Enter position") ;
           this.Ehiabhi56481position = sc.next();
       }

        @Override
        public void salaryToPay(double hoursEhiabhi56481, double rateEhiabhi56481) {
                double totalEhiabhi56481 = hoursEhiabhi56481 * rateEhiabhi56481;
                double pay =  Salary.bonusEligible(yearsOfExperienceEhiabhi56481) + totalEhiabhi56481;
                System.out.println("Your total salary + bonus is: " + pay);
        }

        @Override
       public int salaryForOvertime(int hoursEhiabhi56481, int rateEhiabhi56481){
           return 1;
       };

        //print the entire staff
        public void Ehiabhi56481print1(){
           System.out.println("Displaying the Data.");
           System.out.println( "==============================================");
            Ehiabhi56481print();
           System.out.println("Education: "+ Ehiabhi56481education + "\nPosition: " + Ehiabhi56481position) ;
        }
    }


    interface Salary {

        void salaryToPay(double hoursEhiabhi56481, double rateEhiabhi56481);

        default int salaryForOvertime(int hoursEhiabhi56481, int rateEhiabhi56481){
            int totalEhiabhi56481 = hoursEhiabhi56481 * rateEhiabhi56481;
            return totalEhiabhi56481;
        };

       static double bonusEligible(double yearsOfExperienceEhiabhi56481){
           double bonusEhiabhi56481 = 0;
           if(yearsOfExperienceEhiabhi56481 > 5) bonusEhiabhi56481  = 100; //check if staff is eligible
           else bonusEhiabhi56481 = 0;
           return bonusEhiabhi56481;
       };

    }


