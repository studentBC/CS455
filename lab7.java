//#1
int go (Scanner input) {
  if (!input.hasNext()) return 0;
  return Math.max(input.next().length(), go(input));
}
public int longestWordLen(String words) {
  Scanner input =new Scanner(words);
  return go (input);
}
//#2
public String string1UpToN(int n) {
  if (n == 1) return "1";
  return string1UpToN(n-1)+" "+String.valueOf(n);
}

//#3
public int fastExpon(int x, int n) {
  if (n == 0) return 1;
  else if (n == 1) return x;
  int temp = fastExpon(x, n/2);
  if (n%2 == 1) return temp*temp*x;
  else return temp*temp;
}

