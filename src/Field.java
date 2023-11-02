import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Field {
    FileReader fileReader;
    Cell[][] cellArray = new Cell[17][25];
    int amountOfPlayers;

    public Field(int amountOfPlayers) {
        this.amountOfPlayers = amountOfPlayers;
    }

    public void fillFieldFor2Players() {
        cellArray[0][12] = new Cell(new Checker(Colors.RED, 12, 0));
        cellArray[1][11] = new Cell(new Checker(Colors.RED, 11, 1));
        cellArray[1][13] = new Cell(new Checker(Colors.RED, 13, 1));
        cellArray[2][10] = new Cell(new Checker(Colors.RED, 10, 2));
        cellArray[2][12] = new Cell(new Checker(Colors.RED, 12, 2));
        cellArray[2][14] = new Cell(new Checker(Colors.RED, 14, 2));
        cellArray[3][9] = new Cell(new Checker(Colors.RED, 9, 3));
        cellArray[3][11] = new Cell(new Checker(Colors.RED, 11, 3));
        cellArray[3][13] = new Cell(new Checker(Colors.RED, 13, 3));
        cellArray[3][15] = new Cell(new Checker(Colors.RED, 15, 3));
    }

    public void fillField() throws IOException {
        fileReader = new FileReader("E:\\VSU\\ChineseCheckers\\src\\task2.txt");
        Scanner scanner = new Scanner(fileReader);
        int i = -1;
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            i++;
            int j = 0;
            for (int k = 0; k < line.length(); k++) {
                char ch = line.charAt(k);
                switch (ch) {
                    case ('1'):
                        cellArray[i][j] = new Cell();
                        break;
                    case ('2'):
                        cellArray[i][j] = new Cell(new Checker(Colors.RED, j, i));
                        break;
                    case ('3'):
                        cellArray[i][j] = new Cell(new Checker(Colors.BLUE, j, i));
                        break;
                    case ('4'):
                        cellArray[i][j] = new Cell(new Checker(Colors.GREEN, j, i));
                        break;
                    case ('5'):
                        cellArray[i][j] = new Cell(new Checker(Colors.ORANGE, j, i));
                        break;
                    case ('6'):
                        cellArray[i][j] = new Cell(new Checker(Colors.PURPLE, j, i));
                        break;
                    case ('7'):
                        cellArray[i][j] = new Cell(new Checker(Colors.PINK, j, i));
                        break;
                    default:
                        cellArray[i][j] = null;
                }
                j++;
            }
        }
        fileReader.close();
    }

    public void outField() {
        for (int i = 0; i < cellArray.length; i++) {
            for (int j = 0; j < cellArray[0].length; j++) {
                if (cellArray[i][j] == null) {
                    System.out.print(" ");
                } else if (cellArray[i][j].canBeVisited()) {
                    System.out.print("1");
                } else switch (cellArray[i][j].getChecker().getColor()) {
                    case RED -> System.out.print("2");
                    case BLUE -> System.out.print("3");
                    case PINK -> System.out.print("7");
                    case GREEN -> System.out.print("4");
                    case ORANGE -> System.out.print("5");
                    case PURPLE -> System.out.print("6");
                    default -> System.out.print("▢");
                }
            }
            System.out.println();
        }
    }
}
/*
0000000000002000000000000
0000000000020200000000000
0000000000202020000000000
0000000002020202000000000
3030303010101010104040404
0303030101010101010404040
0030301010101010101040400
0003010101010101010104000
0000101010101010101010000
0006010101010101010105000
0060601010101010101050500
0606060101010101010505050
6060606010101010105050505
0000000007070707000000000
0000000000707070000000000
0000000000070700000000000
0000000000007000000000000

 */