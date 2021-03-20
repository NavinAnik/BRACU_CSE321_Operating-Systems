#!/bin/bash

echo "Please Enter Your Income :"
read income

if  [ $income -le 240000 ];
    then tax=0
elif  [ $income -le 540000 ];
    then tax=$(( $income - 240000 ))
         tax=$(( $tax * 10 / 100 ))
elif  [ $income -le 720000 ];
    then  tax1=$(( $income - 540000 ))
          tax=$(( $tax1 * 20 / 100 ))
          tax=$(( $tax + 30000 ))

else
    tax1=$(( $income - 720000 ))
    tax=$(( $tax1 * 30 / 100 ))
    tax=$(( $tax + 84000 ))
fi

echo $tax