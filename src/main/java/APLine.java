public class APLine
{
  private int x;
  private int y;
  private int z; 
  public APLine (int a, int b, int c) {
    x = a;
    y = b;
    z = c;
  }
  public double getSlope() {
    return -x/y;
  }
  public boolean isOnline(int f, int g) {
    if ((x*f + y*g + z) == 0) {
      return true; 
    }
    return false;
  }
}
