public class Exercise7 {
    public static void main(String[] args) {

    }
}

class Moor {

    private boolean[][] moor;

    public Moor(int rows, int columns, double probLand) {
        moor = new boolean[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                moor[r][c] = (Math.random() < probLand);
            }
        }
    }

    public int getNumRows() {
        return moor.length;
    }

    public int getNumColumns() {
        return moor[0].length;
    }

    public boolean land(int r, int c) {
        return (r >= 0) && (r < moor.length) &&
                (c >= 0) && (c < moor[0].length) &&
                moor[r][c];
    }

    public String toString() {
        String res = "";
        for (int r = 0; r < moor.length; r++) {
            for (int c = 0; c < moor[0].length; c++) {
                res = res + (moor[r][c] ? "*" : "o");
            }
            res = res + "\n";
        }
        return res;
    }
}

class Traversal {

    private int[] traversal;
    private Moor moor;
    private boolean found;

    public Traversal(Moor m) {
        moor = m;
        traversal = new int[moor.getNumColumns()];
        found = traverseMoor(moor, traversal);
    }

    public Moor moor() {
        return moor;
    }

    public boolean existsTraversal() {
        return found;
    }

    public int length() {
        if (found) {
            return traversal.length;
        } else {
            throw new RuntimeException("Traversal: traversal does not exist");
        }
    }

    public int step(int i) {
        if (found) {
            return traversal[i];
        } else {
            throw new RuntimeException("Traversal: traversal does not exist");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<moor.getNumRows(); i++){
            for(int j=0; j<moor.getNumColumns(); j++){
                if(traversal[j] == i){
                    sb.append("# ");
                }else if(moor.land(i,j)){
                    sb.append("* ");
                }else{
                    sb.append("o ");
                }
            }
            sb.append("\n");
        }
        return String.valueOf(sb);


    }

    // auxiliary methods

    private static boolean traverseMoor(Moor m, int[] path) {
        for (int row = 0; row < m.getNumRows(); row++) {
            if (searchTraversal(m, row, 0, path)) {
                return true;
            }
        }
        return false;
    }

    private static boolean searchTraversal(Moor m, int r, int c, int[] path) {
        if (!m.land(r, c)) {
            return false;
        } else {
            path[c] = r;
            if (c == m.getNumColumns() - 1) {
                return true;
            } else {
                return searchTraversal(m, r - 1, c + 1, path) ||
                        searchTraversal(m, r, c + 1, path) ||
                        searchTraversal(m, r + 1, c + 1, path);
            }
        }
    }
//    private static boolean searchTraversal(Moor m, int r, int c, int[] path, ){
//
//    }
}