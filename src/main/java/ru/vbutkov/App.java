package ru.vbutkov;

import org.apache.commons.lang3.StringUtils;
import ru.productstart.utils.ArrayUtils;


public class App {
    public static void main(String[] args) {
        System.out.println(StringUtils.reverse("Hello word!"));

        int result = ArrayUtils.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 8);
        System.out.println(result);
    }
}
