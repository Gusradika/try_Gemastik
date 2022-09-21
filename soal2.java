import java.io.*;
import java.util.*;

public class soal1 {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        // Vector a = new Vector();
        double a[][] = { { 1, 5 }, { 2, 1 }, { 2, 4 }, { 3, 3 }, { 6, 3 }, { 6, 6 }, { 7, 7 }, { 10, 5 } };
        // 0=negatif 1=positif
        double b[][] = new double[8][4];
        double xpb = 4;
        double ypb = 2;
        int jmlPohon = 8;

        for (int i = 0; i < jmlPohon; i++) {
            b[i][0] = (a[i][1] - ypb) / (a[i][0] - xpb);

            if ((a[i][0] - xpb) > 0) {
                b[i][1] = 1;
            } else {
                b[i][1] = 0;
            }

            if ((a[i][1] - ypb) > 0) {
                b[i][2] = 1;
            } else {
                b[i][2] = 0;
            }

            b[i][3] = 1;

            System.out.println(b[i][0]);
            System.out.println(b[i][1]);
            System.out.println(b[i][2]);
            System.out.println(b[i][3]);
            System.out.println();
        }

        for (int i = 0; i < jmlPohon; i++) {
            for (int j = i; j < jmlPohon; j++) {
                if (b[i][0] == b[j][0]) {
                    if (b[i][1] == b[j][1] && b[i][2] == b[j][2]) {
                        if (b[j][3] != 0) {
                            b[j][3] = 0;
                        }
                    }
                }
            }
        }

        System.out.println("Print Hasil");
        for (int i = 0; i < jmlPohon; i++) {
            System.out.println(b[i][0]);
            System.out.println(b[i][1]);
            System.out.println(b[i][2]);
            System.out.println(b[i][3]);
            System.out.println();
        }
    }
}