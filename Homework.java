import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;
// Реализовать приложение, которое:
// Принимает от пользователя и запоминает строки
// Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
// Если введено revert, то удаляем последнюю введеную строку
// Если введено exit, то завершаем программу

// java
// c++
// python
// c#
// print
// < [c#, python, c++, java]
// revert
// print
// < [python, c++, java]
// exit

public class Homework {

    public static void main(String[] args) {
        String x = "";
        Deque<String> queue = new LinkedList<String>();
        while(true){
            Scanner scan = new Scanner(System.in);
            x = scan.nextLine();
            if (x.equals("exit")){
                break;
            }
            else{
                if (x.equals("print")){
                    System.out.println(queue);
                }
                else if (x.equals("revert")){
                    queue.remove();
                }
                else {
                    queue.addFirst(x);
                }
            }          
        }      
    }
}