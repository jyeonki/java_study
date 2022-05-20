package day03;

public class Loop02 {

    public static void main(String[] args) {

        apple: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                if (lower == 'f') break apple;
                System.out.printf("%c - %c\n", (int)upper, (int)lower);
            } // inner for
//            if(upper == 'D') break;
        } // outer for
    }
}

