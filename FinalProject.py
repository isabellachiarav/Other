import matplotlib.pyplot as plt
import csv
import numpy as np
from matplotlib.ticker import ScalarFormatter, FormatStrFormatter

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
sum1 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum2 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum4 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum5 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum6 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum7 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum8 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum9 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
counts9 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg9 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum10 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
counts10 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg10 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum11 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
counts11 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg11 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum12 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum13 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum14 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

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
     sum5[int(row[3])] += float(row[5])
     sum6[int(row[3])] += float(row[6])
     sum7[int(row[3])] += float(row[7])
     sum8[int(row[3])] += float(row[8])
     sum9[int(row[3])] += float(row[9])
     counts9[int(row[3])] += 1
     sum10[int(row[3])] += float(row[10])
     counts10[int(row[3])] += 1
     sum11[int(row[3])] += float(row[11])
     counts11[int(row[3])] += 1
     sum12[int(row[3])] += float(row[12])
     sum13[int(row[3])] += float(row[13])
     sum14[int(row[3])] += float(row[14])

for i in range(len(sum)):
    avg9[i] = sum9[i] / counts9[i]
for i in range(len(sum)):
    avg10[i] = sum10[i] / counts10[i]
for i in range(len(sum)):
    avg11[i] = sum11[i] / counts11[i]

major_category1 = ["Agriculture", "Arts", "Life Science", "Business", "Communications", "Computers & Math",
                  "Education", "Engineering", "Health", "Humanities", "Consumer Services", "Interdisciplinary",
                  "Public Policy", "Physical Science", "Social Work", "Social Science"]

# plt.bar(major_category1, sum, width = 0.4, color = "lightsteelblue", align = "center", tick_label = major_category1)
# plt.xlabel("Major Category", fontname = "serif")
# plt.xticks(fontname = "serif", rotation = 90, size = 9)
# plt.ylabel("Number of Graduates", fontname = "serif")
# plt.title("Sample Size Used", fontname = "serif")
# plt.rc("font", family="serif")
# plt.tight_layout()
# plt.savefig("samplesize.jpg", dpi = 200)
# plt.show()

# count = 0
# labels = ["Men", "Women"]
# for i in range(4):
#     for j in range(4):
#         gender = [sum1[count], sum2[count]]
#         ax = plt.subplot2grid((4,4),(i,j))
#         ax.pie(gender, colors = ["lightsteelblue", "indianred"], autopct="%1.0f%%", labeldistance = 8)
#         ax.set_title(major_category1[count], size = 8, pad = 0, fontname = "serif")
#         ax.axis("equal")
#         count += 1
# plt.rc("font", family = "serif")
# plt.figlegend(labels, loc = 4, fontsize = 15)
# plt.suptitle("Men vs. Women in Each Major", fontsize=14)
# plt.savefig("gender.jpg", dpi = 200)
# plt.show()

# count = 0
# labels = ["Employed", "Unemployed"]
# for i in range(4):
#     for j in range(4):
#         employment = [sum4[count], sum8[count]]
#         ax = plt.subplot2grid((4,4),(i,j))
#         ax.pie(employment, colors = ["lightsteelblue", "indianred"], autopct="%1.0f%%", labeldistance = 8)
#         ax.set_title(major_category1[count], size = 8, pad = 0, fontname = "serif")
#         ax.axis("equal")
#         count += 1
# plt.rc("font", family = "serif")
# plt.figlegend(labels, loc = 4, fontsize = 15)
# plt.suptitle("Employed vs. Unemployed in Each Major", fontsize=14)
# plt.savefig("employment.jpg", dpi = 200)
# plt.show()

