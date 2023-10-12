package Exception;

import java.math.BigDecimal;
import java.util.List;
import java.lang.Exception;
public class ExceptionsPractice {    
    public static void main(String[] args) {
        System.out.println("-----RUNTIME / UNCHECKED EXCEPTIONS-----");
// Arithmetic Exceptions
        System.out.println("*** ARITHMETIC EXCEPTIONS ***");
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);

        } catch (Exception e) {
            System.out.println("ERROR -Division by 0");
        }
        try {
            System.out.println(a%b);
        } catch (Exception e) {
            System.out.println("ERROR- Modulo by 0");        
        }
        BigDecimal a1=new BigDecimal(11);
        BigDecimal a2=new BigDecimal(17);
        try {
            System.out.println(a1.divide(a2));
            System.out.println(a1.toString());
            a1=a1.divide(a2,6,BigDecimal.ROUND_DOWN);
        } catch (Exception e) {
            System.out.println("Big Decimal division");
        }
        int max=Integer.MAX_VALUE;
        int min=1;
        try {
            System.out.println(max/min);
        } catch (Exception e) {
            System.out.println("Overflow in division");
        }
        try {
            System.out.println(Math.sqrt(-1));
        } catch (Exception e) {
            System.out.println("Improper Math function");
        }

// Number Format Exceptions
        System.out.println("*** NUMBER FORMAT EXCEPTIONS ***");

        // int c=Integer.parseInt(null);
        // int c=Integer.parseInt("");
        // int c=Integer.parseInt("Java ");
        // int c=Integer.parseInt(" Java");
        // int c=Integer.parseInt(1.0);------mismatch between i/p and method type
        // int c=Integer.parseInt(" 123 ");
        int c=Integer.parseInt("123");

        // String str="java program";
        // int strNum=Integer.parseInt(str);

        // String binaryNumber = "1010";
        // int number1 = Integer.parseInt(binaryNumber, 2);

        // String hexNumber = "0x1A";
        // int number2 = Integer.parseInt(hexNumber); 

        try {
            System.out.println(c); 
            // System.out.println(strNum);
            // System.out.println(number1);
            // System.out.println(number2);
        } catch (Exception e) {
            System.out.println("Number Format exception examples");
        }
// Null Pointer Exceptions
        System.out.println("*** NULL POINTER EXCEPTIONS ***");
        int arr1[]=null;
        // System.out.println(arr1.length);
        // System.out.println(arr1[0]);

        String company=null;
        // System.out.println(company.length());
        // System.out.println(company.toUpperCase());

        List<String> list1=null;
        // System.out.println(list1.get(0));

        Person person1=null;
        // person1.getName();
        // person1.setName("Sneha");

// Index Out of Bound Exceptions
        System.out.println("*** INDEX OUT OF BOUND EXCEPTIONS ***");

        String names[]={"Kia","Nissan","Volks","Hyundai","MG"};
        int nums[]={1,2,3};

        int arr2[]=new int[0];

        // int value=nums[names.length];
        try {
            System.out.println(arr2[0]);
            System.out.println(names[5]);
            System.out.println(names[-1]);
            // System.out.println(value);

            // for(int i=0;i<=names.length;i++){
            for(int i=0;i>=names.length;i--){
            System.out.println(names[i]);
        }
        } catch (Exception e) {
            System.out.println("Array Index out of bound");
        }

        String name="KGiSL Technologies-Enterprise Software Products and Services";

        char nameCom[]={'A','B','C','D','E'};

        String prefix = "Hello, ";
        String suffix = "World!";
        
        String emptyString="";
        try {
            // System.out.println(emptyString.charAt(0));
            System.out.println(name.charAt(60));
            System.out.println(name.charAt(-1));

            System.out.println(name.substring(50, 40));
            System.out.println(name.substring(-10, 0));
            System.out.println(name.substring(55, 65));
            System.out.println(name.substring(-1));

            System.out.println(name.subSequence(50, 40));

            // String sub=name.valueOf(nameCom, 1, 2);---o/p=>BC
            String sub=name.valueOf(nameCom, -1, 6);
            System.out.println(sub);

            String result = prefix.substring(0, 7)+suffix.substring(7);
            System.out.println(result);    
        } catch (Exception e) {
            System.out.println("String Index out of bound");
        }
// Handle error - throws 
        String invalidNumber = "abc";
        try {
            int number = parseNumber(invalidNumber);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }
    }
    
    public static int parseNumber(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }
}
class Person{
    String name="";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
