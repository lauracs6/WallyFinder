public class WallyFinder {

  public static int wheresWally(String str) {
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'W') { // Verificar si el carácter es 'W'            
            if (i + 5 <= str.length() && str.substring(i, i + 5).equals("Wally")) {
              if (i == 0 || str.charAt(i - 1) == ' ') {
                if (i + 5 == str.length() || str.charAt(i + 5) == ' ' || str.charAt(i + 5) == '.' || str.charAt(i + 5) =='\'') {
                  return i; 
                }
              }
            }
        }
    }
    return -1; 
}

public static void main(String[] args) {
  System.out.println(wheresWally("Where's Wally"));
  System.out.println(wheresWally("Wally."));
  System.out.println(wheresWally("DWally"));
  System.out.println(wheresWally("WallyP"));
  System.out.println(wheresWally("Wally'"));
}

}
