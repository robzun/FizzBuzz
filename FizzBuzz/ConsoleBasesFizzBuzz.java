public class ConsoleBasesFizzBuzz implements FizzBuzz {
    public void print(int from, int to){
        for(from = 1; from <= to; from++){
            if(from % 3 == 0 && from % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(from % 3 == 0){
                System.out.println("Fizz");
            }else if(from % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(from);
            }
        }
    }
}