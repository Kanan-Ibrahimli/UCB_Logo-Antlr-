grammar StateModel;

model: statement+;

ID: [a-zA-Z][a-zA-Z0-9_]*;
STRING: '"' (~["\r\n])* '"';
NUMBER: ('0'..'9')+;
VARIABLE_NAME: ID;
PROCEDURE_NAME: ID;

expression: NUMBER
          | ID
          | '(' expression ')'
          | expression ('+' | '-' | '*' | '/') expression
          | expression ('>' | '<' | '=')
          ;

procedure_definition: 'TO' ID 'END';
procedure_call: ID '(' (expression (',' expression)*)? ')';
procedure_body: statement+;

statement: move_command
         | control_structure
         | procedure_definition
         | procedure_call
         | variable_assignment
         | turtle_graphics_command
         | input_output_command
         | mathematical_logical_command
         ;

move_command: fd_command
            | bk_command
            | rt_command
            | lt_command
            | pu_command
            | pd_command
            ;

fd_command: 'FD' expression;
bk_command: 'BK' expression;
rt_command: ('RT' | 'RIGHT') expression;
lt_command: ('LT' | 'LEFT') expression;
pu_command: 'PU';
pd_command: 'PD';

control_structure: repeat_command
                  | if_command
                  | ifelse_command
                  | while_command
                  ;

repeat_command: 'REPEAT' expression '[' statement+ ']';
if_command: 'IF' expression+ '[' statement+ ']';
ifelse_command: 'IFELSE' expression* '[' statement+ ']' '[' statement+ ']';
while_command: 'WHILE' expression+ '[' statement+ ']';


variable_assignment: ID '=' expression;

turtle_graphics_command: setxy_command
                       | setheading_command
                       | pendown_command
                       | penup_command
                       | fill_command
                       | color_command
                       ;

setxy_command: 'SETXY' expression expression;
setheading_command: 'SETHEADING' expression;
pendown_command: 'PENDOWN';
penup_command: 'PENUP';
fill_command: 'FILL';
color_command: 'COLOR' expression;

input_output_command: print_command
                    | readword_command
                    | readlist_command
                    ;

print_command: 'PRINT' (STRING | expression);
readword_command: 'READWORD';
readlist_command: 'READLIST';

mathematical_logical_command: sum_command
                             | difference_command
                             | product_command
                             | quotient_command
                             | mod_command
                             | remainder_command
                             | equal_command
                             | greater_command
                             | less_command
                             | and_command
                             | or_command
                             | not_command
                             ;

sum_command: 'SUM' expression expression;
difference_command: 'DIFFERENCE' expression expression;
product_command: 'PRODUCT' expression expression;
quotient_command: 'QUOTIENT' expression expression;
mod_command: 'MOD' expression expression;
remainder_command: 'REMAINDER' expression expression;
equal_command: 'EQUAL?' expression expression;
greater_command: 'GREATER?' expression expression;
less_command: 'LESS?' expression expression;
and_command: 'AND' expression expression;
or_command: 'OR' expression expression;
not_command: 'NOT' expression;



WS: [ \t\r\n]+ -> skip;