# r1 = np.arange(len(major_category1))
# r2 = [major_category1 + .3 for major_category1 in r1]
# r3 = [major_category1 + .3 for major_category1 in r2]
# ax = plt.subplot()
# ax.bar(r1, sum5, width = .3, color = "lightsteelblue", align = "center", label = "Part Time")
# ax.bar(r2, sum6, width = .3, color = "indianred", align = "center", label = "Full Time", tick_label = major_category1)
# ax.bar(r3, sum7, width = .3, color = "lightgreen", align = "center", label = "Full Time Year Round")
# plt.xlabel("Major Category", fontname = "serif")
# plt.xticks(fontname = "serif", rotation = 90, size = 9)
# plt.ylabel("Number of Graduates", fontname = "serif")
# plt.title("Number of Graduates Employed Part Time and Full Time in Each Major", fontname = "serif")
# plt.rc("font", family="serif")
# plt.legend(loc = 1)
# plt.tight_layout()
# plt.savefig("time.jpg", dpi = 200)
# plt.show()

# r1 = np.arange(len(major_category1))
# r2 = [major_category1 + .3 for major_category1 in r1]
# r3 = [major_category1 + .3 for major_category1 in r2]
# ax = plt.subplot()
# ax.bar(r1, sum12, width = .3, color = "lightsteelblue", align = "center", label = "College Jobs")
# ax.bar(r2, sum13, width = .3, color = "indianred", align = "center", label = "Non College Jobs", tick_label = major_category1)
# ax.bar(r3, sum14, width = .3, color = "lightgreen", align = "center", label = "Low Wage Jobs")
# plt.xlabel("Major Category", fontname = "serif")
# plt.xticks(fontname = "serif", rotation = 90, size = 9)
# plt.ylabel("Number of Graduates", fontname = "serif")
# plt.title("Number of Graduates Employed in College Jobs, Non College Jobs, and Low Wage Jobs", fontname = "serif")
# plt.rc("font", family="serif")
# plt.legend(loc = 1)
# plt.tight_layout()
# plt.savefig("degree.jpg", dpi = 200)
# plt.show()

# plt.bar(major_category1, avg9, width = .4, color = "lightsteelblue", align = "center", tick_label = major_category1)
# plt.xlabel("Major Category", fontname = "serif")
# plt.xticks(fontname = "serif", rotation = 90, size = 9)
# plt.ylabel("Average Median Salary ($)", fontname = "serif")
# plt.title("Average Median Salaries in Each Major Category", fontname = "serif")
# plt.rc("font", family="serif")
# plt.tight_layout()
# plt.savefig("median.jpg", dpi = 200)
# plt.show()

# r1 = np.arange(len(major_category1))
# r2 = [major_category1 + .3 for major_category1 in r1]
# r3 = [major_category1 + .3 for major_category1 in r2]
# ax = plt.subplot()
# ax.bar(r1, avg9, width = .3, color = "lightsteelblue", align = "center", label = "Median Salary")
# ax.bar(r2, avg10, width = .3, color = "indianred", align = "center", label = "25th Percentile Salary", tick_label = major_category1)
# ax.bar(r3, avg11, width = .3, color = "lightgreen", align = "center", label = "75th Percentile Salary")
# plt.xlabel("Major Category", fontname = "serif")
# plt.xticks(fontname = "serif", rotation = 90, size = 9)
# plt.ylabel("Average Salary ($)", fontname = "serif")
# plt.title("Average Salaries in Each Major", fontname = "serif")
# plt.rc("font", family="serif")
# plt.legend(loc = 1)
# plt.tight_layout()
# plt.savefig("degree.jpg", dpi = 200)
# plt.show()



major_category_a = []
total_a = []
employed_a = []
unemployed_a =[]
median_a = []
p25_a = []
p75_a = []
sum_a1 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum_a2 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum_a3 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum_a4 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
counts_a4 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg_a4 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum_a5 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
counts_a5 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg_a5 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
sum_a6 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
counts_a6 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg_a6 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

with open ("Copy of all-ages - all-ages.csv", "r") as csvfile:
 plots = csv.reader(csvfile, delimiter = ",")
 next(plots)
 for row in plots:
     major_category_a.append(float(row[0]))
     total_a.append(float(row[1]))
     employed_a.append(float(row[2]))
     unemployed_a.append(float(row[3]))
     median_a.append(float(row[4]))
     p25_a.append(float(row[5]))
     p75_a.append(float(row[6]))
     sum_a1[int(row[0])] += float(row[1])
     sum_a2[int(row[0])] += float(row[2])
     sum_a3[int(row[0])] += float(row[3])
     sum_a4[int(row[0])] += float(row[4])
     counts_a4[int(row[0])] += 1
     sum_a5[int(row[0])] += float(row[5])
     counts_a5[int(row[0])] += 1
     sum_a6[int(row[0])] += float(row[6])
     counts_a6[int(row[0])] += 1

