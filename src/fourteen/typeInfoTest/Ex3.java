package fourteen.typeInfoTest;

import all.Circle;
import all.Rhomboid;
import all.Shape;

/**
 * 将Rhomboid向上转型成Shape,然后向下转型回Rhomboid。试着将其向下转型为Circle，发生了什么
 * @author pocan
 *
 */
public class Ex3 {
	public static void main(String[] args) {
		Shape rhomboid = new Rhomboid();
		Rhomboid shapeOfRhomboid = (Rhomboid)rhomboid;
		//不可行
		//Circle circle = (Circle) shapeOfRhomboid;
	}
}
