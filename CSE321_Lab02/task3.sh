#!/bin/bash

echo "Please Enter A Number : "
read num
j=0
for (( i=1; i<=$num; i++))
do
    if [ "$( expr $num % $i)" -eq 0 ];then
        j=$(( $j + 1 ))
    fi
done

if [ $j  -eq 2 ];then
    echo "Prime"
else
    echo "Not Prime"
fi
