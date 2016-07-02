package Homework6.Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MusicShop {
    private String name;
    private List<MusicalInstrument> musicalInstruments;

    public MusicShop(String name, List<MusicalInstrument> musicalInstruments) {
        this.name = name;
        this.musicalInstruments = musicalInstruments;
    }

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMusicalInstrument(MusicalInstrument instrument) {
        musicalInstruments.add(instrument);
    }

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) {
        List<MusicalInstrument> listOtgruzki = new ArrayList<>();
        for (Map.Entry<String, Integer> strokaZakaza : order.entrySet()) {
            int kolichestvoVZakaze = strokaZakaza.getValue();
            int kolichestvoOtgrujenogoTovara = 0;
            String nazvanieZakazannogoInsrumenta = strokaZakaza.getKey();
            int kolichestvoVMagazine = 0;
            for (MusicalInstrument instrument : musicalInstruments) {
                if (instrument.getName().equals(nazvanieZakazannogoInsrumenta)) {
                    kolichestvoVMagazine++;
                }
            }
            if (kolichestvoVZakaze > kolichestvoVMagazine) {
                try {
                    throw new WrongGoodsAreMissingException("Товара не хватает! Отгрузка отменена!");
                } catch (WrongGoodsAreMissingException e) {
                    System.out.println(e.getWrongKey());
                }
            }
            for (int index = musicalInstruments.size() - 1; index >= 0; index--) {
                MusicalInstrument instrumentVMagazine = musicalInstruments.get(index);
                if (nazvanieZakazannogoInsrumenta == instrumentVMagazine.getName() && kolichestvoVZakaze > kolichestvoOtgrujenogoTovara) {
                    MusicalInstrument otgrujenijInstrument = musicalInstruments.remove(index);
                    listOtgruzki.add(otgrujenijInstrument);
                    kolichestvoOtgrujenogoTovara++;
                }
            }
        }
        return listOtgruzki;
    }
}