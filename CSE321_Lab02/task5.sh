#!/bin/bash

echo "Please Enter A Number : "
read num

re=$num

i=$num


while [ $re != 1 ] && [ $re != 4 ]
do
s=0
r=0
while [ $re -gt 0 ]
do
r=$(( $re % 10 ))
re=$(( $re / 10 ))
a=$(( $r * $r ))
s=$(( $s + $a ))
done
re=$s
done

if [ $re -eq 1 ];then
  echo "The Number is Happy Number"
elif [ $re -eq 1 ];then
  echo "The Number is unhappy"
else
  echo "The Number is not A Happy Number"
fi