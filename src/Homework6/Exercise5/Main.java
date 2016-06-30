package Homework6.Exercise5;


import java.util.*;

public class Main {

    private static int div(int kolichestvoOtgrujenogoTovara) {
        if (kolichestvoOtgrujenogoTovara == 0) try {
            throw new WrongKeyException("111");
        } catch (WrongKeyException e) {
            e.printStackTrace();
        }
        return kolichestvoOtgrujenogoTovara;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MusicalInstrument> instruments = createShopContent(sc);
        print(instruments);
        testMusicShop(sc, instruments);
    }

    private static int getUserInput(Scanner sc, String massage) {
        int input;
        System.out.println(massage);
        input = sc.nextInt();
        return input;
    }

    private static Map<String, Integer> prapareOrder(int zakazanoGitar, int zakazanoPiano, int zakazanoTrumpet) {
        System.out.println("Order #" + System.nanoTime());
        Map<String, Integer> order = new HashMap<>();
        order.put("Guitar", zakazanoGitar);
        order.put("Piano", zakazanoPiano);
        order.put("Trumpet", zakazanoTrumpet);

        for (Map.Entry<String, Integer> orderElement : order.entrySet()) {
            System.out.print(orderElement.getKey() + ": ");
            System.out.println(orderElement.getValue());
        }
        return order;
    }

    private static void testMusicShop(Scanner sc, List<MusicalInstrument> instruments) {
        while (true) {
            try {
//                List<MusicalInstrument> instruments = createShopContent(sc);
//                print(instruments);
                System.out.println("Введите колличество музыкальных инструментов (для заказа)");
                MusicShop shop = new MusicShop("Музыкальный магазин", instruments);
                int zakazanoGitar = getUserInput(sc, "Количество гитар");
                int zakazanoPiano = getUserInput(sc, "Количество пианино");
                int zakazanoTrumpet = getUserInput(sc, "Количество музыкальный труб");

                Map<String, Integer> order1 = prapareOrder(zakazanoGitar, zakazanoPiano, zakazanoTrumpet);
                List<MusicalInstrument> list = shop.prepareInstruments(order1);
                print(list);
                System.out.println("_______________________");
                print(shop.getMusicalInstruments());

            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            break;
        }
    }

    private static List<MusicalInstrument> createShopContent(Scanner sc) {
        System.out.println("Введите колличество музыкальных инструментов (в магазине)");
        int countPiano = getUserInput(sc, "Количество пианино");
        int countGuitar = getUserInput(sc, "Количество гитар");
        int countTrumpet = getUserInput(sc, "Количество музыкальный труб");
        List<MusicalInstrument> musicalInstruments = new ArrayList<>();

        for (int i = 0; i < countPiano; i++) {
            musicalInstruments.add(new Piano("Piano"));
        }
        for (int i = 0; i < countGuitar; i++) {
            musicalInstruments.add(new Guitar("Guitar"));
        }
        for (int i = 0; i < countTrumpet; i++) {
            musicalInstruments.add(new Trumpet("Trumpet"));
        }
        return musicalInstruments;
    }

    private static void print(List<MusicalInstrument> ostatkiVMagazine) {
        for (int i = 0; i < ostatkiVMagazine.size(); i++) {
            System.out.println(ostatkiVMagazine.get(i));
        }
    }


}