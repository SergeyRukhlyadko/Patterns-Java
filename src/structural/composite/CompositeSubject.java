package structural.composite;

import java.util.ArrayList;
import java.util.Arrays;

class CompositeSubject implements Subject {

    private ArrayList<Subject> subjects;

    CompositeSubject() {
        this.subjects = new ArrayList<>();
    }

    CompositeSubject(Subject... subject) {
        subjects = new ArrayList<>(subject.length);
        subjects.addAll(Arrays.asList(subject));
    }

    void addSubject(Subject... subject) {
        subjects.addAll(Arrays.asList(subject));
    }

    @Override
    public Double getPrice() {
        Double price = 0.0;
        for(Subject s : subjects) {
            price += s.getPrice();
        }
        return price;
    }
}
