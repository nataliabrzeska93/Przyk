import java.util.Stack;

/**
 * You are given two non-empty zero-indexed arrays A and B consisting of N
 * integers. Arrays A and B represent N voracious fish in a river, ordered
 * downstream along the flow of the river...
 * 
 * @author atreceno
 * 
 */
public class FishSurvivor {

    /**
     * Given two non-empty zero-indexed arrays A and B consisting of N integers,
     * this function returns the number of fish that will stay alive.
     * 
     * @param a
     *            array representing the size.
     * @param b
     *            array representing the direction.
     * @return the number of fish that will stay alive.
     */
    public int solution(int[] a, int[] b) {
        int survivors = 0;
        Stack<Integer> ones = new Stack<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                if (ones.size() == 0) {
                    survivors++;
                } else { // Duel
                    while (!ones.empty()) {
                        if (a[i] > ones.peek()) { // "One" dies
                            ones.pop();
                        } else { // "Zero" dies
                            break;
                        }
                    }
                    if (ones.empty()) { // "Zero" survives
                        survivors++;
                    }
                }
            } else {
                ones.push(a[i]);
            }
        }
        return survivors + ones.size();
    }
    
  
	}
