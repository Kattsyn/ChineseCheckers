public class Cell {

    private Checker checker;
    private boolean canBeVisited;
    private int x;
    private int y;

    public Cell(Checker checker) {
        this.checker = checker;
        this.canBeVisited = false;
        this.x = checker.getX();
        this.y = checker.getY();
    }
    public Cell() {
        this.canBeVisited = true;
        this.checker = null;
    }

    public void setChecker(Checker checker) {
        this.checker = checker;
    }

    public Checker getChecker() {
        return checker;
    }

    public void moveCheckerUpRight(Field field) {
        int y1 = this.y - 1;
        int x1 = this.x + 1;
        if (field.cellArray[y1][x1].canBeVisited) {
            //this.checker.moveUpRight();
            field.cellArray[y1][x1].setCanBeVisited(false);
            field.cellArray[y1][x1].setChecker(this.checker);
            this.checker = null;
            this.canBeVisited = true;
        }
    }

    public boolean canBeVisited() {
        return canBeVisited;
    }

    public void setCanBeVisited(boolean canBeVisited) {
        this.canBeVisited = canBeVisited;
    }
}
