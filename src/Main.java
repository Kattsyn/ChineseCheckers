import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Field field = new Field(2);
        field.fillField();
        field.outField();
        System.out.println(field.cellArray[13][9].getChecker().getColor());
        field.cellArray[13][9].moveCheckerUpRight(field);
        field.outField();
    }
}