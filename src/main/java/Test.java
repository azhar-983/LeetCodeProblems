import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        String s ="{ [ [ ] } ] )";
        Map<Character,Character> symbolsMap = new HashMap<>();
        Stack<Character> symbols = new Stack<>();
        symbolsMap.put(')','(');
        symbolsMap.put(']','[');
        symbolsMap.put('}','{');
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                symbols.push(c);
                continue;
            }
            if(symbols.size()==0 || symbolsMap.get(c)!=symbols.pop())
                return;
        }

    }

}
