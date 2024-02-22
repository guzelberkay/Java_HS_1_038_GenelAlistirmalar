package com.berkay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        /**
         * List ve ArrayList Kullanımı
         * -- İçerisinde User adında bir sınıf barındıran bir ArrayList oluşturunuz.
         * User -> İd, ad, soyad, yas, bilgileri olacak
         * 5 farklı user nesnesi oluşturunuz ve listenin içine ekleyiniz.
         * -------------------
         * Elimizde kullanıcı bilgileri olduğu bir listemiz olsun, burada bizden bazı istatistikler
         * istenmektedi. Bunları böyle sıralayalım
         * -- Toplam Kullanıcı sayısın
         * -- Kullanıcıların yas ortalaması
         * gibi bilgiler bizden istenmektedir. Bu istekleri kullanabilmek için
         * efektif Collection türlerini seçerek uygulayınız
         */
        List<User> userList = new ArrayList<>();
        User user1 = new User("Berkay", "Guzel", 26);
        User user2 = new User("Saban", "Findikoglu", 77);
        User user3 = new User("Ecem", "Guzel", 25);
        User user4 = new User("Ayse", "Findikoglu", 67);
        User user5 = new User("Alex", "Guzel", 40);
        User user6 = new User("Ada", "Guzel", 5);
        User user7 = new User("Cinar", "Guzel", 10);
        User user8 = new User("Sevda", "Bingol", 40);
        User user9 = new User("Elif", "Bingol", 22);
        User user10 = new User("Adil", "Bingol", 51);

        userList = new ArrayList<>(List.of(user1,user2,user3,user4,user5,user6,user7,user8,user9,user10));
        int kullaniciSayisi = userList.size();
        /**
         * elimizdeki bir arryList i map a çevirdik
         * yaşlarına göre grupladık.
         */
        Map<Integer, List<User>> userYasGrubu = userList.stream().collect(Collectors.groupingBy(User::getYas));
        userYasGrubu.get(40).size();

//        Map<Integer, List<User>> userYasGrubu = new HashMap<>();
//        if (userYasGrubu.containsKey(user1.getYas())){
//            List<User> yasGrubu = userYasGrubu.get(user1.getYas());
//            yasGrubu.add(user1);
//           userYasGrubu.put(user1.getYas(),yasGrubu);
//        }else {
//            userYasGrubu.put(user1.getYas(),List.of(user1));
//        }


//        int toplamlisi = userList.size();
//        for (int i= 0; i<userList.size();i++) {
//             yasToplam += userList.get(i).getYas();
//        }
//        int ortalamaYas = yasToplam/10;
//        System.out.println("Yas ortalamasi : "+ortalamaYas);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Aradiginiz ismi yaziniz : ");
//        String aranan = scanner.nextLine();
//        /**
//         * Asenkron işlemler ve atomik değişkenler?
//         */
//        AtomicBoolean flag = new AtomicBoolean(false);
//
//        userList.forEach(a -> {
//            if (a.getAd().contains(aranan)) {
//                System.out.println("Aranan isim -->" + a);
//                flag.set(true);
//            }
//        });
//        if (!flag.get()){
//            System.out.println("Aradiginiz kayit yoktur.");
//        }
//
//
//
//        Random sayi = new Random();
//        int pozisyon = 0;
//       for (int i= 0; i<20;i++){
//            pozisyon = sayi.nextInt(0,4);
//       }
//        System.out.println(userList.get(pozisyon).getAd());
    }

}