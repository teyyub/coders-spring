package org.servlet.core.spring.core.spel;

import org.springframework.beans.factory.annotation.Value;

public class Training {

    // Class data member
    private Topic topic;

    @Value("#{tutorial.topicsList[0]}")
    private Topic defaultTopic;
    // Getter
    public Topic getTopic() { return topic; }

    // Setter
    public void setTopic(Topic topic)
    {
        this.topic = topic;
    }

    public Topic getDefaultTopic() {
        return defaultTopic;
    }

}
