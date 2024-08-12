public class Main {
    public static void main(String[] args) {
        System.out.println("привет мир!");


        int a = 1222333444;
        byte b = 99;
        short c = 17296;
        long d = 8789678567876556807l;
        float k = 3.96799775544f;
        double f = 1.1E+3;


        double f1 = 27.12;
        long d1 = 987678965549l;
        double f2 = 2.786;
        short c1 = 569;
        short c2 = -159;
        short c3 = 27897;
        byte b1 = 67;


        byte lp = 23;
        System.out.println("людмила павловна=" + lp + "ученика");
        byte as = 27;
        System.out.println("анна сергеевна=" + as + "ученика");
        byte ea = 30;
        System.out.println("екатерина андреевна=" + ea + "ученика");
        short paper = 480;
        System.out.println("бумаги=" + paper);
        byte q = 23 + 27 + 30;
        System.out.println("всего ученников=" + q);
        short onlyOne = 480 / 80;
        System.out.println("на каждого ученика расчитано=" + onlyOne + "листов бумаги");


        short efficiencyCar = 16 / 2;
        System.out.println("производительность машины за 1 мин=" + efficiencyCar);
        int effiCar = efficiencyCar * 20;
        System.out.println("производительность машины за 20 мин=" + effiCar);
        int effiCarDay = efficiencyCar * 24 * 60;
        System.out.println("производительность машины в день=" + effiCarDay);
        int effiCar3Day = effiCarDay * 3;
        System.out.println("производительность машины за 3 дня =" + effiCar3Day);
        int effiCarMonth = effiCarDay * 30;
        System.out.println("производительность за месяц=" + effiCarMonth);


        int pointOneClass = 2 + 4;
        System.out.println("ккраски на 1 класс=" + pointOneClass);
        int pointWight = 2;
        System.out.println("белой краски на 1 класс" + pointWight);
        int pointBrown = 4;
        System.out.println("корничневой краски на 1 класс=" + pointBrown);
        int pointMax = 120;
        System.out.println("всего краски=" + pointMax);
        int classRoom = pointMax / pointOneClass;
        System.out.println("всего класов =" + classRoom);
        int wightClass = classRoom * pointWight;
        System.out.println("белой краски=" + wightClass);
        int brownClass = classRoom * pointBrown;
        System.out.println("коричневой краски=" + brownClass);
        System.out.println("в школе , где " + classRoom + "классов,нужно" + wightClass + "банок белой краски и" + brownClass + "баок корричневой краски");


        int grammInKg = 1000;
        int mlInGr = 105;
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egs = 70;
        int bananaPieces = 5;
        int milkPieces = 210;
        int iceCreampieces = 2;
        int egsPieces = 4;
        int resultat = (banana * bananaPieces) + (milk * milkPieces) + (iceCream * iceCreampieces) + (egs * egsPieces);
        int resultatKg = resultat / grammInKg;
        System.out.println(resultatKg);


        int gramInKg = 1000;
        int weightSport = 7;
        int weightPower = gramInKg * weightSport;
        int minWeight = 250;
        int maxWeight = 500;
        int minDays = weightPower / maxWeight;
        int maxDays = weightPower / minDays;
        int avgDays = (minDays + maxDays) / 2;
        System.out.println("min:" + minDays);
        System.out.println("max:" + maxDays);
        System.out.println("avg:" + avgDays);


    }
}