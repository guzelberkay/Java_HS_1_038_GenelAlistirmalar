package com.berkay;

import com.google.gson.*;
import com.berkay.entity.User;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunnerAPI {
    public static void main(String[] args) throws IOException {
        /**
         * List ve Array List Kullanımı
         * -- İçerisinde User adıda bir sınıf barındıran bir ArrayList oluşturunuz.
         * User -> id,ad,soyad,yas bilgileri olacak
         * 5 farklı user nesnesi oluşturunuz. ve listenin içine ekleyiniz.
         * ----------
         * Elimizde kullanıcı bilgilerini olduğu bir listemiz olsun, burada bizden bazı istatistikler
         * istenmektedir. Bunları şöyle sıralayalım;
         * -- Toplam kullanıcı sayısı
         * -- Belli bir yaştaki kullanıcı sayısı
         * -- Kullanıcıların yas ortalaması
         * gibi bilgiler bizden istenmektedir. Bu istekleri bulabilmek için en efektif Collection
         * türlerini seçerek uygulayınız.
         *
         */

        Scanner sc = new Scanner(
                new URL("https://randomuser.me/api/?results=5").openStream(),
                "UTF-8");
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            sb.append(sc.nextLine());
        }
        Gson gson = new Gson();
        JsonElement jsonElement = JsonParser.parseString(sb.toString());
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonArray jsonArray = jsonObject.getAsJsonArray("results");

        List<User> userList = new ArrayList<>();
        for (JsonElement jsonElement1 : jsonArray) {
            userList.add( gson.fromJson(jsonElement1, User.class));
        }

        userList.forEach(System.out::println);
    }
}
