#include <stdio.h>
#include "scannerdoc1.h"

extern int yylex();
extern int  yylineno;
extern char * yytext;

char *names[] = {NULL , "db_type", "db_name" , "db_table_prefix" , "db_port"};


int main (void){
    int ntoken , vtoken;
    ntoken = yylex();

    while(ntoken){

        switch(ntoken){
            case COLON :
                ntoken = yylex();
                if(ntoken == INT){
                    printf("negative integer");
                }

                break;

            
            case INT : 
                printf("positive integer");

                break;
            
            case REAL :  
                printf("real");

                break;
            

        }

        
        // vtoken = yylex();
        ntoken = yylex();
    }

    return 0;
}


// " " {return BLANC;}
// "\n" {return  NEWLINE;}
// [a-zA-Z0-9]+  { 
//     return CHAR;
// }


// \/\*|(.|\n)*\*\/ {return COMMENT;}




