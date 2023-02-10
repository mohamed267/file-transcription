%{
    #include <stdio.h>
    #include "scannerdoc1.h"   
%}
character [a-z] ;

%%
" " {return BLANC;}
"\n" {return  NEWLINE;}
[a-zA-Z0-9]+  { 
    return CHAR;
}
\/\*([.\n]+)\*\/ {return COMMENT;}
%%



int yywrap(){
    return 1;
}
