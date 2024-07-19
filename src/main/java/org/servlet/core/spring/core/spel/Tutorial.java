package org.servlet.core.spring.core.spel;

import java.util.ArrayList;
import java.util.List;

public class Tutorial {

    // Class data members
    private String name;

    private List<Topic> topicsList = new ArrayList<>();

    // Getter
    public String getName() { return name; }

    // Setter
    public void setName(String name) { this.name = name; }

    // Method
    public List<?> getTopicsList() { return topicsList; }

    // Setter
    public void setTopicsList(List<Topic> topicsList)
    {
        this.topicsList = topicsList;
    }

    // Method
    // Overloading toString() method
    public String toString() { return name + topicsList; }
}
