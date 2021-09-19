import java.util.Hashtable;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = false;
        Hashtable<Character, Integer> noteContents = new Hashtable<>();
        for (int i = 0; i < ransomNote.length(); i++)
        {
            if (noteContents.containsKey(ransomNote.charAt(i)))
            {
                noteContents.replace(ransomNote.charAt(i), noteContents.get(ransomNote.charAt(i)) + 1);
            }
            else
            {
                noteContents.put(ransomNote.charAt(i), 1);
            }
        }
        for (int i = 0; i < magazine.length(); i++)
        {
            if(noteContents.containsKey(magazine.charAt(i)))
            {
                if(noteContents.get(magazine.charAt(i)) > 1)
                {
                    noteContents.replace(magazine.charAt(i), noteContents.get(magazine.charAt(i)) - 1);
                }
                else
                {
                    noteContents.remove(magazine.charAt(i));
                }
            }
        }
        if (noteContents.isEmpty())
        {
            result = true;
        }
        return result;
    }
}
