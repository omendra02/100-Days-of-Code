package Day9;

public class AddBinary {
    

  public String addBinary(String a, String b) 
  {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) 
    {
      if(i >= 0)
        carry += a.charAt(i--) - '0';
      if(j >= 0)
        carry += b.charAt(j--) - '0';
      sb.append(carry % 2);
      carry /= 2;
    }
    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    AddBinary addBinary = new AddBinary();
    
    // Test cases
    String[][] testCases = {
        {"11", "1"}, // 11 + 1 = 100
        {"1010", "1011"}, 
        {"0", "0"}, // 0 + 0 = 0
        {"111", "111"}, 
        {"1101", "1010"} 
    };
    
    for (String[] testCase : testCases) {
        String result = addBinary.addBinary(testCase[0], testCase[1]);
        System.out.println("Result of adding '" + testCase[0] + "' and '" + testCase[1] + "': " + result);
    }
}
}

