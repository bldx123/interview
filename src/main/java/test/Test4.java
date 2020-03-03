package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test4 {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<1000;i++){
            list.add(String.valueOf((char)('a'+ random.nextInt(26))));
        }
        System.out.println(count(list,"a"));
    }

    /**
     * 统计list中含字符串a的数量
     * @param list
     * @param a
     * @return
     */
    private static int count(List<String> list,String a){
        return 0;
    }
}
