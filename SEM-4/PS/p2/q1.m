clc;
clear all;
close all;
outcome = 'HTTHHH'
n=10;
nh = 0;
nt = 0;

for i = 1:length(outcome)
    if outcome(i) == 'H'
        nh = nh + 1;
    else
        nt = nt + 1;
    end
end

disp(sprintf("Probability of Head = %3.2f", nh/length(outcome)))
disp(sprintf("Probability of Tail = %3.2f", nt/length(outcome)))

