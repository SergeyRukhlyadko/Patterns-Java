package structural.bridge;

interface DeskDirector {

    void constructRoundDesk(DeskBuilder builder);

    void constructRhombusDesk(DeskBuilder builder);

    void constructSquareDesk(DeskBuilder builder);
}
