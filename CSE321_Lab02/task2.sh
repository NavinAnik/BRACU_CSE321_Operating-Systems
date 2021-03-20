#!/bin/bash

echo "Please Enter a Number : "
read num

if [ "$( expr $num % 2)" -eq 0 ]; 
    then if [ "$( expr $num % 5)" -eq 0 ];
            then echo "No"
        else
            echo "Yes"
        fi
elif  [ "$( expr $num % 5)" -eq 0 ];
    then echo "Yes"
else
    echo "IGNORE"
fi