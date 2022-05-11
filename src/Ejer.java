   

public class Ejer {

	public int sumados(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == 2) {
				suma = suma + array[i];
			}
		}
		return suma;
	}
}

