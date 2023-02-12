#include <stdio.h>
#include <stdlib.h>
#include "scannerdoc1.h"

extern int yylex();
extern int  yylineno;
extern char * yytext;



int main (int argc , char *  argv[]){
    FILE *input_file ;
    FILE *fdoc2;
    int ntoken , vtoken;
    ntoken = yylex();

    fdoc2 = fopen("doc2.txt" , "w");

    // if(argc > 1){
    //     input_file =  fopen(argv[2], "r");

    //     yyin = input_file;
    // }
    fprintf(fdoc2 , "%s" , "");

    while(ntoken){
        
        

        
        switch(ntoken){
            case MINUS :
                ntoken = yylex();
                if(ntoken == INT){
                    fprintf(fdoc2 , "@%d\n" , -atoi(yytext) - 3 );
                }
                if(ntoken == REAL){
                    fprintf(fdoc2 , "@%s\n" , yytext);
                }


                fprintf(fdoc2 , "%s" , "");



                break;
            case PLUS :
                ntoken = yylex();
                if(ntoken == INT){
                    fprintf(fdoc2 , "@%d\n" , atoi(yytext) + 3 );
                }

                if(ntoken == REAL){
                    fprintf(fdoc2 , "@%s\n" , yytext);
                }


                fprintf(fdoc2 , "%s" , "");



                break;

            
            case INT : 
                fprintf(fdoc2 , "@%d\n" , atoi(yytext) + 3 );
                break;
            
            case REAL :  
                fprintf(fdoc2 , "@%s\n" , yytext );
                break;
            case COMMENT :  
                fprintf(fdoc2 , "%s\n" , yytext );
                break;
            case WORD :  
                fprintf(fdoc2 , "%s" , "" );
                break;
            case BLANC :          
                fprintf(fdoc2 , "%s" , "" );
                break;
            case NEWLINE :
                fprintf(fdoc2 , "%s" , "" );
                break;
            

        }


        ntoken = yylex();
        
    }

    return 0;
}




// ^"/*"|(.|\n)*"*/" {
    
// }















