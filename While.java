// 2. Write a sample program for while loop and do-while loop.
public class LoopExample {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            System.out.println("While Loop: " + i);
            i++;
        }

        int j = 1;

        do {
            System.out.println("Do-While Loop: " + j);
            j++;
        } while (j <= 5);
    }
}
/* Output: 
While Loop: 1
While Loop: 2
While Loop: 3
While Loop: 4
While Loop: 5
Do-While Loop: 1
Do-While Loop: 2
Do-While Loop: 3
Do-While Loop: 4
Do-While Loop: 5
*/
