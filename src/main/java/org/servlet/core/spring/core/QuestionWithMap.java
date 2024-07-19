package org.servlet.core.spring.core;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class QuestionWithMap {
    private int id;
    private String name;
    private Map<String,String> answers;
    public QuestionWithMap() {}
    public QuestionWithMap(int id, String name, Map<String, String> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo(){
                System.out.println(id+" "+name);
                System.out.println("answers are:");
        Set<Map.Entry<String, String>> set=answers.entrySet();
        Iterator<Map.Entry<String, String>> itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry<String,String> entry=itr.next();
            System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());
        }
    }
}
