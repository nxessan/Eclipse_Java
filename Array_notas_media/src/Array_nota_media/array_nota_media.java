package Array_nota_media;

public class array_nota_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, suma = 0, media;
		int notas[] = new int[] { 9, 8, 7, 6, 5 };

		for (i = 0; i < notas.length; i = i + 1) {
			suma = suma + notas[i];
		}
		media = suma / notas.length;
		System.out.println("La media es: " + media);
	}

}
