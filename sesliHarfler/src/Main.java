public class Main {
    public static void main(String[] args) {
        char ince='E';
        switch (ince){
            case 'E':
            case 'İ':
            case 'Ü':
            case 'Ö':
                System.out.println("ince sesli harf");
                break;
            default:
                System.out.println("kalın sesli harf");
        }

        }
    }
