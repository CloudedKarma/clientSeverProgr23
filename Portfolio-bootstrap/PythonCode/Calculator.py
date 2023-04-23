#
#Name: Kadin
#Date: 8/25/2025
#
# numb1 = int(input("Enter the first number: "))
# numb2 = int(input("Enter the second number : "))

# sum = numb1 + numb2
# print("The sum of the two numbers is", sum)
# sum = (6**3) + ((5/4)*8) - (10//3)
# print("The valuse of sum is", sum)
# sum = 6**3 + 5/4* 8 - 10//3
# print("The valuse of sum is", sum)
# \ goes to next line
# +\ adds the top row to the bottom
# *\ multipy
# Mass comit is CTRL + /


#payrate = 10
payrate = float(input("What is your hourly pay rate? "))
print("Your payrate is", payrate)
#You can set how much the pay rate is if you remove the above functions
hours = float(input("How many hours did you work this week? "))
print("You worked ", round(hours), "hours this week")
paycheck = payrate * hours
# print("Your pay check this week is $ ", paycheck)
# print("Your pay check this week is $ " + paycheck)
# can not merge the float
print("Your pay check this week is $ " + str(paycheck))
# converts the float to a string only on this line
paycheck = paycheck * 1.20
print("After 10% pay check this week is $ " + str(paycheck))

# import math
# # The whole math library
# print(pow(5,7))
# print(math.pow(5,7))
