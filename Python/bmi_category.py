weight_in_kg = float (input("Enter your weight in kg:"))
height_in_meters = float (input("Enter your height in :"))
compute_bmi = weight_in_kg / (height_in_meters * height_in_meters)

if compute_bmi < 18.5:
    print("Underweight")
elif compute_bmi < 24.9:
    print("Normal")
elif compute_bmi < 29.9:
    print("Overweight")
else:
    print("Obese")
