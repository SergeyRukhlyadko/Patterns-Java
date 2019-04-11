package creational.builder;

public class Manufactory {

    public static void main(String... args) {
        DeskDirector director = new DeskDirector();
        DeskBuilderImpl deskBuilder = new DeskBuilderImpl();
        director.constructRoundDesk(deskBuilder);
        Desk desk = deskBuilder.getResult();
        System.out.println("Builded desk: " + desk);

        DeskManualBuilder manualBuilder = new DeskManualBuilder();
        director.constructRoundDesk(manualBuilder);
        DeskManual manual = manualBuilder.getResult();
        System.out.println(manual.print());
    }
}
