package org.servlet.core.spring.core.annotations.builtin;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("sonoo");
        list.add("vimal");
        list.add("ratan");

        for(Object obj:list)
            System.out.println(obj);

    }
}
