import java.util.Random;
public class LitsJava {
    public static void main(String[] args) {
        var random = new Random().nextInt(500);
        var a = 1;
        var b = 0;
        while (a <= 50) {
            a++;
            if (random % 7 == 0) {
                System.out.println(random);
                b = b + random;
            }
            random = new Random().nextInt(500);
        }
        System.out.println("сума "+b);
        }
    }




        /*var random = new Random();
        for(int i=0;i<=10;i++){
            char c=(char)(random.nextInt(26)+'a');
            System.out.println(c);
        }
    }
    }
        /*var a = new Random().nextInt(3000);
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



