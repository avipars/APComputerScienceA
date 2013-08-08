/**
 * This is the Java class, that creates/sets Java assignments.
 * @author Ricky Mutschlechner
 * @version 1/18/2011
 *
 */
public class MyJava extends Homework {

        public MyJava(){
                super();
        }
        
        
        public void createAssignment(int p) {
                setPagesRead(p);
                setType("Java");
        }
        
        public String toString(){
                return getType() + "-  must read " + getPagesRead() + " pages.";
        }

}