/**
 * This is the English class, that creates/sets English assignments.
 * @author Ricky Mutschlechner
 * @version 1/18/2011
 *
 */
public class MyEnglish3 extends Homework3 {

	
        public MyEnglish3(){
                super();
        }
        
        
        public void createAssignment(int p) {
                setPagesRead(p);
                setType("English");
        }
        
        public String toString(){
                return getType() + "-  must read " + getPagesRead() + " pages.";
        }

		}
