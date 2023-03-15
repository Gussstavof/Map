import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> numbersHashMap = new HashMap<>();
        Map<Integer, Integer> numbersLinkedHashMap= new LinkedHashMap<>();
        Map<Integer, Integer> numbersTreeMap= new TreeMap<>();

        var elements = 1000000L;

        System.out.println("add element in HashMap: "+addElement(numbersHashMap, elements));
        System.out.println("add element in LinkedHashMap: "+addElement(numbersLinkedHashMap, elements));
        System.out.println("add element in TreeMap: "+addElement(numbersTreeMap, elements));

        System.out.println("----------------------------------------");

        System.out.println("search element in HashMap: "+checkElements(numbersHashMap));
        System.out.println("search element in LinkedHashMap: "+checkElements(numbersLinkedHashMap));
        System.out.println("search element in TreeMap: "+checkElements(numbersTreeMap));


        System.out.println("----------------------------------------");

        System.out.println("remove element in HashMap: "+removeElement(numbersHashMap));
        System.out.println("remove element in LinkedHashMap: "+removeElement(numbersLinkedHashMap));
        System.out.println("remove element in TreeMap: "+removeElement(numbersTreeMap));

    }

    private static long addElement(Map<Integer, Integer> list, Long elements){
        long ini = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list.put(i, i * 2);
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long checkElements(Map<Integer, Integer> list){
        long ini = System.currentTimeMillis();

        list.containsValue(20000);

        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long removeElement(Map<Integer, Integer> list) {
        long ini = System.currentTimeMillis();

        list.remove(15000);

        long fim = System.currentTimeMillis();
        return fim-ini;
    }
}
