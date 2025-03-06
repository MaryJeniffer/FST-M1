	
numList = list(input("Enter numbers: ").split(","))
print("Given list is ", numList)

firstElement = numList[0]
lastElement = numList[-1]

if (firstElement == lastElement):
    print(True)
else:
    print(False)