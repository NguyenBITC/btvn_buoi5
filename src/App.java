public class App {
    public static void main(String[] args) throws Exception {
       StringApp stringapp = new StringApp();
       stringapp.CheckSubString("Hello, welcome to the world of Java!","Java");
   
       int count = stringapp.CountCharInString("Hello, welcome to the world of Java!", 'o');
       System.out.println("So lan ki tu xuat hien la: "+count);

       String upperCaseString = stringapp.UpperCaseToString("Hello, welcome to the world of Java!");
       System.out.println("Chuoi sau khi chuyen thanh chu in hoa: "+upperCaseString);

      
       stringapp.isPalindrome("radar");
       stringapp.isPalindrome("nguyen");
    }
}
