bool isValid(char* s) {
    int len = strlen(s);
    int stack[len];
    int top = -1;
    for(int i = 0; i < len; i++){
        char t = s[i];
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
