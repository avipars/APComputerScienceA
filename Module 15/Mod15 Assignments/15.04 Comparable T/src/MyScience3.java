/**
 * This is the Science class, that creates/sets Science assignments.
 * @author Ricky Mutschlechner
 * @version 1/18/2011
 *
 */
public class MyScience3 extends Homework3 {

        public MyScience3(){
                super();
        }
        
        
        public void createAssignment(int p) {
                setPagesRead(p);
                setType("Science");
        }
        
        public String toString(){
                return getType() + "-  must read " + getPagesRead() + " pages.";
        }


}