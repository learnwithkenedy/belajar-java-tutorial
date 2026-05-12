public class Main {
  public static void main(String[] args) {
    int[] n = { 1, 2, 3, 4, 5, 6 };
    float[] f = { 1.2f, 2.3f, 3.4f, 4.4f, 5.5f };
    double[] d = { 1d, 2d, 3d, 4d, 5d };

    for (int i = 0; i < n.length; i++) {
      System.out.printf("Nilai dari integer forloop, index: %d, value: %d \n", i, n[i]);
    }

    for (int i = 0; i < f.length; i++) {
      System.out.printf("Nilai dari float forloop, index: %d, value: %f \n", i, f[i]);
    }

    for (int i = 0; i < d.length; i++) {
      System.out.printf("Nilai dari double forloop, index: %d, value: %f \n", i, d[i]);
    }

    for (int i : n) {
      System.out.printf("Nilai dari integer forEach, value: %d\n", i);
    }

    for (float i : f) {
      System.out.printf("Nilai dari float forEach, value: %f\n", i);
    }

    for (double i : d) {
      System.out.printf("Nilai dari double forEach, value: %f\n", i);
    }
  }
}
