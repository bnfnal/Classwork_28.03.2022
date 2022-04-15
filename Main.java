import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Task 1: Powers of 2

        System.out.println("Task 1: Powers of 2");
        System.out.println("Введите количество степеней двойки = n (неотрицательное целое число)");
        int n = sc.nextInt();
        long powers[] = PowersOf2.powersOfTwo(n);
        System.out.println("Степени двойки от 0 до n включительно:");
        for (int i = 0; i< n+1; i++) 
        {
             System.out.print(powers[i] + " ");
        }
        System.out.println();
        System.out.println();
        
        //Task 2: Break camelCase
        
        Scanner s = new Scanner(System.in);
        System.out.println("Task 2: Break camelCase");
        System.out.println("Введите слово в camelCase");
        String str = s.next();
        System.out.println("Отформатированная строка:");
        System.out.println(BreakCamelCase.camelCase(str));
        System.out.println();
    }


    // Task 1: Powers of 2
    
    public static class PowersOf2
    {
       public static long[] powersOfTwo(int n)
      {
         long powers[] = new long[n+1];
         powers[0] = 1;
         for (int i = 1; i< n+1; i++) 
         {
             powers[i] = 2*powers[i-1];
         }
         return powers;
      }
    }
    
    //Task 2: Break camelCase
        
    public static class BreakCamelCase 
    {
       public static String camelCase(String input) 
       {
          String res =  "";
          char[] a = input.toCharArray();
          for(char x:a)
          {
             if(Character.isUpperCase(x)) res += " ";
             res += x;
          }
          return res;
       }
    }
        
}
