import java.util.Random;
public class LitsJava {
    public static void main(String[] args) {
        var a = new Random().nextInt(3000);
            System.out.println(a);
            if(a%3==0){
                System.out.println("div on 3");
            }
            else if(a%5==0){
                System.out.println("div on 5");
            }
            else if(a%7==0){

            }
            else {
                System.out.println("doesnt div");
            }
        }


        }



