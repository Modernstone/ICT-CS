clc;
clear all:
close all;
n = input("Enter a number");
fact = 1;
for i = 1:n
  fact = fact*i;
end
disp(sprintf('%d! = %d',n,fact));
