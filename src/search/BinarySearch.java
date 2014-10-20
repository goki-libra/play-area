package search;

import java.util.Arrays;
import java.util.List;

public class BinarySearch
{

   public static void main(String[] args)
   {
      List<Integer> list = Arrays.asList(0, 1, 2, 3, 4);
      binarySearchIterative(list, 3);
      if (!binarySearchRecursive(list, 0, list.size() - 1, 4))
         System.out.println("Item not found in the list in recursive approach");
   }

   private static boolean binarySearchRecursive(List<Integer> list,
                                                int min,
                                                int max,
                                                int search)
   {
      int mid = (min + max) / 2;
      boolean result = false;
      if (min > max) {
         return false;
      } else if (list.get(mid) == search) {
         System.out.println("Item found at index: " + mid + " in recursive approach");
         return true;
      } else if (list.get(mid) < search) {
//         System.out.println("Item NOT found at index: " + mid);
         result = result || binarySearchRecursive(list, mid + 1, max, search);
      } else {
//         System.out.println("Item NOT found at index: " + mid);
         max = mid - 1;
         result = result || binarySearchRecursive(list, min, mid - 1, search);
      }
      return result;
   }

   private static void binarySearchIterative(List<Integer> list,
                                             int search)
   {
      int mid = 0, min = 0, max = list.size() - 1;
      while (min <= max) {
         mid = (min + max) / 2;
         if (list.get(mid) == search) {
            System.out.println("Item found at index: " + mid + " in iterative approach");
            return;
         } else if (list.get(mid) < search) {
//            System.out.println("Item NOT found at index: " + mid);
            min = mid + 1;

         } else {
//            System.out.println("Item NOT found at index: " + mid);
            max = mid - 1;
         }

      }
      System.out.println("Item NOT found in list in iterative approach");

   }

}