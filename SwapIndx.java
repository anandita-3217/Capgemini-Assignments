public class SwapIndx {

  public static <T> void swap(T[] array, int i, int j) {
    if (i < 0 || j < 0 || i >= array.length || j >= array.length || i == j) {
      throw new IllegalArgumentException("Invalid indices.");
    }

    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void main(String[] args) {
    // Create an array of integers.
    Integer[] array = {1, 2, 3, 4, 5};

    // Swap the elements at indices 1 and 3.
    swap(array, 1, 3);

    // Print the array.
    for (Integer element : array) {
      System.out.println(element);
    }
  }
}