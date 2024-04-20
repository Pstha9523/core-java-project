package strings_Char;

public class OddCharacter {


    //WAP to create a string of length n where each character should only appear odd number of times. Example Dog,  Cat, mom (error).
    // 1 > n < 50000
    public static String generateOddOccurrenceString(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            sb.append(c); // Append the character
            sb.append(c); // Repeat the character to make its occurrence odd
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "dog";
        String oddOccurrenceString = generateOddOccurrenceString(input);
        System.out.println("String with odd occurrence of characters: " + oddOccurrenceString);
    }
}



