package customernumber.example;

import java. util. HashMap;
import java. util. Map;
public class Main {
    public static void main(String[] args) {

        System.out.println("私の愛知県の好きなゆるキャラ一覧");

        Map <String, String> userDate = new HashMap<>();
        userDate.put("オカザえもん", "岡崎市");
        userDate.put("あいさいさん", "愛西市");
        userDate.put("キャベゾウ", "田原市");
        userDate.put("トトまる", "蒲郡市");
        userDate.put("わん丸くん", "犬山市");
        userDate.put("トヨッキー", "豊橋市");

        for(Map.Entry<String, String> entry : userDate.entrySet()) {
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }

        String userKey = "いなりん";

        try {
            if (userDate.get(userKey) != null) {
                System.out.println(userDate.get(userKey));
            } else {
                throw new NullPointerException();
            }
        }catch(NullPointerException e){
            System.out.println(userKey + "は好きなゆるキャラではありません。");
        }
    }
}