for i in range(len(sum_a1)):
    avg_a4[i] = sum_a4[i] / counts_a4[i]
for i in range(len(sum_a1)):
    avg_a5[i] = sum_a5[i] / counts_a5[i]
for i in range(len(sum_a1)):
    avg_a6[i] = sum_a6[i] / counts_a6[i]

# plt.bar(major_category1, sum_a1, width = 0.4, color = "royalblue", align = "center", tick_label = major_category1)
# plt.xlabel("Major Category", fontname = "serif")
# plt.xticks(fontname = "serif", rotation = 90, size = 9)
# ax = plt.gca()
# ax.yaxis.set_major_formatter(FormatStrFormatter('%.0f'))
# plt.ylabel("Number of Graduates", fontname = "serif")
# plt.title("Sample Size Used", fontname = "serif")
# plt.rc("font", family="serif")
# plt.tight_layout()
# plt.savefig("asamplesize.jpg", dpi = 200)
# plt.show()

# count = 0
# labels = ["Employed", "Unemployed"]
# for i in range(4):
#     for j in range(4):
#         employment = [sum_a2[count], sum_a3[count]]
#         ax = plt.subplot2grid((4,4),(i,j))
#         ax.pie(employment, colors = ["royalblue", "firebrick"], autopct="%1.0f%%", labeldistance = 8)
#         ax.set_title(major_category1[count], size = 8, pad = 0, fontname = "serif")
#         ax.axis("equal")
#         count += 1
# plt.rc("font", family = "serif")
# plt.figlegend(labels, loc = 4, fontsize = 15)
# plt.suptitle("Employed vs. Unemployed in Each Major", fontsize=14)
# plt.savefig("aemployment.jpg", dpi = 200)
# plt.show()

# plt.bar(major_category1, avg_a4, width = .4, color = "royalblue", align = "center", tick_label = major_category1)
# plt.xlabel("Major Category", fontname = "serif")
# plt.xticks(fontname = "serif", rotation = 90, size = 9)
# plt.ylabel("Average Median Salary ($)", fontname = "serif")
# plt.title("Average Median Salaries in Each Major Category", fontname = "serif")
# plt.rc("font", family="serif")
# plt.tight_layout()
# plt.savefig("amedian.jpg", dpi = 200)
# plt.show()

# r1 = np.arange(len(major_category1))
# r2 = [major_category1 + .3 for major_category1 in r1]
# r3 = [major_category1 + .3 for major_category1 in r2]
# ax = plt.subplot()
# ax.bar(r1, avg_a4, width = .3, color = "royalblue", align = "center", label = "Median Salary")
# ax.bar(r2, avg_a5, width = .3, color = "firebrick", align = "center", label = "25th Percentile Salary", tick_label = major_category1)
# ax.bar(r3, avg_a6, width = .3, color = "seagreen", align = "center", label = "75th Percentile Salary")
# plt.xlabel("Major Category", fontname = "serif")
# plt.xticks(fontname = "serif", rotation = 90, size = 9)
# plt.ylabel("Average Salary ($)", fontname = "serif")
# plt.title("Average Salaries in Each Major", fontname = "serif")
# plt.rc("font", family="serif")
# plt.legend(loc = 1, fontsize = 7)
# plt.tight_layout()
# plt.savefig("adegree.jpg", dpi = 200)
# plt.show()

print(np.corrcoef(np.array(part_time), np.array(full_time_year_round)))
print(np.corrcoef(np.array(part_time), np.array(full_time)))
print(np.corrcoef(np.array(college_jobs), np.array(non_college_jobs)))
print(np.corrcoef(np.array(non_college_jobs), np.array(low_wage_jobs)))





