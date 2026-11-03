package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        //Խնդիր 1
        DynamicArray da1 = new DynamicArray();
        da1.add(5);
        da1.add(10);
        da1.add(15);
        da1.add(20);
        da1.add(25);
        da1.print();
        System.out.println("______");

        //Խնդիր 2

        DynamicArray da2 = new DynamicArray();
        for (int i = 0; i < 16; i++) {
            da2.add(i);
        }
        da2.print();

        System.out.println("______");

        //Խնդիր 3
        DynamicArray da3 = new DynamicArray();
        for (int i = 0; i < 26; i++) {
            da3.add(i);
        }
        da3.print();
        System.out.println("Առաջին էլեմենտը: " + da3.getByIndex(0));
        System.out.println("Վերջին էլեմենտը: " + da3.getByIndex(25));
        System.out.println("Բացասական ինդեքսը: " + da3.getByIndex(-1));
        System.out.println("Գոյություն չունեցող ինդեքսը: " + da3.getByIndex(27));

        System.out.println("______");
        //Խնդիր 4
        DynamicArray da4 = new DynamicArray();
        System.out.println(da4.getByIndex(0));
    }
}
