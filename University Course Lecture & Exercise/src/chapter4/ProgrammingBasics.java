package chapter4;

public class ProgrammingBasics {
    public static final String LECTURE_NAME = "Software Engineering and Programming Basics";
    private String topic;

    public ProgrammingBasics(String topic) {
        this.topic = topic;
    }

    public static void main(String[] args) {
        ProgrammingBasics[] ourTopics = new ProgrammingBasics[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                ourTopics[i] = new ProgrammingBasics("Topic " + i);
            } else {
                ourTopics[i] = new ProgrammingBasics("Fantastic Topic " + i);
            }
        }

        Boolean theEnd = false;
        int counter = 0;
        while (!theEnd) {
            if (counter == 9) {
                theEnd = true;
            }
            ourTopics[counter].printTopic();
            counter++;
        }
    }

    private void printTopic() {
        System.out.println(this.topic);
    }
}
