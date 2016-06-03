package uits.jv1605.dmitriev.basictypes.hw2;
public class App 
{
    public static void main( String[] args )
    {      /////  Задание  1 - проверка  работоспособности
        task1.searching(2); System.out.println();
        task1.searching(3); System.out.println();
        task1.searching(5); System.out.println();
        task1.searching(7); System.out.println();
        System.out.println("Сумма  значений, кратных  2 равна  " + task1.searchingSum(2) );
        System.out.println("Сумма  значений, кратных  3 равна  " + task1.searchingSum(3) );
        System.out.println("Сумма  значений, кратных  5 равна  " + task1.searchingSum(5) );
        System.out.println("Сумма  значений, кратных  7 равна  " + task1.searchingSum(7) );
        int razSum72=task1.searchingSum(7)-task1.searchingSum(2);
        System.out.println("Разность сумм  7  и  2  равна  " + razSum72);
        double delSum53=((double)task1.searchingSum(5))/((double)task1.searchingSum(3));
        System.out.println("Отношение  сумм 5  к  3  равно  " + delSum53);
        System.out.println("///////////////////////////////////////////////////");
        
        ///////// Задание  2 - проверка работоспособности
        task2.switching();
        ///////// Задание  3 - проверка работоспособности
        System.out.println(task3.speech());
        System.out.println("///////////////////////////////////////////////////");
        ///////// Задание 4  - проверка работоспособности
        task4.arrays(10);
        System.out.println("///////////////////////////////////////////////////");
        ///////// Задание 5  - проверка работоспособности
        task5.arrays2D(4,4);
    }
}
