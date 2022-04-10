import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException{
        Staff newStaff = new Staff();
        newStaff.Stephen56481initialize1();
        newStaff.Stephen56481print1();
    }
}

    class Person{
        protected String Stephen56481surname, Stephen56481firstName, Stephen56481street, Stephen56481zipCode, Stephen56481city;
        //enter Person data
        public void Stephen56481initialize() throws IOException{
            //enter data
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter Surname");
            this.Stephen56481surname = sc.next();
            System.out.println("Enter Firstname");
            this.Stephen56481firstName = sc.next();
            System.out.println("Enter Street");
            this.Stephen56481street = sc.next();
            System.out.println("Enter zipcode");
            this.Stephen56481zipCode = sc.next();
            System.out.println("Enter city");
            this.Stephen56481city = sc.next();
        }

        //print person
       public void Stephen56481print(){//show data
             System.out.println("Surname: " + surname + "\nName: " + firstName + "\nStreet: " + street + "\nCity: " + city + "\nZip-code: " + zipCode) ;
        }

    }

    class Staff extends Person{
        protected String Stephen56481education, Stephen56481position;

        //Enter Staff data
       public void Stephen56481initialize1()throws IOException{
           System.out.println("Retrieving the Data.");
           System.out.println( "==============================================");

           //call the person class and fetch data
           Stephen56481initialize();
           Scanner sc= new Scanner(System.in);

           //get input
           System.out.println("Enter Education") ;
           this.Stephen56481education = sc.next();
           System.out.println("Enter position") ;
           this.Stephen56481position = sc.next();
       }

       //print the entire staff
        public void Stephen56481print1(){
           System.out.println("Displaying the Data.");
           System.out.println( "==============================================");
           Stephen56481print();
           System.out.println("Education: "+education + "\nPosition: " + position) ;
        }
    }




