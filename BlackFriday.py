import matplotlib.pyplot as plt
import csv
import numpy as np

# gender = []
# age = []
occupation = []
city_category = []
marital_status = []
purchase = []

with open ("BlackFriday.csv", "r") as csvfile:
   plots = csv.reader(csvfile, delimiter = ",")
   next(plots)
   for row in plots:
       # gender.append(float(row[0]))
       # age.append(float(row[1]))
       # occupation.append(float(row[2]))
        city_category.append(float(row[3]))
# plt.hist(gender, 2, rwidth = .9)
# plt.hist(age, 7, rwidth = .9)
# plt.hist(occupation, 21, rwidth = .9)
plt.hist(city_category, 3, rwidth = .9)
# plt.xlabel("Gender", fontname = "serif")
# plt.ylabel("Count", fontname = "serif")
# plt.title("Gender Count", fontname = "serif")
# plt.xlabel("Age", fontname = "serif")
# plt.ylabel("Count", fontname = "serif")
# plt.title("Age Count", fontname = "serif")
# plt.xlabel("Occupation", fontname = "serif")
# plt.ylabel("Count", fontname = "serif")
# plt.title("Occupation Count", fontname = "serif")
plt.xlabel("City Category", fontname = "serif")
plt.ylabel("Count", fontname = "serif")
plt.title("City Category Count", fontname = "serif")
plt.show()


