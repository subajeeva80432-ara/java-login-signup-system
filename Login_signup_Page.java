import java.util.*;
class Main{
    public static void main(String args[]){
         Scanner s = new Scanner(System.in);
    System.out.println(" Welcome to Secure Access System ");
    System.out.println("1,sign up");
    System.out.println("2,Login");
    System.out.println("Enter the Choice");
    int choice = s.nextInt();
    String savedUserName="";
    String savedpassword="";
    s.nextLine();
    
    
    if(choice==1){
        System.out.println();
        System.out.println("Sign Up");
        System.out.print("Enter the user name:");
        savedUserName=s.nextLine();
        System.out.println();
        System.out.print("Enter the Password:");
        savedpassword=s.nextLine();
        System.out.println("Sign up successful please login");
        System.out.println();
        System.out.println("Login");
        System.out.print("Enter the User name:");
        String username = s.nextLine();
        System.out.println();
        System.out.print("Enter the password:");
        String password = s.nextLine();
        System.out.println();
        if(savedUserName.equals(username)&& savedpassword.equals(password)){
            System.out.println("Login Sucessfull!! Welcome,"+username);
        }
        else{
            System.out.println("Login Failed ! Incorrect username or Password");
        }
        
        
        
        
        
    }
    else if(choice==2){
        System.out.println("Login");
        System.out.print("Enter the username:");
        String username = s.nextLine();
        System.out.println();
        System.out.println("Enter the password");
        String password = s.nextLine();
        System.out.println();
        if(savedUserName.equals("")&&savedpassword.equals("")){
            System.out.println("No account found!! Please Sign up");
        }
        else if(savedUserName.equals(username)&& savedpassword.equals(password)){
            System.out.println("Login Sucessfull!! Welcome,"+username);
        }
        else{
            System.out.println("Login Failed ! Incorrect username or Password");
        }
        
    }
    else{
       System.out.println("Enter the correct choice");
    }  
    s.close();
    }
        
}