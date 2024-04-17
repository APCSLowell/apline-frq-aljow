public class APLine
{
  private int x, y, z;
  public APLine(int a, int b, int c) {
    x = a;
    y = b;
    z = c;
  }
  public double getSlope() {
    return -1*(x/y);
  }
  public boolean isOnLine(int f, int g) {
    if ((x*f + y*g + z) == 0) {
      return true; 
    }
    return false;
  }
}
