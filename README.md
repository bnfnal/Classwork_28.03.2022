# Classwork_28.03.2022

## **Task 1: Powers Of 2**

### **Class:** 
                PowersOf2
### **Function:**   
                powersOfTwo(int n) 

### **Task:**

Complete the function that takes a non-negative integer n as input, 
and returns a list of all the powers of 2 with the exponent ranging from 0 to n ( inclusive ).

### **Examples:**


     n = 0  ==> [1]        # [2^0]
     n = 1  ==> [1, 2]     # [2^0, 2^1]
     n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]


### **Favorite solution:**


    public class Kata 
    {
      public static long[] powersOfTwo(int n) 
      {
         long ret[] = new long[n + 1];
         for (int i = 0; i <= n; i++) ret[i] = 1L << i;
         return ret;
      }
    }


## **Task 2: Break camelCase**

### **Class:** 
                BreakCamelCase
### **Function:**   
                camelCase(String input) 

### **Task:**

Complete the solution so that the function will break up camel casing, using a space between words.

### **Examples:**


     "camelCasing"  =>  "camel Casing"
     "identifier"   =>  "identifier"
     ""             =>  ""


### **Favorite solution:**


    class Solution 
    {
        public static String camelCase(String input) 
        {
        return input.replaceAll("([A-Z])", " $1");
        }
    }
    
    
## **Task 3: Take a Ten Minutes Walk**

### **Class:** 
                TenMinWalk 
### **Function:**   
                isValid(char[] walk)

### **Task:**

You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.

Note: you will always receive a valid array (string in COBOL) containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).


### **Favorite solution:**



     public class TenMinWalk 
     {
        public static boolean isValid(char[] walk) 
        {
           if (walk.length != 10) return false;
           int x = 0, y = 0;
           for (char c: walk) 
           {
              switch (c) 
              {
                 case 'n': y++; break;
                 case 's': y--; break;
                 case 'w': x++; break;
                 case 'e': x--; break;
              }
           }
           return x == 0 && y == 0;
        }
     }


