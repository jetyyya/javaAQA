public class HW22 {
    public static void main(String[] args) {

        System.out.println("Частина перша");
        String name = "Денис";
        int age = 43;
        double weight = 112.8;
        System.out.println("Ім'я=" + name + ", Зріст=" + age + ", Вага=" + weight);

        System.out.println("Частина друга");{
        int a = 1;
        int b = 2;
        System.out.println("До обміну:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Після обміну:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);}

        System.out.println("Частина третя");
        int a = 5;
        int b = 3;
        System.out.println("До обміну:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Після обміну:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

