package uits.jv1605.dmitriev.basictypes.hw2;
public class task5 {
    public static void arrays2D(int m, int n){
       int array2D[][]=new int[m][n];
   for (int i=0; i<array2D.length;i++){
       for (int j=0; j<array2D.length; j++){
    array2D[i][j]=(int)(Math.random()*100);}}
   System.out.println("Массив задания 5 в прямом порядке");
   for (int i=0; i<array2D.length;i++){
       System.out.println(java.util.Arrays.toString(array2D[i]));}   
  System.out.println("Массив задания 5 в обратном порядке");
  for (int i=0; i<array2D.length;i++){  // Инверсия массива
    for (int k=0; k<array2D.length/2;k++){
        int tmp=array2D[i][k];
        array2D[i][k]=array2D[i][array2D.length-k-1];
        array2D[i][array2D.length-k-1]=tmp;}}
  for (int i=0; i<array2D.length;i++){
       System.out.println(java.util.Arrays.toString(array2D[i]));}
  // Выводим четные элементы для каждой четной строки
  for (int i=0; i<array2D.length; i++){
    for (int j=0; j<array2D.length; j++){
        if (i%2==0){ if(array2D[i][j]%2==0){System.out.print(array2D[i][j]+ "  ");}} }
  }   System.out.println();
  // Выводим нечетные элементы для каждой нечетной строки
    for (int i=0; i<array2D.length; i++){
    for (int j=0; j<array2D.length; j++){
        if (i%2!=0){ if(array2D[i][j]%2!=0){System.out.print(array2D[i][j]+ "  ");}} }}
    System.out.println();
    // Выводим сумму всех  элементов, кратных  7
    int sum72D=0;
    for (int i=0; i<array2D.length; i++){
    for (int j=0; j<array2D.length; j++){
        if (i%2==0){ if(array2D[i][j]%7==0){sum72D+=array2D[i][j];}} }
  }   System.out.println("Сумма  всех элементов, кратных 7, в четных строках = " + sum72D);
// Выводим произведение  элементов, кратных 3 в нечетных строках
      int pr32D=1;
    for (int i=0; i<array2D.length; i++){
    for (int j=0; j<array2D.length; j++){
        if (i%2!=0){ if(array2D[i][j]%3==0){pr32D*=array2D[i][j];}} }
  }   System.out.println("Произведение  всех элементов, кратных 3, в нечетных строках = " + pr32D);
    }
}
