/**
 * This is the Math class, that creates/sets Math assignments.
 * @author Ricky Mutschlechner
 * @version 1/18/2011
 *
 */
public class MyMath extends Homework {

        public MyMath(){
                super();
        }
        
        
        public void createAssignment(int p) {
                setPagesRead(p);
                setType("Math");
        }
        
        public String toString(){
                return getType() + "-  must read " + getPagesRead() + " pages.";
        }

}