import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Field field = new Field(2);
        field.fillField();
        field.outField();
        System.out.println(field.cellArray[13][9].getChecker().getColor());

        System.out.println(field.cellArray[11][5].getChecker().getColor());
        field.cellArray[13][9].moveChecker(true, true, true, field);
        field.cellArray[11][5].moveChecker(false, true, true, field);
        field.outField();
    }
}