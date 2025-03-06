numbers=list(input("Enter numbers: ").split(","))
sum=0
for num in numbers:
    sum=sum+int(num)
print("sum of entered numbers: {}".format(sum))