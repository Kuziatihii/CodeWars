import java.lang.Math.*;
/*
A rectangle with sides equal to even integers a and b is drawn on the Cartesian plane.
Its center (the intersection point of its diagonals) coincides with the point (0, 0), 
but the sides of the rectangle are not parallel to the axes; instead, they are forming 45
degree angles with the axes.
How many points with integer coordinates are located inside the given rectangle 
(including on its sides)?
*/
class Solution {
	static int rectangleRotation(int a, int b) {
		int pt = 0;
		double radius1 = a/2 * a/2 + b/2 * b/2;
		int radius2 = (int)(Math.ceil(Math.sqrt(radius1)));
		double rad = Math.toRadians(-45);
		double cos1 = Math.cos(rad);
		double sin1 = Math.sin(rad);                     
		for (int i = -radius2+1; i < radius2; i++){
			for (int j = -radius2+1; j < radius2; j++){
				double x = i*cos1 - j*sin1;
				double y = i*sin1 + j*cos1;
				if (-a/2 <= x && x <= a/2 && -b/2 <= y && y <= b/2){
					pt ++;  
				}
			}
		}
		return pt;
	}
}