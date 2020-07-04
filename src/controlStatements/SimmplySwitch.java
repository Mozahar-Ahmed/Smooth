package controlStatements;

public class SimmplySwitch {
    public static void main(String[] args) {
        char vowel='r';
        switch (vowel){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel in lower case");
                break;
            case 'A': case'E':case 'I':case 'O':case 'U':
                System.out.println("Vowel in upper case");
                break;
            default:
                System.out.println("Consonent");
        }
    }
}
