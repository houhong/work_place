package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName TestDemo9
 * @Description
 * @Author lzq
 * @Date 2018/12/18 12:01
 * @Version 1.0
 **/
public class answer {
    public static void main(String[] args) {
        List<List<Integer>> lists1 = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(8);

        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(13);

        lists1.add(list1);
        lists1.add(list2);

        List<List<Integer>> lists2 = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(12);

        lists2.add(list);

        /**
         * 例如交集{[4,8],[9,13]}和{[6,12]}的交集是{[6,8],[9,12]}
         */
        manage(lists1,lists2);
    }

    /**
     * 参数校验
     * @param lists
     * @return
     */
    private static boolean islegal(List<List<Integer>> lists) {
        if(lists.size() < 1) {
            return false;
        }
        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext()) {
            List<Integer> list1 = iterator.next();
            if(list1.size() != 2) {
                return false;
            }
            if(list1.get(0) >= list1.get(1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 两个有序的集合，集合的每个元素都是一段范围，求其交集
     * 所求交集结果直接打印到输出终端
     * @param lists1
     * @param lists2
     */
    private  static void manage(List<List<Integer>> lists1,List<List<Integer>> lists2) {
        if(!islegal(lists1) || !islegal(lists2)) {
            return;
        }
        Iterator<List<Integer>> iterator = lists1.iterator();
        while(iterator.hasNext()) {
            List<Integer> list1 = iterator.next();;
            Iterator<List<Integer>> iterator1 = lists2.iterator();
            while (iterator1.hasNext()) {
                List<Integer> list2 = iterator1.next();
                intersection(list1,list2);
            }
        }
    }

    /**
     * 求区间交集
     * @param list1
     * @param list2
     */
    public static void intersection(List<Integer> list1,List<Integer> list2) {
       int start1 = list1.get(0);
        int end1 = list1.get(1);
        int start2 = list2.get(0);
        int end2 = list2.get(1);
        //除去没有交集的情况
        if(start2 > end1 || start1 > end2) {
            return;
        }
        //然后给这四个点排序，去掉最大的和最小的点，剩下中间的那两个点就是他们的交集
        int[] array = {start1,end1,start2,end2};
        Arrays.sort(array);
        int left = array[1];
        int right =  array[2];
        System.out.println("["+left+","+right+"]");
    }
}

