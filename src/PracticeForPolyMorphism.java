public class PracticeForPolyMorphism {
//overloading polymorphism ,static or compile time
//return type with parameter
public static  int add (int a, int b){
    return (a+b);
}
public static int add (int a,int b,int c){
    return (a+b+c);

}
    //2.method overloading with changing datatype
    static int add (int a, int b,String c) {
        System.out.println(c);
        return(a+b);
    }

    public static void main(String[] args) {
        System.out.println(add(34,20));
        System.out.println(add(34,20,30));
        System.out.println(add(2,3,"Prakash"));
        System.out.println(add(10.20,20.40));
}


   //different - example
   static double add (double a,double b) {
          return a+b;

   }

    }


