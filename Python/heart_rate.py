age = int(input("Enter your Age:"))
maximum_heart_rate = 220 - age
minimum_target_heart_rate = maximum_heart_rate * (50 / 100)
maximum_target_heart_rate = maximum_heart_rate * (85 / 100)
print("Your maximum heart rate is:", maximum_heart_rate)
print("The range of your heart rate is from", minimum_target_heart_rate, "to", maximum_target_heart_rate)
