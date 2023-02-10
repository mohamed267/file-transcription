%{
    #include <stdio.h>
    #include "scannerdoc1.h"   
%}
character [a-z] ;

%%
"-" {
    return COLON;
}
[1-9][0-9]*[.][0-9]*[1-9] {
    return REAL;
}

[1-9][0-9]* {
    return INT;
}
%%



int yywrap(){
    return 1;
}
