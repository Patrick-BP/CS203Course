
package Question2;

import Question1.Breed;
import Question1.Cat;

public class Q2Main {

        public static void main( String[] args ) {
            Cat myCat = new Cat("winky",
                    new Breed("mix", 10.5), 9.5);
            System.out.println(myCat.getWeight()); // output: 9.5
            System.out.println(myCat.getBreed().getWeight());  // output : 10.5
        }

}
