package uits.jv1605.dmitriev.basictypes.hw2;
public class task2 {
  public static void switching(){
    int x=(int)(Math.random()*100);
    String str;
    switch(x){
        case 0: str="Ноль"; break;
        case 1: str="Один"; break;
        case 2: str="Два"; break;
        case 3: str="Три"; break;
        case 4: str="Четыре"; break;
        case 5: str="Пять"; break;
        case 6: str="Шесть"; break;
        case 7: str="Семь"; break;
        case 8: str="Восемь"; break;
        case 9: str="Девять"; break;
        case 10: str="Десять"; break;
        case 11: str="Одиннадцать"; break;
        case 12: str="Двеннадцать"; break;
        case 13: str="Тринадцать"; break;
        case 14: str="Четырнадцать"; break;
        default: str="Дофига";}
  System.out.println("Второе  задание вывело  " + str+ " " + x);}  
}
