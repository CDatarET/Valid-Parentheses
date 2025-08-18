class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for(int i = 0; i < s.length(); i++){
            char t = s.charAt(i);
            if(t ==')'){
                if(top == -1){
                    return(false);
                }

                if(stack[top] != '('){
                    return(false);
                }
                else{
                    top--;
                    continue;
                }
            }
            else if(t == '}'){
                if(top == -1){
                    return(false);
                }

                if(stack[top] != '{'){
                    return(false);
                }
                else{
                    top--;
                    continue;
                }
            }
            else if(t == ']'){
                if(top == -1){
                    return(false);
                }
                
                if(stack[top] != '['){
                    return(false);
                }
                else{
                    top--;
                    continue;
                }
            }
            top++;
            stack[top] = t;
        }
        if(top == -1){
            return(true);
        }
        else{
            return(false);
        }
    }
}
