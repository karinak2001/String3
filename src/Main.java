public class Main {
    public static void main(String[] args) {

        String name = "Karina Kiryanov";
        char toFind = 'o';


        boolean check = contains(name, toFind);
        System.out.println("Is the char: '" + toFind + "' is in the string? " + contains(name, toFind));
    }





    public static boolean contains(String text, char toFind){
        boolean contains = false;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == toFind){
                contains = true;
                break;
            }
        }
        return contains;
    }




}