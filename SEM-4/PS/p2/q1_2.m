clc;
close all;
clear all;

n = 101;
outcome = repmat(' ', 1, n);
rmsg = rand(1, n);

nh = 0;
nt = 0;

for i = 1:n
    if rmsg(i) < 0.5
        outcome(i) = 'H';
        nh = nh + 1;
    else
        outcome(i) = 'T';
        nt = nt + 1;
    end
end

disp(outcome)
disp(sprintf("Probability of Head = %3.2f", nh/n))
disp(sprintf("Probability of Tail = %3.2f", nt/n))

