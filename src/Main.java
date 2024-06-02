public class Main {
    public static void main(String[] args) {

        int multiplyResult = multiply(4, 3);
        System.out.printf("multiply " + multiplyResult);
        System.out.println(animals("dog"));
        System.out.println(animals("mouse"));
    }

    private static int multiply(int number, int multiplyNumber) {
        int result = 1;
        for (int i = 0; i < multiplyNumber; i++) {
            result = result * number;
        }
        return result;
    }


    public static String animals(String animal) {
        switch (animal) {
            case "dog":
                return "I am the dog";
            case "cat":
                return "I am the cat";
            case "lion":
                return "I am the lion";
            case "pig":
                return "I am the pig";
            default:
                return "I am an animal";
        }
    }
}
//2.დაწერე მეთოდი, რომელსაც გადაეცემა
//ორი რიცხვი და დააბრუნე პირველი რიცხვი
//მეორე რიცხვის ხარისხში. მაგალითად თუ
//გადმოგვეცა 2 და 3 უნდა დავაბრუნოთ
//8(2*2*2) (გამოიყენეთ loop ები)


//1.დაწერე მეთოდი, რომელსაც გადაეცემა
//ცხოველის სახელი (სტრინგად). ამ მეთოდმა
//ძაღლის, კატის, ლომის, ღორის
//შემთხვევაში უნდა დაწეროს შესაბამისი
//სიტყვა. მაგალითად ძაღლის შემთხვევაში
//"I am the dog" და ა.შ. ხოლო სხვა
//ცხოველების შემთხვევაში "I Am an Animal"