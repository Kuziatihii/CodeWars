public class Snail {
  public static int[] snail(int[][] array) {
    if(array[0].length == 0){
      return new int[0];
    }
    int[] result =new int [array.length * array.length];
    String dir = "right";
    int imin = 0;
    int imax = array.length - 1;
    int jmin = 0;
    int jmax = array.length - 1;
    int n = 0;
    int i = imin;
    int j = jmin;
    boolean done = false;
    while (!done) {
      switch (dir) {
        case "right":                
          i = imin;
          j = jmin;
          for (; j <= jmax; j++){
            result[n] = array[i][j];
            n++;
          }
          dir = "down";
          imin++;
          break;
        case "left":
          i = imax;
          j = jmax;                
          for (; j >= jmin; j--){
            result[n] = array[i][j];
            n++;
          }
          dir = "up";
          imax--;
          break;
        case "down":
          i = imin;
          j = jmax;
          for (; i <= imax; i++){
            result[n] = array[i][j];
            n++;
          }
          dir = "left";
          jmax--;
          break;
        case "up":
          i = imax;
          j = jmin;
          for (; i >= imin; i--){
            result[n] = array[i][j];
            n++;
          }
          dir = "right";
          jmin++;
          break;
      }
      if (imin > imax || jmin > jmax)
        done = true;
    }
    return result;
  } 
}