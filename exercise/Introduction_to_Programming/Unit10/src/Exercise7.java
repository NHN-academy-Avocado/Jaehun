import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        Moor moor = new Moor(7, 10, 0.5);
        Traversal traversal = new Traversal(moor);
        System.out.println(traversal);
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
                res = res + (moor[r][c] ? "* " : "o ");
            }
            res = res + "\n";
        }
        return res;
    }
}

class Traversal {

    private int[] traversal;
    private int[][] traversal2;
    private Moor moor;
    private boolean found;
    private boolean[][] visited;

    public Traversal(Moor m) {
        moor = m;
        traversal = new int[moor.getNumColumns()];
        Arrays.fill(traversal, -1);
        traversal2 = new int[moor.getNumRows()][moor.getNumColumns()];
        visited = new boolean[moor.getNumRows()][moor.getNumColumns()];
//        found = traverseMoor(moor, traversal);
//        found = traverseMoor2(moor, traversal, visited);
        found = traverseMoor3(moor, traversal2);
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

//    public String toString() {
//        System.out.println(moor.toString() + "\n");
////        if(found) {
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < moor.getNumRows(); i++) {
//                for (int j = 0; j < moor.getNumColumns(); j++) {
//                    if (moor.land(i, j)) {
//                        if(traversal[j]==i){
//                            sb.append("# ");
//                        }else {
//                            sb.append("* ");
//                        }
//                    } else {
//                        sb.append("o ");
//                    }
//                }
//                sb.append("\n");
//            }
//            return String.valueOf(sb);
////        }else{
////            return "Not found";
////        }
//
//    }
    public String toString() {
        System.out.println(moor.toString() + "\n");
//        if(found) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < moor.getNumRows(); i++) {
            for (int j = 0; j < moor.getNumColumns(); j++) {
                if (moor.land(i, j)) {
                    if(traversal2[i][j]==1){
                        sb.append("# ");
                    }else {
                        sb.append("* ");
                    }
                } else {
                    sb.append("o ");
                }
            }
            sb.append("\n");
        }
        return String.valueOf(sb);
//        }else{
//            return "Not found";
//        }

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

    private static boolean traverseMoor2(Moor m, int[] path, boolean[][] visited) {
        for (int row = 0; row < m.getNumRows(); row++) {
            if (searchTraversal2(m, row, 0, path, visited)) {
                return true;
            }
        }
        return false;
    }
    private static boolean traverseMoor3(Moor m, int[][] path) {
        for (int row = 0; row < m.getNumRows(); row++) {
            if (searchTraversal3(m, row, 0, path)) {
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

    private static boolean searchTraversal2(Moor m, int r, int c, int[] path, boolean[][] visited) {
        if (!m.land(r, c) || visited[r][c]) {
            return false;
        }

        visited[r][c] = true;
        path[c] = r;

        if (c == m.getNumColumns() - 1) {
            return true;
        }
        return
                searchTraversal2(m, r - 1, c + 1, path, visited) ||
                        searchTraversal2(m, r, c + 1, path, visited) ||
                        searchTraversal2(m, r + 1, c + 1, path, visited);
    }private static boolean searchTraversal3(Moor m, int r, int c, int[][] path) {
        if (!m.land(r, c)) {
            return false;
        } else {
            path[r][c] = 1;
            if (c == m.getNumColumns() - 1) {
                return true;
            }else{
                int[] di = {-1,0,1,1,1,0,-1,-1};
                int[] dj = {1,1,1,0,-1,-1,-1,0};
                for(int i=0; i<8; i++){
                    if(m.land(r+di[i], c+dj[i]) && path[r+di[i]][c+dj[i]] ==0){
                        if(searchTraversal3(m,r+di[i], c+dj[i], path)){
                            return true;
                        }
                        path[r+di[i]][c+dj[i]]=2;
                    }
                }
                path[r][c]=2;
                return false;
            }

        }
    }
}

