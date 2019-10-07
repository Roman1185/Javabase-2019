import java.util.Random;
public class LitsJava {
    public static void main(String[] args) {
        var a = new Random().nextInt(3000);
        var sum = 0;
        var c = 1;
        while (c <= 15) {
            sum= a + sum;
            c++;
        }
        var medium=sum/15;
            System.out.println(sum);
        System.out.println(medium);
        }
    }






         /*   System.out.println(a);
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

          */



