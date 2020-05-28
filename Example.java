import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int length;
		int width;
		int height;
		System.out.print("Input length(cm) : ");
		length=input.nextInt();
		System.out.print("Input width(cm)  : ");
		width=input.nextInt();
		System.out.print("Input height(cm) : ");
		height=input.nextInt();
		System.out.println();
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	
		int area;
		area=2*length*width+2*length*height+2*width*height;	
		System.out.println("Area   of the box : "+area);
	}
}
