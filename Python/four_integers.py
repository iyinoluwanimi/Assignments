integers = input ("Enter four Integer e.g 2,4,6,8\n").split(",")

converted_integers = []
for number in integers:
    converted_integers.append(int(number))
rearranged_integers = sorted(converted_integers)

median = (rearranged_integers[1] + rearranged_integers[2]) / 2
sum_of_four_integers = sum(rearranged_integers)
mean_of_four_integers = int(sum_of_four_integers/4)

print(f"The median is {median}")
print(f"The sum of all the four numbers is {sum_of_four_integers}")
print(f"The mean of all the four numbers is {mean_of_four_integers}")










