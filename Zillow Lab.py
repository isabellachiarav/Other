import matplotlib.pyplot as plt
import csv
import numpy as np

x = []
missouri = []
michigan = []
florida = []
nevada = []
utah = []
newyork = []
pennsylvania = []
newjersey = []

with open ("Metro_Zhvi_SingleFamilyResidence.csv", "r") as csvfile:
    plots = csv.reader(csvfile, delimiter = ",")
    next(plots)
    next(plots)
    next(plots)
    for row in plots:
        x.append(float(row[0]))
        missouri.append(float(row[1]))
        michigan.append(float(row[2]))
        florida.append(float(row[3]))
        nevada.append(float(row[4]))
        utah.append(float(row[5]))
        newyork.append(float(row[6]))
        pennsylvania.append(float(row[7]))
        newjersey.append(float(row[8]))
plt.scatter(x, missouri, color = "darkgreen", label = "St. Louis, MO")
plt.scatter(x, michigan, color = "mediumblue", label = "Lansing, MI")
plt.scatter(x, florida, color = "indigo", label = "Tampa, FL")
plt.scatter(x, nevada, color = "darkorange", label = "Las Vegas, NV")
plt.scatter(x, utah, color = "gold", label = "Salt Lake City, UT")
plt.scatter(x, newyork, color = "steelblue", label = "Rochester, NY")
plt.scatter(x, pennsylvania, color = "greenyellow", label = "Allentown, PA")
plt.scatter(x, newjersey, color = "darkred", label = "Trenton, NJ")
plt.xlabel("Months Since 2000")
plt.ylabel("Price ($)")
plt.title("Months Since 2000 vs. Price ($)")
plt.legend(loc = 2)
plt.show()

