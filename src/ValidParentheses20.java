import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        boolean result = true;
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                brackets.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')')
            {
                if (brackets.empty())
                {
                    return false;
                }
                else if (brackets.pop() != '(')
                {
                    return false;
                }
            }
            else if (s.charAt(i) == '}')
            {
                if (brackets.empty())
                {
                    return false;
                }
                else if (brackets.pop() != '{')
                {
                    return false;
                }
            }
            else if (s.charAt(i) == ']')
            {
                if (brackets.empty())
                {
                    return false;
                }
                else if (brackets.pop() != '[')
                {
                    return false;
                }
            }
            else{

            }

        }
        if (!brackets.empty())
        {
            return false;
        }
        return result;
    }
}
