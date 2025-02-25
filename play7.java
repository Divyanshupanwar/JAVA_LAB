import java.util.Scanner;

class Play7 {
  public static void main(String args[]) {
    int n = 3;
    Scanner sc = new Scanner(System.in);
    int arr[][] = new int[n][n];

    // Input matrix elements
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt(); // Correct method name: nextInt()
      }
    }

    boolean foundSaddlePoint = false; // Flag to track if saddle point is found

    // Find the saddle point
    for (int i = 0; i < n; i++) {
      int mini = Integer.MAX_VALUE;
      int min_index = 0;

      // Find the minimum element in the row
      for (int j = 0; j < n; j++) {
        if (arr[i][j] < mini) {
          mini = arr[i][j];
          min_index = j;
        }
      }

      // Find the maximum element in the column of min_index
      int maxi = Integer.MIN_VALUE;
      int max_index = 0; // Declare max_index
      for (int k = 0; k < n; k++) {
        if (arr[k][min_index] > maxi) {
          maxi = arr[k][min_index];
          max_index = k;
        }
      }

      // Check if the minimum element is also the maximum in its column (saddle point
      // condition)
      if (min_index == max_index && maxi == mini) {
        System.out.println("Saddle point is: " + maxi);
        foundSaddlePoint = true; // Set flag to true
      }
    }

    // If no saddle point is found
    if (!foundSaddlePoint) {
      System.out.println("No saddle point found.");
    }

    sc.close(); // Close the scanner
  }
}
