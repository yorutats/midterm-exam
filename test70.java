package test70;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        String[] pas = scanner.nextLine().split(" ");
        Map<String, Integer> Caesar = new HashMap<>();
        Map<String, String> ciphertext = new HashMap<>();
        String[] key={"00","01","100","101","1100","1101","11100","11101","111100","111101"};
        String binary="";
        for (int i = 0; i < key.length; i++) {
            Caesar.put(key[i], i);
        }
        for (int i = 0; i < pas.length; i++) {
            binary+=Caesar.get(pas[i]);
        }
        
        String[] words ={"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"};
        for (int i = 0; i < words.length; i++) {
                if (i<10) {
                    ciphertext.put("0"+Integer.toString(i+1), words[i]);
                } else {
                    
                    ciphertext.put(Integer.toString(i+1), words[i]);
                }
            
        }

        System.out.println(ciphertext.get(binary));
    }
}
