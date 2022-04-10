import java.util.Scanner;
import java.io.IOException;

class Task1 {
    public static void main(String[] args)throws IOException{
        Staff newStaff = new Staff();
        newStaff.Ehiabhi56481initialize1();
        newStaff.Ehiabhi56481print1();
    }
}

    class Person{
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

    class Staff extends Person{
        protected String Ehiabhi56481education, Ehiabhi56481position;

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

       //print the entire staff
        public void Ehiabhi56481print1(){
           System.out.println("Displaying the Data.");
           System.out.println( "==============================================");
            Ehiabhi56481print();
           System.out.println("Education: "+ Ehiabhi56481education + "\nPosition: " + Ehiabhi56481position) ;
        }
    }




