// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        char letter = '#';  

        
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println(letter + " is a vowel.");
        }
        
        else if ((letter >= 'A' && letter <= 'Z') && 
                 !(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')) {
            System.out.println(letter + " is a consonant.");
        }
        
        else {
            System.out.println(letter + " is an invalid input"); // 
        }
    }
}
  

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }

