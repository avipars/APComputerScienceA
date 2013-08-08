/**
 * This is the Java class, that creates/sets Java assignments.
 * @author Ricky Mutschlechner
 * @version 1/18/2011
 *
 */
public class MyJava2 extends Homework2 implements Processing {

        public MyJava2(){
                super();
        }
        
        
        public void createAssignment(int p) {
                setPagesRead(p);
                setType("Java");
        }
        
        public String toString(){
                return getType() + "-  must read " + getPagesRead() + " pages.";
        }


		@Override
		public void doReading() {
			System.out.println("Before Reading:");
			System.out.println(toString());
			System.out.println("After Reading:");
			int x = getPagesRead() - 4;
			System.out.println("Java - Must Read " + x + " pages.");
			}

}