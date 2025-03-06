numbers = tuple(input("Enter numbers: ").split(","))
for num in numbers:
    if (int(num)%5)==0:
        print("{} is divisible by 5".format(num))
    else:
         print("{} is not divisible by 5".format(num))
