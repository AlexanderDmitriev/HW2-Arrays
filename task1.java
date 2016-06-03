package uits.jv1605.dmitriev.basictypes.hw2;

public class task1 {
   public static void searching(int number){
   for (int i=0; i<=100; i++){
     if  (i%number==0){
       System.out.print(i + "  ");}}} 
   public static int searchingSum(int number){
       int sum=0;
   for (int i=0; i<=100; i++){
     if  (i%number==0){
       sum+=i;}}
   return sum;}   
}
