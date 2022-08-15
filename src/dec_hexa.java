import java.util.InputMismatchException;
import java.util.Scanner;

class decimal_Hexadecimal {
    Scanner scanner;
    int decimal_Number;

    int Decimal_Num(){

        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter number in Decimal from 0 to 10000: ");
            decimal_Number= scanner.nextInt();
            if (decimal_Number <=10000){
                return decimal_Number;
            }
        } catch( InputMismatchException ex1 ) {
            System.err.println("Please Input in Integer not string :");
        }

        return Decimal_Num();


    }
    void convert_Decimal_To_Haxedecimal(){
        String hexadecimal_Number = Integer.toHexString(decimal_Number);
        System.out.println("Decimal number of :" + decimal_Number +" is = "+ hexadecimal_Number.toUpperCase() +" in Hexadecimal");
    }
}
public class dec_hexa{
    public static void main(String arg[]){
        decimal_Hexadecimal obj =new decimal_Hexadecimal();
        obj.Decimal_Num();
        obj.convert_Decimal_To_Haxedecimal();
    }
}
