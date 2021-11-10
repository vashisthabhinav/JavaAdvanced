package com.company.advanced;
@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
//    void thisMethod2();
}
class Phone{
    public void showTime(){
        System.out.println("Time is 12AM");
    }
}
class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class java_10_Annotations {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
            NewPhone phone = new NewPhone();
            phone.showTime();
            phone.sum(5, 6);
    }
}
