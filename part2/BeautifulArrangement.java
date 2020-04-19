package part2;

import java.util.*;

public class BeautifulArrangement {
    private int count = 0;
    public int countArrangement(int N) {
       int[] states = new int[N];
       Arrays.fill(states,-1);

       dfs(states,N);
       return count;
    }

    private void dfs(int[] states, int placeNum) {
        if (placeNum == 0) {
            count++;
            return;
        }

        for (int i = 0; i < states.length; i++) {
            if ( states[i] == -1 && (placeNum % (i + 1) == 0 || (i + 1) % placeNum == 0) ) {
                states[i] = placeNum;
                dfs(states,placeNum - 1);
                states[i] = -1;
            }
        }
    }
}
