import java.util.ArrayDeque;
import java.util.Hashtable;

public class FirstUniqueCharacterInAString387 {
    public int firstUniqChar(String s) {
        int result = -1;
        Hashtable<Character, Integer> seen = new Hashtable<>();
        ArrayDeque<Integer> candidates = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (seen.containsKey(s.charAt(i)))
            {
                seen.replace(s.charAt(i), 2);
                if (candidates.isEmpty())
                {

                }
                else if (s.charAt(i) == s.charAt(candidates.getFirst()))
                {
                    candidates.removeFirst();
                    while (!candidates.isEmpty())
                    {
                        if(seen.get(s.charAt(candidates.getFirst())) > 1)
                        {
                            candidates.removeFirst();
                        }
                        else
                        {
                            break;
                        }
                    }
                }

            }
            else
            {
                candidates.add(i);
                seen.put(s.charAt(i), 1);
            }
        }
        if (!candidates.isEmpty())
        {
            result = candidates.getFirst();
        }
        return result;
    }
}
