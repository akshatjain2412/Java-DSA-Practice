package practice;

public class rotateArr {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int trans[][]=new int[3][3];

        for(int i=0;i<mat.length;i++){
            for (int j = 0; j < mat[i].length; j++) {
                trans[i][j]=mat[(mat.length-1)-j][i];
            }
        }
        for(int i=0;i<trans.length;i++){
            for (int j = 0; j < trans[i].length; j++) {
                mat[i][j]=trans[(trans.length-1)-j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
