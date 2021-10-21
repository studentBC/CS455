// Java program to demonstrate Working of 
// Comparator interface
  
// Importing required classes
import java.io.*;
import java.lang.*;
import java.util.*;


public class rectangle {
	int length = 0;
	int width = 0;
	public int area;
	public rectangle(int x, int y) {
		length = x;
		width = y;
		area = x*y;
	}
	public static class ccr implements Comparator<rectangle> {
		public int compare(rectangle a, rectangle b) {
			return a.area-b.area;
		}
	}
	public static void main(String []args) {
		rectangle rects[] = {
			new rectangle(1,1),
			new rectangle(2,2),
			new rectangle(3,3),
			new rectangle(4,4)
		};
		Arrays.sort(rects, new ccr());
		for (int i = 0; i < 4; i++) {
			System.out.println(rects[i].area);
			
		}
	}
}
