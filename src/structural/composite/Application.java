package structural.composite;

class Application {

    public static void main(String... args) {
        CompositeSubject subj = new CompositeSubject(new Box(), new Headphones(), new Phone());
        System.out.println(subj.getPrice());

        CompositeSubject subjInner1 = new CompositeSubject(new Box(), new Headphones());
        CompositeSubject subjInner2 = new CompositeSubject(new Box(), new Phone());
        CompositeSubject subjMain = new CompositeSubject(subjInner1, subjInner2);
        System.out.println(subjMain.getPrice());
    }
}
