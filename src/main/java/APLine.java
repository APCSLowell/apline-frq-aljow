public class APLine
{
  private int x, y, z;
  public APLine(int a, int b, int c) {
    x = a;
    y = b;
    z = c;
  }
  public double getSlope() {
    return (double) x/y*-1;
  }
  public boolean isOnLine(int f, int g) {
    if ((x*f + y*g + z) == 0) {
      return true; 
    }
    return false;
  }
}
