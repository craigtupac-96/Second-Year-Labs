/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab5;

public class Lab5q1 {
   public static void main(String args[]){
      int power = 2, result;
      final int MAX = 10;

      while ( power <= MAX ){
         result = (int) Math.pow(2,power);
         System.out.println( "2 to the power of " + power + "= " + result);
         power++;
      }
   }
}
