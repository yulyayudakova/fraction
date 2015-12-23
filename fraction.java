package fraction;
public class fraction {

    public int d, n;

    public fraction(int delimeter, int numerable){

        d = delimeter;

        n = numerable;

    }

    public String toString(){

        return n + "/" + d;

    }
    public static boolean equals(fraction first, fraction second){

        // Cashing variables

        int numFirst = first.n;
        int numSecond = second.n;


        // Mutual for Fractions

        int mutual = getMutual(first, second);

        int multyplierFirst = getMultyplierForNum(first.d, mutual);
        int multyplierSecond = getMultyplierForNum(second.d, mutual);

        // compare

        return numFirst * multyplierFirst == numSecond * multyplierSecond;

    }

	private static int getMutual(fraction first, fraction second) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getMultyplierForNum(int d2, int mutual) {
		// TODO Auto-generated method stub
		return 0;
	}
    }