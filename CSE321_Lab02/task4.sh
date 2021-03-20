#!/bin/bash 

echo "Which operation would you like to do?"
read a 

case $a in
    "+") echo "Operand 1:";
         read num1;
         echo "Operand 2:";
         read num2;
         re=$(( $num1 + $num2 ));;
    "-") echo "Operand 1:";
         read num1;
         echo "Operand 2:";
         read num2;
         re=$(( $num1 - $num2 ));;
    "*") echo "Operand 1:";
         read num1;
         echo "Operand 2:";
         read num2;
         re=$(( $num1 + $num2 ));;
    "/") echo "Operand 1:";
         read num1;
         echo "Operand 2:";
         read num2;
         re=$(( $num1 + $num2 ));;
esac

echo $re