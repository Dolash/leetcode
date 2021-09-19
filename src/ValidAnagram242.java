import java.util.Hashtable;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        boolean result = false;
        Hashtable<Character, Integer> noteContents = new Hashtable<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (noteContents.containsKey(s.charAt(i)))
            {
                noteContents.replace(s.charAt(i), noteContents.get(s.charAt(i)) + 1);
            }
            else
            {
                noteContents.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++)
        {
            if(noteContents.containsKey(t.charAt(i)))
            {
                if(noteContents.get(t.charAt(i)) > 1)
                {
                    noteContents.replace(t.charAt(i), noteContents.get(t.charAt(i)) - 1);
                }
                else
                {
                    noteContents.remove(t.charAt(i));
                }
            }
            else
            {
                return false;
            }
        }
        if (noteContents.isEmpty())
        {
            result = true;
        }
        return result;
    }
}
