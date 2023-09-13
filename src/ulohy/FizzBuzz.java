package ulohy;

/*Typická hra fizz buzz môže začínať takto:
        1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, …*/

public class FizzBuzz {
    public static void main(String[] args) {
      for (int i = 1; i <= 30; i++)
           if (i % 3 == 0 && i % 5 == 0) System.out.print("FizzBuzz, ");
              else if (i % 3 == 0) System.out.print("Fizz, ");
              else if (i % 5 == 0) System.out.print("Buzz, ");
              else System.out.print(i + ", ");
    }
}
