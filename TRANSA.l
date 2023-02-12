%{
    #include <stdio.h>
    #include "scannerdoc1.h"   
%}

%%
"-" {
    return MINUS;
}

"+" {
    return PLUS;
}

" " {
    return BLANC;
}
"\n" {
    return NEWLINE;
}

[0-9]*[+\-,]*[a-zA-Z][+\-,a-zA-Z0-9]*  { 
    return WORD;
}

[1-9][0-9]*","[0-9]*[1-9] {
    return REAL;
}


[1-9][0-9]* {
    return INT;
}

"/*"(.|\n)*"*/" {
    return COMMENT;
}








%%



int yywrap(){
    return 1;
}
