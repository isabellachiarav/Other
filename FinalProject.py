from typing import List

import matplotlib.pyplot as plt
import csv
import numpy as np

total = []
men = []
women = []
major_category = []
employed = []
full_time = []
part_time = []
full_time_year_round = []
unemployed = []
median = []
p25 = []
p75 = []
college_jobs = []
non_college_jobs = []
low_wage_jobs = []

sum = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

sum1 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg1 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

sum2 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg2 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

sum4 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
counts4 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg4 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

sum9 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
counts9 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg9 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

with open ("Computer Science Final - recent-grads.csv", "r") as csvfile:
 plots = csv.reader(csvfile, delimiter = ",")
 next(plots)
 for row in plots:
     total.append(float(row[0]))
     men.append(float(row[1]))
     women.append(float(row[2]))
     major_category.append(float(row[3]))
     employed.append(float(row[4]))
     full_time.append(float(row[5]))
     part_time.append(float(row[6]))
     full_time_year_round.append(float(row[7]))
     unemployed.append(float(row[8]))
     median.append(float(row[9]))
     p25.append(float(row[10]))
     p75.append(float(row[11]))
     college_jobs.append(float(row[12]))
     non_college_jobs.append(float(row[13]))
     low_wage_jobs.append(float(row[14]))

     sum[int(row[3])] += float(row[0])

     sum1[int(row[3])] += float(row[1])

     sum2[int(row[3])] += float(row[2])

     sum4[int(row[3])] += float(row[4])
     counts4[int(row[3])] += 1

     sum9[int(row[3])] += float(row[9])
     counts9[int(row[3])] += 1



# for i in range(len(sum)):
#     avg9[i] = sum9[i] / counts9[i]



labels, counts = np.unique(major_category, return_counts = True)
major_category1 = ["Agriculture", "Arts", "Life Science", "Business", "Communications", "Computers & Math",
                  "Education", "Engineering", "Health", "Humanities", "Consumer Services", "Interdisciplinary",
                  "Public Policy", "Physical Science", "Social Work", "Social Science"]



# r1 = np.arange(len(major_category1))
# r2 = [major_category1 + .4 for major_category1 in r1]
# align = "edge"
# ax = plt.subplot()
# ax.bar()

# plt.bar(major_category1, sum, width = .4, color = "lightsteelblue", align = "center", label = "Total", tick_label = major_category1)
# plt.xlabel("Major Category", fontname = "serif")
# plt.xticks(fontname = "serif", rotation = 90, size = 9)
# plt.ylabel("Number of Graduates", fontname = "serif")
# plt.title("Sample Size Used", fontname = "serif")
# plt.rc("font", family="serif")
# plt.legend(loc = 2)
# plt.tight_layout()
# plt.savefig("samplesize.jpg", dpi = 200)
# plt.show()



count = 0
labels = ["Men", "Women"]
for i in range(4):
    for j in range(4):
        gender = [sum1[count], sum2[count]]
        ax = plt.subplot2grid((4,4), (i,j))
        ax.pie(gender, colors = ["steelblue", "indianred"])
        ax.set_title(major_category1[count], size = 8, pad = 0, fontname = "serif")
        count += 1
plt.rc("font", family="serif")
plt.legend(labels, loc = 4, fontsize = 6)
plt.savefig("gender.jpg", dpi = 200)
plt.show()



# plt.bar(major_category1, avg9, width = .4, color = "lightsteelblue", align = "center", label = "Median Salary", tick_label = major_category1)
# plt.xlabel("Major Category", fontname = "serif")
# plt.xticks(fontname = "serif", rotation = 90, size = 9)
# plt.ylabel("Average Median Salary ($)", fontname = "serif")
# plt.title("Average Median Salaries in Each Major Category", fontname = "serif")
# plt.rc("font", family="serif")
# plt.legend(loc = 2)
# plt.tight_layout()
# plt.savefig("median.jpg", dpi = 200)
# plt.show()
