package tarea1;

public class Tarea1 {
    public Tarea1() {};

    public String invertir(int number) {
        int rev = 0; // reversed number
        int rem;   // remainder

        while(number>0){

            rem = number%10;
            rev = (rev*10) + rem;
            number = number/10;
        }

        return Integer.toString(rev);
    }
}
