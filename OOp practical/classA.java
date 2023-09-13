public class classA {
    public void show(){
        System.out.println("From A");
    }
    
}
class classB extends classA{
    public  void show(){
        super.show();
        System.out.println("From B");
    }
}
// class classC extends classA{
//     public void showC(){
//         System.out.println("From C");
//     }
// }
