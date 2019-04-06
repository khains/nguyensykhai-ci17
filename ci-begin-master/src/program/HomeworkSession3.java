package program;

import java.util.ArrayList;

public class HomeworkSession3 {
    /**
     * Tìm kiếm chuỗi dài nhất trong list và trả về
     * @param list: list đầu vào
     * @return
     */
    public static String findMaxLength(ArrayList<String> list) {
        String maxLength = null;
        int max = 0;
        if(list != null && list.size() > 0) {
//            for (int i = 0; i < list.size(); i++) {
//                String s = list.get(i);
//                if(s != null && s.length() > max) {
//                    maxLength = s;
//                    max = s.length();
//                }
//            }
            for(String s : list) { // foreach
                if(s != null && s.length() > max) {
                    maxLength = s;
                    max = s.length();
                }
            }
        }
        return maxLength;
    }

    /**
     * Tính tổng độ dài của tất cả các chuỗi trong list và trả về
     * @param list: list đầu vào
     * @return
     */
    public static int findTotalLength(ArrayList<String> list) {
        int totalLength = 0;
        for(String s : list) {
            if(s != null) {
                totalLength += s.length();
            }
        }
        return totalLength;
    }

    public static void main(String[] args) {
        // listString.add() // dua phan tu vao mang
        // listString.size() // lay kich thuoc cua mang
        // listString.get() // lay ra phan tu
        // listString.remove() // bo di phan tu
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Lorem");
        listString.add("Ipsum");
        listString.add("is");
        listString.add("simply");
        listString.add("dummy");
        listString.add("of");
        listString.add("the");
        listString.add("printing");
        listString.add("and");
        listString.add("typesetting");
        listString.add("industry");

        // ví dụ thao tác với mảng
        System.out.println("List string:");
        System.out.println("<<<");
        for (int i = 0; i < listString.size(); i++) {
            String s = listString.get(i);
            System.out.println(s + " - length: " + s.length());
        }
        System.out.println(">>>");

        // in kết quả chạy thử hàm sau khi đã hoàn thiện phần TODO
        System.out.println("Longest string in list");
        String longestString = findMaxLength(listString);
        System.out.println(longestString); // "typesetting"

        System.out.println("Total length of strings in list");
        int totalLength = findTotalLength(listString);
        System.out.println(totalLength); // 58
    }
}
